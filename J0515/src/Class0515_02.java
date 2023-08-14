
//---로또프로그램 복습하기----------------------------------------------
import java.util.Scanner;

public class Class0515_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 상자속에 10개중에 보물(1)이 3개 나머지 (0)7개
		String[] arr = new String[10];
		int random = 0; //
		int temp = 0;
		int input = 0; // 입력받을곳

//		int[] box = new int[10];
		int[] box = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 }; // 1.10개니까 그냥 이런식으로 넣어도 되고

//		for(int i=0;i<10;i++) {                //2.이런식으로 해도 된다
//			if(i<7) {
//				box[i] = 0;
//			}else {
//				box[i] = 1;
//			}
//		}

		// box[i] 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(box[i] + "\t");
		}
		System.out.println();

		// box[i]섞기

		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10);

			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}

		for (int i = 0; i < 10; i++) {
			arr[i] = "?";
		}

////-----이 안의 것을 while안에 넣기------------------------------------------------------------------------------------------
//		//기본 출력화면 지정하기
//		System.out.println("보물찾기 프로그램");    
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//		}
//		System.out.println("--------------------------------------------------------------");
//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i] + "\t");
//		}
//		
//		//번호 입력하기
//		int input = 0;        //입력받을곳
//		System.out.println();
//		System.out.println("번호를 입력해 주세요 >>");
//		input = scan.nextInt();
//		
//		//box의 입력받은 번호 방에 뭐가 들어있는지 확인하기 : 보물인지 아닌지 확인하기
//		if (box[input] == 1)
//			arr[input] = "보물";       //한줄이라서 {}안넣어도 돌아간다
//		else
//			arr[input] = "꽝";
////-----이 안의 것을 while안에 넣기------------------------------------------------------------------------------------------

		while (true) {
			// 기본 출력화면 지정하기
			System.out.println("보물찾기 프로그램");
			for (int i = 0; i < 10; i++) {
				System.out.print((i+1) + "\t");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();

			// 번호 입력하기
			System.out.println();
			System.out.println("번호를 입력해 주세요 >>");
			input = scan.nextInt();

			// box의 입력받은 번호 방에 뭐가 들어있는지 확인하기 : 보물인지 아닌지 확인하기
			if (box[input] == 1)
				arr[input] = "보물"; // 한줄이라서 {}안넣어도 돌아간다
			else
				arr[input] = "꽝";
		}

	}// main

}
