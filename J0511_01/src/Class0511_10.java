import java.util.Scanner;

public class Class0511_10 {

	public static void main(String[] args) {
//		//성적처리 프로그램
//		//1.이름 2.국어 3. 영어 4.수학 : 합계, 평균 자동으로 들어갈 수 있도록 함
//		String name = "";
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int total = 0;
//		double avg = 0;
//		Scanner scan = new Scanner(System.in);
//		
//		
//		//자동 계산
//		total = kor + eng + math;
//		avg = total / 3.0;
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("이름을 입력하세용");
//			name = scan.next();
//			System.out.println("국어점수을 입력하세용");
//			kor = scan.nextInt();
//			System.out.println("영어점수을 입력하세용");
//			eng = scan.nextInt();
//			System.out.println("수학점수을 입력하세용");
//			math = scan.nextInt();
//			
//			//출력
//			System.out.println("[No."+ (i+1) +" 학생]");
//			System.out.println();
//			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
//			System.out.println("-----------------------------------------");
//			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, total, avg);
//			System.out.println();
//		}
//		
// --------------------------------------------------------------------------------------------		
		//성적처리 프로그램
		//1.이름 2.국어 3. 영어 4.수학 : 합계, 평균 자동으로 들어갈 수 있도록 함
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세용");
			name[i] = scan.next();
			System.out.println("국어점수을 입력하세용");
			kor[i] = scan.nextInt();
			System.out.println("영어점수을 입력하세용");
			eng[i] = scan.nextInt();
			System.out.println("수학점수을 입력하세용");
			math[i] = scan.nextInt();
			System.out.println("-----------------");
			
			//자동 계산
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;

		}//for
		
		for(int i=0;i<name.length;i++) {
			//출력
			System.out.println("[No."+ (i+1) +" 학생]");
			System.out.println();
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
			System.out.println("-----------------------------------------");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
			System.out.println();
	
			}//for
	}

}
