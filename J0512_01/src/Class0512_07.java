
import java.util.Scanner;

public class Class0512_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3]; // 5명의 국어 영어 수학 성적
		String[] title = {"국어","영어","수학"};

		// 1.입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생입니다");
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(title[j] + "점수를 입력하세요");
				score[i][j] = scan.nextInt();
			}
		}

		// 2.출력
		System.out.println("국어\t영어\t수학");
		System.out.println("------------------------------");
		for (int i = 0; i < score[i].length; i++) {
			for (int j = 0; j < score.length; j++) {
				System.out.println(score[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
