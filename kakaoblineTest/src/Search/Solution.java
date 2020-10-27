package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//CompartoIgnoreCase 를 통해 대소문자 무시
public class Solution {
	public int solution(String word, String[] pages) {
        int answer = 0;
        ArrayList<Page> pagelist=new ArrayList<Page>();
        for(int i=0; i<pages.length; i++) {
        	String temp=pages[i].toLowerCase();
        	String url=getUrlName(temp);
        	int normalpoint=getWordTime(temp,word);
        	String[] linkpages=getLinks(temp);
        	Page page=new Page(i,url,normalpoint,linkpages);
        	pagelist.add(page);
        }
        List<Page> findPage=new ArrayList<>();
        for(int i=0; i<pages.length; i++) {
        	String url=getUrlName(pages[i]);
        	Page p=pagelist.get(i);
        	double total=p.point;
        	for(int j=0; j<pages.length; j++) {
        		if(i!=j) {
        			total=total+pagelist.get(j).getLinkPoint(url);
        		}
        	}
        	p.total=total;
        	findPage.add(p);
        }
        Collections.sort(findPage);
        
        return findPage.get(0).index;
    }
	public String getUrlName(String page) {
		String URL="<meta property=\"og:url\" content=\"";
		int urlStart=page.indexOf(URL)+URL.length();
		int urlend=page.indexOf("\"",urlStart);
		return page.substring(urlStart,urlend);
	}
	public int getWordTime(String page,String word) {
		page=page.substring(page.indexOf("<body>"),page.indexOf("</body>"));
		word=word.toLowerCase();
		int time=0;
		int startindex=0;
		while(startindex<page.length()) {
			startindex=page.indexOf(word,startindex+1);
			if(startindex==-1) {
				break;
			}
			if(!Character.isLetter(page.charAt(startindex-1))&&!Character.isLetter(page.charAt(startindex+word.length()))){
				time++;
				startindex=startindex+word.length();
			}
		}
		return time;
	}
	public String[] getLinks(String page) {
		String link="<a href=\"";
		String temp=page;
		ArrayList<String> list=new ArrayList<>();
		while(temp.contains(link)) {
			int indexStart=temp.indexOf(link)+link.length();
			int indexEnd=temp.indexOf("\"",indexStart);
			list.add(temp.substring(indexStart,indexEnd));
			temp=temp.substring(indexEnd,page.length()-1);
		}
		return list.toArray(new String[list.size()]);
	}
	private class Page implements Comparable<Page>{
		int index;
		String url;
		double point;
		double linkPoint;
		double total;
		String[] Linkpage;
		private Page(int i,String url,double point,String[] linkpage) {
			index=i;
			this.url=url;
			this.point=point;
			this.Linkpage=linkpage;
			if(linkpage==null) {
				this.linkPoint=0;
			}
			else if(linkpage!=null) {
				this.linkPoint=point/linkpage.length;
			}
		}
		public  double getLinkPoint(String url) {
			for(String p:Linkpage) {
				if(p.contentEquals(url)) {
					return linkPoint;
				}
			}
			return 0;
		}
		@Override
		public int compareTo(Page p) {
			if(this.total>p.total) {
				return -1;
			}else if(this.total<p.total) {
				return 1;
			}else {
				return this.index-p.index;
			}
		}
		
	}
}
