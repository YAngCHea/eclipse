
//어제 했던 구구단 출력하기
import java.util.Scanner;

public class Class0511_02 {

	public static void main(String[] args) {
//---구구단 출력하기--------------------------------------------
		// 1 * 1 = 1 형태로 출력하기
		int num1 = 0;
		int num2 = 0;
		char x = '*';

		for (int i = 1; i < 10; i++) {
			System.out.print("[" + i + "단입니다]\t"); // 얘를 for문을 따로 돌려야 나온다
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d = %d \t", j, i, (i * j));
			}
			System.out.println();
		}

	}

}
