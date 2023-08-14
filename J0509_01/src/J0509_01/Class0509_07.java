package J0509_01;

import java.util.Scanner;

public class Class0509_07 {

	public static void main(String[] args) {
		
		
//        //이항연산자
//		int num = 10;
//		double num2 = 10;
//		num = num + num2;            얘가 int랑 double을 더하려고 해서 오류
//		System.out.println();
		
	    char ch = 'A';
	    int num = ch +1;
	    System.out.println((char)num);
	    
	    //대문자 입력시 소문자로 출력하시오.
	    //1.변수선언 2.입력 3.출력
	    char ch1 = ' ';
	    Scanner scan = new Scanner(System.in);
	    System.out.println("대문자를 입력해주세욥");
	    ch = scan.next().charAt(0);    //문자열에 첫번째 문자를 가져옴.
	    char ch2 = (char)(ch + 32);
	    System.out.println("입력한 대문자 : "+ch);
	    System.out.println("입력한 대문자 : "+ch2);
	    
	    //소문자를 입력받아 대문자로 출력하시오
	    char ch3 = ' ';
	    
	    System.out.println("소문자를 입력하세욥");
	    ch3 = scan.next().charAt(0);
	    char ch4 = (char)(ch3 - 32);
	    System.out.println("입력한 소문자 : "+ch3);
	    System.out.println("입력한 대문자 : "+ch4);
		
		
		
		
		
		
		
//		//1.변수설정 2.입력 3. 출력
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
		
		
		
		
		
		
	}
}
