package practice509;

class SmartPhone extends PAD implements MobilePhoneInterface,MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�Ծ��");
	}
	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��");
	}
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���� �ߴ��մϴ�");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}

