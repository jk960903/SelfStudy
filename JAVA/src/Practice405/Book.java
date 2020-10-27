package Practice405;

public class Book {
	String title;
	String author;
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Book(String title) {
		this.title=title; author="작자미상";
	}
	public Book(String title, String author) {
		this.title=title; this.author=author;
	}
	void show() {
		System.out.println(this.title+" "+this.author);
	}
	public static void main(String[] args) {
		System.out.println("2015152030 이준규");
		Book littlePrince=new Book("어린왕자","생텍쥐페리");
		Book loveStory=new Book("춘향전");
		Book emptyBook=new Book();
		loveStory.show();
		littlePrince.show();
	}
}
