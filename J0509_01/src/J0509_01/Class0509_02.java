package J0509_01;

//어제꺼 복습2!!

public class Class0509_02 {

	public static void main(String[] args) {
		
		int kor = 100;
		int eng = 90;
		int math = 89;
		int total = kor + eng + math;
		double avg = total/3.0;
		System.out.println("------------------------------------");
		System.out.println("국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%.1f",kor,eng,math,total,avg);
	}
	
}
