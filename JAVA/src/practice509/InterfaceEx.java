package practice509;

public class InterfaceEx {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		SmartPhone phone=new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ�"+phone.calculate(3, 5));
		phone.schedule();
	}
}
