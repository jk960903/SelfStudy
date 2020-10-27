package Practice407;

import java.util.Scanner;

class Book{
	String title;
	String author;
	public Book(String title, String author) {
		this.title=title; this.author=author;
	}
	void show() {
		System.out.println(this.title+" "+this.author);
	}
}

public class BookArray {
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Scanner scan=new Scanner(System.in);
		Book[] book=new Book[2];
		
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title=scan.nextLine();
			System.out.print("저자>>");
			String author=scan.nextLine();
			book[i]=new Book(title,author);
			book[i].show();
			
		}
		scan.close();
	}
}
