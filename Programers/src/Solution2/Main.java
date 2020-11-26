package Solution2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//String temp=solution("ab","ab",-3);
		int[][] delvery= {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};
		String temp=solution(7,delvery);
		System.out.println(temp);
	}
	 public static String solution(String encrypted_text, String key, int rotation) {
	        String answer = "";
	       
	        if(rotation<0) {
	        	rotation=Math.abs(rotation)%encrypted_text.length();
	        	String temps=encrypted_text.substring(encrypted_text.length()-rotation);
	        	encrypted_text=encrypted_text.substring(0,encrypted_text.length()-rotation);
	        	encrypted_text=temps+encrypted_text;
	        }else {
		        rotation=rotation%encrypted_text.length();
	        	String temps=encrypted_text.substring(0,rotation);
	        	encrypted_text=encrypted_text.substring(rotation);
	        	encrypted_text=encrypted_text+temps;
	        }
	        char[] encrypted=encrypted_text.toCharArray();
	        char[] tempkey=key.toCharArray();
	        int[] keyvalue=new int[tempkey.length];
	        for(int i=0; i<tempkey.length; i++) {
	        	keyvalue[i]=tempkey[i]-'a'+1;
	        }
	        for(int i=0; i<encrypted.length; i++) {
	        	char tempchar=(char)(encrypted[i]-keyvalue[i]);
	        	if(tempchar<'a') {
	        		int gap='a'-tempchar;
	        		tempchar=(char)('z'-gap+1);
	        	}
	        	answer=answer+tempchar;
	        }
	        return answer;
	 }
	
		    public static String solution(int n, int[][] delivery) {
		        String answer = "";
		        int[] check=new int[n];
		        	for(int j=0; j<n; j++) {
		        		for(int i=0; i<delivery.length; i++){
				            int x=delivery[i][0];
				            int y=delivery[i][1];
				            if(delivery[i][2]==1){
				                check[x-1]=1;
				                check[y-1]=1;
				            }else{
				                if(check[x-1]==1&&check[y-1]<=00){
				                    check[y-1]=-1;
				                }else if(check[x-1]<=0&&check[y-1]==1){
				                    check[x-1]=-1;
				                }else if(check[x-1]==-1&&check[y-1]==0) {
				                	check[y-1]=-2;
				                }else if(check[x-1]==0&&check[y-1]==-1) {
				                	check[x-1]=-2;
				                }
				                }
				            }
		        }
		            
		            
		        
		        for(int i=0; i<n; i++){
		            if(check[i]==1){
		                answer=answer+'o';
		            }else if(check[i]==-1){
		                answer=answer+'x';
		            }else{
		                answer=answer+'?';
		            }
		        }
		        return answer;
		    }
		
}
