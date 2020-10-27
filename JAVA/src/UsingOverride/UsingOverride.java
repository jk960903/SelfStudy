package UsingOverride;
import java.util.Scanner;
public class UsingOverride {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		Shape start = null,last=null,obj = null;
		for(int i=0; i<4; i++) {
			int input=scan.nextInt();
			if(input==1) {
				obj=new Line();
			}else if(input==2) {
				obj=new Circle();
			}else if(input==3) {
				obj=new Rect();
			}else {
				i--;
				System.out.println("다시 입력하시오");
				continue;
			}
			if(i==0) {
				start=obj;
				last=start;
			}else {
				last.next=obj;
				last=obj;
			}
		}
		Shape p=start;
		while(p!=null) {
			p.draw();
			p=p.next;
		}
		
	}
}
