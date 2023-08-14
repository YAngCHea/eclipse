
import java.util.Scanner;

public class Class0511_06 {

	public static void main(String[] args) {
// 예제문제------------------------------------------------------------
		// 1.랜덤숫자 생성
		// 2.숫자맞추기 10까지 사용할 수 있도록
		// 0.종료

		// 숫자맞추기 프로그램
		Scanner scan = new Scanner(System.in);
		int random = 0, input = 0, num = 0, count=1;

		loop: while (true) {
			System.out.println("[숫자맞추기 프로그램]");
			System.out.println("1.랜덤숫자 생성");
			System.out.println("2. 숫자맞추기 게임");
			System.out.println("종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력하세욥");
			input = scan.nextInt();

			switch (input) {
			case 1:
				random = (int) (Math.random() * 100) + 1;
				System.out.println("랜덤숫자 : " + random);
				System.out.println("랜덤 숫자가 생성되었습니다 \n");
				break;
			case 2:

				while (true) {
					if (count>3) {                             //3번 도전하고는 정답을 주고 나가기
						System.out.println("3번 도전했습니다");
						System.out.println("정답 : " + random);
						break;
					}
					System.out.printf("1~100 중 숫자를 입력해주세요(%d번째 도전) \n", count);

					input = scan.nextInt();

					if (random == input) {
						System.out.println("정답입니다.");
						System.out.println("_______________");
						break;
					} else {
						System.out.println("오답입니다.");
						System.out.println("_______________");
					}
					count++;

				} // while

				break;

			}// switch

		} // while

	}// main

}// class
