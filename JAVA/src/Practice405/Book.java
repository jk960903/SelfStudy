package Practice405;

public class Book {
	String title;
	String author;
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book(String title) {
		this.title=title; author="���ڹ̻�";
	}
	public Book(String title, String author) {
		this.title=title; this.author=author;
	}
	void show() {
		System.out.println(this.title+" "+this.author);
	}
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		Book littlePrince=new Book("�����","�������丮");
		Book loveStory=new Book("������");
		Book emptyBook=new Book();
		loveStory.show();
		littlePrince.show();
	}
}
