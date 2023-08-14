package J0509_01;

import java.util.Scanner;


public class Class0509_06 {

	public static void main(String[] args) {
		// ++개념의 이해
		int num = 5;
		int result = ++num;     // num + 1을 한 뒤에 result에 할당 => result = 6
		System.out.println(result);

		int num1 = 5;
		int result1 = num1++;     // result1에 num1을 할당한 뒤 num1 +1 => result = 5, num1 = 6
		System.out.println(result1);
		System.out.println(num1);
		
		//=======================================================================
		String answer = (num>1)? "1보다 큽니다.":"1보다 작습니다.";
		System.out.println(answer);          //1보다 큽니다.
		
		//1개의 정수형을 입력받아 10보다 큰수인지 출력하시오
		
		int input = 0;
		
		Scanner scan = new Scanner(System.in);     //System.in : 키보드에서 입력을 받는다는 뜻
		System.out.println("input값을 지정하세요 >");
		input = scan.nextInt();
		
		String answer2 = (input==10)? "10과 같습니다" : (input>10)? "10보다 큽니다" : "10보다 작습니다";       //같다는 ==, =는 할당
		           //이런식으로 True : False 를 맞춰서 더 길게도 쓸 수 있다
		           //if 문 을 더 자주써서 이건 잘 안쓴다
				
		System.out.println(answer2);
		
		//==============================================================
		//비트전환연산자 - ~
		
		//정수를 입력받아 음수면 양수로, 양수면 음수로 변경하시오
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");
		input = scan.nextInt();
		int result3 = (input>0)? -input : -input;
		System.out.println("결과값 : "+result3);

		
		//================================================================
	    // 실습예제
		//숫자를 입력받아 짝수인지 홀수인지 출력하시오.
		//짝수입니다. 홀수입니다.
		
		System.out.println("짝수홀수 감별사 \n");
		System.out.println("숫자를 입력하세요 > ");
		input = scan.nextInt();
		String result5 = (input%2 == 0)? "홀수!!!!!":"짝수!!!!!!!!";
		System.out.println("결과는 바로바로 "+result5);	
	}

}
