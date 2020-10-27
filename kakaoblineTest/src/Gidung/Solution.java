package Gidung;

import java.util.LinkedList;

public class Solution {
	public int[][] solution(int n, int[][] build_frame) {
        int[][] answer = {};
        int[][] array=new int[n][n+1];
        LinkedList<result> list=new LinkedList<>();
        for(int i=0; i<build_frame.length; i++) {
        	if(build_frame[i][2]==0) {//기둥
        		if(build_frame[i][3]==0) {//설치
        			if(CanOrder(array,build_frame[i])) {
        				list.add(new result(build_frame[i][0],build_frame[i][1],1));
        			}
        		}
        		else {//삭제
        			
        		}
        	}else {//보
        		
        	}
        }
        return answer;
    }
	public boolean CanOrder(int[][] array,int[] order) {
		
	}
	public class result implements Comparable<result>{
		int x;
		int y;
		int type;
		
		public result(int x,int y, int type) {
			this.x=x;
			this.y=y;
			this.type=type;
		}

		@Override
		public int compareTo(result o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
