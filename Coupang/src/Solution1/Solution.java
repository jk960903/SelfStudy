package Solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Solution {
	public static void main(String[] args) {
		int answer=0;
		int n=2;
		String[] customers= {"02/28 23:59:00 03","03/01 00:00:00 02", "03/01 00:05:00 01"};
		
		int[] kiosktime=new int[n];
		HashMap<Integer,Integer> map=new HashMap<>();
		int min=210000000;
		int minindex=0;
		for(int i=0; i<n; i++) {
			map.put(i,1);
		}
		for(int i=0; i<n; i++) {
			String[] custom=customers[i].split(" ");
			String[] time=custom[1].split(":");
			String[] day=custom[0].split("/");
			int come=Integer.parseInt(time[2])+Integer.parseInt(time[1])*60+Integer.parseInt(time[0])*3600;
			come=come+(Integer.parseInt(day[1])-1)*3600*24;
			come=come+(Integer.parseInt(day[0])-1)*3600*24*30;
			int end=come+(Integer.parseInt(custom[2])*60);
			kiosktime[i]=end;
			if(min>kiosktime[i]) {
				min=end;
				minindex=i;
			}
		}

		for(int i=n; i<customers.length; i++) {
			String[] custom=customers[i].split(" ");
			String[] time=custom[1].split(":");
			String[] day=custom[0].split("/");
			int come=Integer.parseInt(time[2])+Integer.parseInt(time[1])*60+Integer.parseInt(time[0])*3600;
			come=come+(Integer.parseInt(day[1])-1)*3600*24;
			come=come+(Integer.parseInt(day[0])-1)*3600*24*30;
			int end=0;
			if(come>=min) {
				int[] notusetime=new int[n];
				int maxtime=0;
				int maxindex=0;
				for(int j=0; j<n; j++) {
					if(come>=kiosktime[j]) {
						notusetime[j]=come-kiosktime[j];
						if(notusetime[j]>maxtime) {
							maxtime=notusetime[j];
							maxindex=j;
						}
					}
				}
				map.put(maxindex,map.get(maxindex)+1);
				kiosktime[maxindex]=come+Integer.parseInt(custom[2])*60;
				min=210000000;
				for(int j=0; j<n; j++) {
					if(kiosktime[j]<min) {
						min=kiosktime[j];
						minindex=j;
					}
				}
			}else {
					end=kiosktime[minindex]+Integer.parseInt(custom[2])*60;
					kiosktime[minindex]=end;
					map.put(minindex,map.get(minindex)+1);
					min=210000000;
					for(int j=0; j<n; j++) {
						if(min>kiosktime[j]) {
							min=kiosktime[j];
							minindex=j;
						}
					}
			}
		}
		int max=0;
		for(int i=0; i<n; i++) {
			if(map.get(i)>max) {
				max=map.get(i);
			}
		}
		answer=max;
		System.out.println(max);
	}
}

