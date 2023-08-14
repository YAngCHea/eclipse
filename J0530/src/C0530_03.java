import java.util.Scanner;

public class C0530_03 {
	public static void main(String[] args) {
		//소문자를 대문자로 출력하세요 a = 97 A = 65 Z = 96 0 = 48
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("영문 소문자로 입력하세요");
//	    char input = scan.next().charAt(0);
//		
//	    System.out.println("입력한 문자 : " + input);
//	    char output = (char) (input - 32);    //char + int = int + int = int가 되어버린다 : 그래서 형변환을 해줘야함
//	    System.out.println("대문자 : " + output);
//------------------------------------------------------------------------------------
		//한꺼번에 소문자 바꾸기
		String str = "ABCDEFG";
		System.out.println(str.toLowerCase());
		//한꺼번에 대문자 바꾸기
		String str2 = "abcdefg";
		System.out.println(str2.toUpperCase());
////-----------------------------------------------------------------------------------------------------------		
//		//소문자 -> 대문자 // 대문자 -> 소문자 출력하세요 : 문자 1개
//		System.out.println("영문자를 입력하세요");
//	    char input = scan.next().charAt(0);
//	    char output = ' ';
//	   
////		if ((('a' <= input) && (input <= 'z'))==true) {
////			System.out.println("입력한 문자 : " + input);
////			System.out.println("대문자로 변경합니다 : " + (char)(input - 32));
////		} else if ('A' <= input && input <= 'Z') {
////			System.out.println("입력한 문자 : " + input);
////			System.out.println("소문자로 변경합니다 : " + (char) (input + 32));
////		} else {
////			System.out.println("잘못입력했습니다");
////		}
//	    	
//		if ((('a' <= input) && (input <= 'z'))==true) {
//			output = (char)(input - 32);
//		} else if ('A' <= input && input <= 'Z') {
//			output = (char)(input + 32);
//		} else {
//			System.out.println("잘못입력했습니다");
//		}
//		
//		System.out.println("입력한 문자 : " + input);
//		System.out.println("출력 문자 : " + output);
		
//------------------------------------------------------------------------------------------------------------		
		//들어오는 모든 문자열을 변경하시오    : aBcDF  -> AbCdf
		System.out.println("영문자를 입력하세요");
	    String input = scan.next();
	    String output = "";
	    char temp = ' ';
		
	    for(int i=0;i<input.length();i++) {
	    	
	    	temp = input.charAt(i);     //i번째 문자열만 가져오기
	    	
	    	if ((('a' <= temp) && (temp <= 'z'))==true) {
				output = output + (char)(temp - 32);
			} else if ('A' <= temp && temp <= 'Z') {
				output = output + (char)(temp + 32);
			} else {
				System.out.println("잘못입력했습니다");
			}
	    }//for
	    
		System.out.println("입력한 문자 : " + input);
		System.out.println("출력 문자 : " + output);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
	}
}
