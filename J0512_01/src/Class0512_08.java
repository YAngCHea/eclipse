import java.util.Scanner;

//--배운거 복습----------------------------------------------------------

public class Class0512_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 국어 영어 수학 합계 / 5명 점수

		String[] name = new String[5];
		double[][] score = new double[5][5];
		
//		int[] total = new int[4];
//		double[] avg = new double[4];

		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균" };

		// 1.입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 학생입니다");
//			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			
			for (int j = 0; j < score[i].length - 2; j++) {
				System.out.println(title[j+1] + "점수를 입력하세요");
				score[i][j] = scan.nextInt();

			}
			score[i][3] = score[i][0] + score[i][1] + score[i][2];  //합계
			score[i][4] = score[i][3] / 3.0; //평균
		}

		// 2.출력
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}//for

	}

}
