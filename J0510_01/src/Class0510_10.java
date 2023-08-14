
import java.util.Scanner;

public class Class0510_10 {

	public static void main(String[] args) {
		// 숙제
		//10개의 숫자를 입력받아 합계를 출력하시오
////1.for문 버전		
//		Scanner scan = new Scanner(System.in);
//		int input = 0;
//		int sum = 0;
//		
//		for (int i = 0; i <10; i++) {
//			System.out.println((i+1) + "번째 숫자를 입력하세요");
//			input = scan.nextInt();
//			sum = input + sum;
//		}
//		System.out.println("입력한 수의 총합은 "+sum);

//2.while문 버전
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		
		int i = 0;
		while (i <10) {
			System.out.println((i+1) + "번째 숫자를 입력하세요");
			input = scan.nextInt();
			sum = input + sum;
			i++;
		}
		System.out.println("입력한 수의 총합은 "+sum);

	}

}
