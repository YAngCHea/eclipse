//ppt.104 continue문

import java.util.Scanner;

public class Class0511_05 {

	public static void main(String[] args) {
//		for (int i =0;i<=10;i++) {
//			if(i%2!=0) {         //짝수만 출력
//				continue;       //얘를 만나면 이 조건에 만족하는건 출력안하고 돌아간다(반복)
//			}
//			System.out.println(i);
//		}//for
////---------------------------------------------------------------
//		for (int i =0;i<=10;i++) {
//			if(i==5) {         
//				continue;          //5만 빼고 출력한다
//			}
//			System.out.println(i);
//		}//for
////---------------------------------------------------------------
//		// 연습문제 : 구구단을 찍는데 5단빼고 출력해용
//		for (int i = 1; i < 10; i++) {
//			if (i == 5) {
//				continue;
//			}
//			System.out.println("[" + i + "단입니다]");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, (i * j));
//			}
//			System.out.println();
//		}
////---------------------------------------------------------------
//		// 연습문제 : 구구단을 찍는데 짝수단만 출력해용
//		for (int i = 1; i < 10; i++) {
//			if (i%2 == 1) {              //=(i%2 != 0)
//				continue;
//			}//if
//			System.out.println("[" + i + "단입니다]");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, (i * j));
//			}//for2
//			System.out.println();
//		}//for1
//
//		
//		
//		
//		
//		
//		
//		
////-------------------------------------------------------------------------		
//		// ppt.105 이름 붙은 반복문과 break
//		// 연습문제 : 구구단을 찍는데 5단빼고 출력해용
//		loop: for (int i = 1; i < 10; i++) {            //여기에서 빠져나온다
//			// if (i == 5) break;
//			System.out.println("[" + i + "단입니다]");
//			for (int j = 1; j < 10; j++) {
//				if (j == 6)
//					break loop;               //이렇게 break에다 이름을 붙이면 
//				System.out.printf("%d * %d = %d \n", i, j, (i * j));
//			}
//			System.out.println();
//		}
////-------------------------------------------------------------------
//		int input = 0, num1 = 0, num2 = 0, sum = 0;
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {                               //무한반복
//			System.out.println("1.더하기");
//			System.out.println("2.곱하기");
//			System.out.println("0.종료");
//			System.out.println("--------------");
//			System.out.println("원하는 번호를 입력하세욥");
//			input = scan.nextInt();
//			if(input==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}//if
//			
//			//조건문
//			switch(input) {
//			case 1:
//				while(true) {		                          //종료할때까지 계속 반복함	
//					
//					System.out.println("첫번째 숫자를 입력하세요.");
//					num1 = scan.nextInt();
//					System.out.println("두번째 숫자를 입력하세요");
//					num2 = scan.nextInt();
//					System.out.printf("결과 : %d + %d = %d \n", num1, num2, (num1+num2));
//				}//while
//			}//switch
//	
//		}//while
//-------------------------------------------------------------------------		
		int input = 0, num1 = 0, num2 = 0, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		loop : while(true) {                               //무한반복
			System.out.println("1.더하기");
			System.out.println("2.곱하기");
			System.out.println("0.종료");
			System.out.println("--------------");
			System.out.println("원하는 번호를 입력하세욥");
			input = scan.nextInt();
			if(input==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}//if
			
			//조건문
			switch(input) {
			case 1:
				while(true) {		                          //종료할때까지 계속 반복함	
					
					System.out.println("첫번째 숫자를 입력하세요.(0.이전페이지, 1:종료)");
					num1 = scan.nextInt();
					
					
					//(0.이전페이지, 1:종료) : 조건걸기
					if(num1==0) break;           //:다시 원하는 번호를 입력하세요 로 나간다
					if(num1==1) break loop;      //:맨 위의 while을 빠져나오기 위해 이름을 붙인다.
					
					
					System.out.println("두번째 숫자를 입력하세요");
					num2 = scan.nextInt();
					System.out.printf("결과 : %d + %d = %d \n", num1, num2, (num1+num2));
				}//while
			}//switch
	
		}//while		

	}// main

}
