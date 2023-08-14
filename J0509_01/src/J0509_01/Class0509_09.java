package J0509_01;

import java.util.Scanner;

public class Class0509_09 {

	public static void main(String[] args) {
		//1개의 글자를 입력받아 숫자로 변환하세요
		//"15784" 1 문자를 숫자로 변환
		System.out.println("문자열을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);       //charAt() 문자열에서 1개의 문자를 가져옴.
		int result = input - '0';       //char타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환된다.
		String content = (result%2 == 0)?"짝수입니다":"홀수입니다";
		System.out.println("추출한 숫자 : "+result);
		System.out.println(content);
		
		//5642에서 2를 추출하고싶음
		System.out.println("문자열을 입력하세요.");
		char input1 = scan.next().charAt(3);       //charAt() 문자열에서 1개의 문자를 가져옴.
		int result1 = input1 - '0';       //char타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환된다.
		String content1 = (result1%2 == 0)?"짝수입니다":"홀수입니다";
		System.out.println("추출한 숫자 : "+result1);
		System.out.println(content1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
