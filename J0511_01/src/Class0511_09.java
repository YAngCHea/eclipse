// 배열 문제풀기------------------

import java.util.Scanner;

public class Class0511_09 {

	public static void main(String[] args) {
		// 랜덤 숫자 맞추기
		// 10번의 기회를 주고, 정답확인시 입력한 번호를 출력해보세요.

		int input = 0; // 입력받을 숫자
		int random = 0; // 랜덤숫자
//		int count = 0;              //도전한 횟수
		int num[] = new int[10]; // 입력한 숫자를 저장하는 공간

		Scanner scan = new Scanner(System.in);

		random = (int) (Math.random() * 100) + 1;
		System.out.println("랜덤숫자가 생성되었습니다");
		System.out.println(random);

		int count = 0;
		while (true) { // 무한반복
			if (count > 9) { // 열번넘으면 종료
				System.out.println("10번 도전했습니다. 이제 그만~");
				break;
			}
			// 도전번호 입력하기
			System.out.println((count + 1) + "번째 도전!");
			System.out.println("숫자를 입력해주세요 >>");

			num[count] = scan.nextInt(); // 입력받기

			if (num[count] == random) {
				System.out.println("정답입니다.");
				System.out.println();
				break;
			} else {
				System.out.println("오답입니다. 다시 도전하세요");
				System.out.println();
			}
			count++;

		} // while

		// 입력한 숫자 출력하기
		System.out.println("정답 : " + random);
		System.out.println("입력한 숫자 : ");
		for (int i = 0; i < count; i++) {
			if (i == 0) {
				System.out.println(num[i]);
			} else {
				System.out.println("," + num[i]);
			}
		} // for

	}

}
