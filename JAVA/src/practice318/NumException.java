package practice318;

public class NumException {
	public static void main(String[] args) {
		String[] array= {"23","12","3.141592","998"};
		int i=0;
		
		for(i=0; i<array.length; i++) {
			try {
				int j=Integer.parseInt(array[i]);
				System.out.println("���ڷ� ��ȯ�� ���� "+ j);
			}catch(NumberFormatException e) {
				System.out.println(array[i]+"�� ������ ��ȯ �� �� �����ϴ�.");
			}
		}
	}
}

