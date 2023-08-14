import java.util.Scanner;

public class Class0510_05 {
	public static void main(String[] args) {
		
//------------if조건문에서 String 쓰기 : 이렇게 쓰면 안되요
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
//		str = scan.next();
//		
//		if (str =="c") {                           //이렇게 쓰면 인식이 안된다. : 기본형8개만 ==으로 비교가 가능하다
//			                                       //str.equalsIgnoreCase("c") 로 사용해야함
//			System.out.println("c입니다");
//		} else {
//			System.out.println("c가 아닙니다");
//		}
//		
//------------if조건문에서 String 쓰기 : 이렇게 쓰세요
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요");
//		str = scan.next();
//		
//		if (str.equalsIgnoreCase("c")) {                           //이렇게 쓰면 인식이 안된다. : 기본형8개만 ==으로 비교가 가능하다
//			                                       //str.equalsIgnoreCase("c") 로 사용해야함
//			System.out.println("c입니다");
//		} else {
//			System.out.println("c가 아닙니다");
//		}		


//---------------java에서는 0< X < 10	이런식으로는 쓸 수 없다. 조건을 두개로 나눠야한다.
//------------------------------------------------------------------------
		String input = "";
		char ch = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		//input = scan.next();
		ch = input.charAt(0);                 //문자열의 첫번째 문자를 가져온다
		                                      //근데 현재는 문자열이 없기때문에 오류가 난다=>프로그램자체가 오류가 날 수 있음
		
		if (ch == 'c') {                                                 
			System.out.println("c입니다");
		} else {
			System.out.println("c가 아닙니다");
		}
		
	}//main

}//class
