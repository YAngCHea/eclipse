//어제 한 성적입력 프로그램 시험보기-----------------------------
import java.util.Scanner;

public class Class0512_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//[성적입력 프로그램]
		//1.성적을 입력하세요
		//2.성적을 출력합니다
		//0.종료합니다
		//-------------------
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] math = new int[5];
		int[] eng = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		int input = 0;
		int count = 0;
		

		loop : while(true) {
			System.out.println("[성적입력 프로그램]");
			System.out.println("1.성적을 입력하세요");
			System.out.println("2.성적을 출력합니다");
			System.out.println("0.종료합니다");
			System.out.println("----------------------");
			input = scan.nextInt();
			
			
			//조건문
			switch(input) {
			
			case 1 : //성적입력
				for (int i=count;i<name.length;i++) {
					if(i>name.length) break;
					
					System.out.println("[" + (i+1) + "번째 학생]");
					System.out.println("이름을 입력하세요]");
					name[i] = scan.next();
					
				if (name[i].equals("0")) break;
					
					System.out.println("국어점수를 입력하세요");
					kor[i] = scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					math[i] = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng[i] = scan.nextInt();
					System.out.println();
					total[i] = kor[i] + math[i] + eng[i];
					avg[i] = total[i] / 3.0;
					count++;
					
				}//for
			
			case 2 ://성적출력
				System.out.println("2.성적을 출력합니다.");
				System.out.println("이름\t국어\t수학\t영어\t합계\t평균");
				for(int i=0;i<name.length;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], math[i], eng[i], total[i], avg[i]);				
					System.out.println();
				}//for
			case 0 ://종료
				System.out.println("프로그램을 종료합니다");
				System.out.println("___________________________");
				break loop;
				
			}//switch

		}//while

	}

}
