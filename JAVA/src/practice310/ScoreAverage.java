package practice310;

public class ScoreAverage {
	public static void main(String[] args) {
		System.out.println("2015152030 ���ر�");
		double[][] score= {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		double sum=0;
		for(int i=0; i<score.length; i++) {
			double gradescore=0;
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
			}
			System.out.println((i+1)+"�г� ����: "+score[i][0]+" "+score[i][1]);
		}
		System.out.println("4�� ��ü ������ ����� "+sum/(score.length*score[0].length));
		
		
	}
}
