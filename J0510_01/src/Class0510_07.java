import java.util.Scanner;

public class Class0510_07 {

	public static void main(String[] args) {
//		// 1.변수선언 num1, num2, op
//		// 2.scan 입력 3번
//		// 3.비교(switch문)
//		// 4.결과값 출력 - 더하기 결과값 : 4
//
//		int num1 = 0;
//		int num2 = 0;
//		char op = ' ';
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("숫자를 입력하세요");
//		num1 = scan.nextInt();
//		System.out.println("연산자를 입력하세요");
//		op = scan.next().charAt(0);
//		System.out.println("숫자를 입력하세요");
//		num2 = scan.nextInt();
//
//		switch (op) {
//		case '*': 
//			System.out.printf("%d%s%d = "+ (num1 * num2),num1,op,num2);
//			break;
//		case '/': 
//			System.out.printf("%d%s%d = "+ (num1 / num2),num1,op,num2);
//			break;
//		case '+': 
//			System.out.printf("%d%s%d = "+ (num1 + num2),num1,op,num2);
//			break;
//		case '-': 
//			System.out.printf("%d%s%d = "+ (num1 - num2),num1,op,num2);
//			break;
//	    default :
//	    	System.out.println("잘못된 입력입니다.");
//		}
//-------위에 풀어낸 예제를 더 쉽게 바꾸기------------------------------------------------------------------------
		
		// 1.변수선언 num1, num2, op
		// 2.scan 입력 3번
		// 3.비교(switch문)
		// 4.결과값 출력 - 더하기 결과값 : 4

		int num1 = 0;
		int num2 = 0;
		char op = ' ';

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("연산자를 입력하세요");
		op = scan.next().charAt(0);
		System.out.println("숫자를 입력하세요");
		num2 = scan.nextInt();

		
		int result = 0;
		
		switch(op) {
		case '*': 
			result = num1 * num2;
			break;
		case '/': 
			result = num1 / num2;
			break;
		case '+': 
			result = num1 + num2;
			break;
		case '-': 
			result = num1 - num2;
			break;
	    default :
	    	System.out.println("잘못된 입력입니다.");
		}
		System.out.println(result);

	}

}
