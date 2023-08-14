// 다차원 배열의 선언과 생성. ppt.117-------------------------------------------------
import java.util.Scanner;
public class Class0512_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int[] num = new int[5];           //[1][3] => [1]은 생략가능해서 생략된것!
//		
//// 1차원배열--------------------------------------------------------		
//		for(int i=0;i<num.length;i++) {
//			System.out.println("점수를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//2차원 배열---------------------------------------------------------		
		int[][] score = new int[3][4];
		//1.입력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println("2차원 점수를 입력하세요");
				score[i][j] = scan.nextInt();
			}
		}
		//2.출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();   //여기다가공백을 넣어줘야 행대로 출력된다
		}
		
//-------------------------------------------------------------------		
		
		
		
		
		
		
		
	}

}
