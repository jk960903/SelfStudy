package Practice609;

import java.util.StringTokenizer;
import java.util.Scanner;
public class StringTokenizeEx {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		System.out.print("날짜를 입력하시요(YYYY/MM/DD 형태");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		if(input.equals("2020/10/29")) {
			StringTokenizer st=new StringTokenizer(input,"/");
			String[] day=new String[3];
			int index=0;
			while(st.hasMoreTokens()) {
				day[index]=st.nextToken();
				index++;
			}
			System.out.println(day[0]+"년 "+day[1]+"월 "+day[2]+"일");
		}
		
	}
}
