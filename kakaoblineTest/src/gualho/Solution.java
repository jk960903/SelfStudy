package gualho;

/*1. �Է��� �� ���ڿ��� ���, �� ���ڿ��� ��ȯ�մϴ�. 
2. ���ڿ� w�� �� "�������� ��ȣ ���ڿ�" u, v�� �и��մϴ�. ��, u�� "�������� ��ȣ ���ڿ�"�� �� �̻� �и��� �� ����� �ϸ�, v�� �� ���ڿ��� �� �� �ֽ��ϴ�. 
3. ���ڿ� u�� "�ùٸ� ��ȣ ���ڿ�" �̶�� ���ڿ� v�� ���� 1�ܰ���� �ٽ� �����մϴ�. 
  3-1. ������ ��� ���ڿ��� u�� �̾� ���� �� ��ȯ�մϴ�. 
4. ���ڿ� u�� "�ùٸ� ��ȣ ���ڿ�"�� �ƴ϶�� �Ʒ� ������ �����մϴ�. 
  4-1. �� ���ڿ��� ù ��° ���ڷ� '('�� ���Դϴ�. 
  4-2. ���ڿ� v�� ���� 1�ܰ���� ��������� ������ ��� ���ڿ��� �̾� ���Դϴ�. 
  4-3. ')'�� �ٽ� ���Դϴ�. 
  4-4. u�� ù ��°�� ������ ���ڸ� �����ϰ�, ������ ���ڿ��� ��ȣ ������ ����� �ڿ� ���Դϴ�. 
  4-5. ������ ���ڿ��� ��ȯ�մϴ�.*/
public class Solution {
	public static void main(String[] args) {
		System.out.print(solution("()))((()"));
		
	}
	public static String solution(String p) {
        String answer = "";
        if(balance(p)) return p;
        else return Convert(p);

    }
	public static boolean balance(String p) {
		char[] temp=p.toCharArray();
		int tempindex=0;
		for(int i=0; i<temp.length; i++) {
			if(tempindex<0) return false;
			if(temp[i]=='(') tempindex++;
			else if(temp[i]==')') tempindex--;
		}
		return true;
	}
	public static String Convert(String p) {
		if(p.equals("")) return "";
		String u=FindComplete(p);
		String v=p.substring(u.length());
		StringBuilder sb=new StringBuilder();
		if(balance(u)) {//v������ �ٽ� 1�ܰ���� ����
			sb.append(u);
			sb.append(Convert(v));
			return sb.toString();
		}
		else {
			sb.append('(');
			sb.append(Convert(v));
			sb.append(')');
			sb.append(RemoveAndReverse(u));
			return sb.toString();
		}
		
	}
	public static String FindComplete(String p) {
		StringBuilder sb=new StringBuilder();
		int tempindex=0;
		for(int i=0; i<p.length(); i++) {
			char temp=p.charAt(i);
			if(temp=='(') tempindex++;
			else tempindex--;
			sb.append(temp);
			if(i>=1 && tempindex==0) return sb.toString();
		}
		return sb.toString();
	}
	public static String RemoveAndReverse(String p) {
		StringBuilder sb=new StringBuilder();
		String cut=p.substring(1,p.length()-1);
		for(int i=0; i<cut.length(); i++) {
			char temp=cut.charAt(i);
			if(temp=='(') sb.append(')');
			else sb.append('(');
		}
		return sb.toString();
	}
	
}
