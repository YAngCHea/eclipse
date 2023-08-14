
import java.util.Scanner;

public class Class0510_01 {

	public static void main(String[] args) {
		//어제꺼 복습 - 예제
		// 1.변수선언 2. scan입력 3.println출력
		char input = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");           //시각적으로 input을 보기위해 넣는것! 없어도 입력은 가능하다
		input = scan.next().charAt(0);
		System.out.println("결과값 : "+input);           //앞에 ""이 들어가면 전체가 문자열로 인식된다
		
		//입력한 글자가 문자인지 파악하는 프로그램
		//1. 변수선언 2. scan입력 3. 비교 4.출력
		char input1 = ' ';
		Scanner scan1 = new Scanner(System.in);
		System.out.println("글자를 입력하세요.");
		input1 = scan1.next().charAt(0);
		String result = ((input>='a' && input<='z') || (input>='A' && input<='Z'))? 
				        "입력하는 글자는 문자입니다." : "입력한 글자는 문자가 아닙니다.";               //맞으면 앞에꺼, 틀리면 뒤에거 출력
 		System.out.println("result");
		
 		//--대입연산자복습-----------------------------------------------------------------------------
		int i = 1;
		//i = i + 2;  //i + = 2;
		i++;   //=i+1
		i = i*5; //i*=5;
	}

}
