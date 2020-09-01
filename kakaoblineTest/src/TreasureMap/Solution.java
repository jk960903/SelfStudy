package TreasureMap;
public class Solution {
	public static void main(String[] args) {
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		String[] temp=solution(5,arr1,arr2);
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] temp1= new String[arr1.length];
        String[] temp2=new String[arr2.length];
        for(int i=0; i<arr1.length; i++) {
        	temp1[i]=Integer.toBinaryString(arr1[i]);
        	temp2[i]=Integer.toBinaryString(arr2[i]);
        	int templen1=temp1[i].length();
        	if(temp1[i].length()<n) {
        		for(int j=0; j<n-templen1; j++) {
        			temp1[i]="0"+temp1[i];
        		}
        	}
        	int templen=temp2[i].length();
        	if(temp2[i].length()<n) {
        		for(int j=0; j<n-templen; j++) {
        			temp2[i]="0"+temp2[i];
        		}
        	}
        	char[] temparray1=temp1[i].toCharArray();
        	char[] temparray2=temp2[i].toCharArray();
        	char[] tempresult=new char[n];	
        	for(int j=0; j<temparray1.length; j++) {
        		if(temparray1[j]=='1'||temparray2[j]=='1') {
        			tempresult[j]='#';
        		}else {
        			tempresult[j]='0';
        		}
        		if(j==0) {
        			answer[i]=""+tempresult[j];
        		}
        		else {
        			answer[i]=answer[i]+tempresult[j];
        		}
        	}
        	
        	
        }
        return answer;
    }
}
