
//로또 프로그램 만들기 / ppt.115-------------------------------------------------
import java.util.Scanner;

public class Class0512_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 로또 프로그램 만들기
		// 1.배열생성
		int[] lotto = new int[45];// 로또번호
		int random = 0; // 랜덤변수
		int temp = 0; // 임시저장변수
		int[] mynum = new int[6];// 내가 예측한 번호
		int count = 0;
		int[] lottonum = new int[6]; // 내가 입력한 번호 중 당첨된 번호

		// 2.로또 번호 입력
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1; // 1,2,3,4,5,6.....45 : 중복되지 않는 애들
//			lotto[i] = (int)(Math.random() * 45)+1;   //이런식으로 넣으면 중복숫자가 생긴다
		} // for

//		for (int i=0;i<45;i++) {
//			System.out.println(lotto[i]);
//		}//for


		// 2-2.번호 섞기 : 중복없이!!
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45); // 0-44 랜덤번호

			// 섞기
			temp = lotto[0]; // 이 부분이 헷갈리면 앞에오는 거 자리에 뒤에오는거 값을 넣는다 로 읽으면 쉬움
			lotto[0] = lotto[random];
			lotto[random] = temp;

		} // for

		// 3.로또번호 입력하기
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 " + "로또번호를 입력하세요");
			mynum[i] = scan.nextInt();
		}
		
		
		
		// 4.입력한 숫자와 랜덤숫자 비교하기 : 로또번호 확인
		for (int i = 0; i < 6; i++) {// lotto배열
			for (int j = 0; j < 6; j++) {// mynum배열
				if (mynum[j] == lotto[i]) { // mynum과 lotto배열 비교
					lottonum[count] = lotto[i]; // 당첨된 번호 따로 저장
					count++; // 당첨개수 증가
					continue; // 다 빠져나오면 안되니까! 그 판만 빠져나온다.
				} // if
			} // for-j
		} // for-i

		// 5.당첨번호출력
		System.out.println("로또번호 자동생성 : ");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + " ");
		}

		System.out.println();

		System.out.println("당첨번호 : ");
		for (int i = 0; i < count; i++) {
			System.out.println(lottonum[i] + " ");
		}
		
		//당첨개수
		System.out.println("당첨 개수 : "+count);

	}// main
}// class
