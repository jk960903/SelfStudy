package Stones;

public class Main {
	public static void main(String[] args) {
		int[] stones= {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
		int human=3;
		int result=solution(stones,human);
		System.out.println(result);
	}
	public static int solution(int[] stones,int k) {
		int answer=0;
		boolean finish=false;
		while(true) {
			int temp=0;
			for(int i=0; i<stones.length; i++) {
				if(stones[i]==0) {
					temp++;

				}
				else {
					stones[i]=stones[i]-1;
					temp=0;
				}
				if(temp==k) {
					finish=true;
					break;
				}
			}
			if(finish) {
				break;
			}
			else {
				answer++;
			}
			
		}
		return answer;
	}
}
