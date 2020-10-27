package practice318;

public class NumException {
	public static void main(String[] args) {
		String[] array= {"23","12","3.141592","998"};
		int i=0;
		
		for(i=0; i<array.length; i++) {
			try {
				int j=Integer.parseInt(array[i]);
				System.out.println("숫자로 변환된 값은 "+ j);
			}catch(NumberFormatException e) {
				System.out.println(array[i]+"는 정수로 변환 할 수 없습니다.");
			}
		}
	}
}

