import java.util.Scanner;
//String으로 받으면 if문에서 equals 써야한다!!!!!!!!

public class Class0510_03 {

	public static void main(String[] args) {
//		//실습예제 - 02에서 한 예제 풀이
//		//점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 입력하세요.
//		//1.변수선언 2.scan한 뒤 3.입력받기 4.비교 5.출력
//		double score = 0;
//		System.out.println("너의 점수는 몇점?");
//		Scanner scan1 = new Scanner(System.in);
//		score = scan1.nextDouble();
//		
//		if (score >=60) {
//			System.out.println("60점 이상이네! 너 합격!");
//		} else {
//			System.out.println("60점 안되는거같은데.. 너 불합격!");
//		}//if
		
		
//-------------------------------------------------------------------------	
		//입력한 숫자가 1,6,9만 입력받아 1,6,9 출력하세욥
		//if() else if() else
//		int input = 0;
//		System.out.println("1,6,9중 하나 입력하세요>");
//		Scanner scan = new Scanner(System.in);
//		input = scan.nextInt();
//		
//		if (input ==1) {
//			System.out.println(input);
//		} else if(input ==6) {
//			System.out.println(input);
//		} else if (input ==9){
//			System.out.println(input);
//		} else {
//			System.out.println("다시입력하세요");
//		}
		
//-------------------------------------------------------------------------	
		// 문자(m, f)로 입력받아
		
		char sex = 'f';       //String sex = 'f';  String으로 받으면 if문에서 equals 써야한다!!!!!!!!
		System.out.println("성별을 m/f로 입력하세요");
		Scanner scan = new Scanner(System.in);
		sex = scan.next().charAt(0);   //male을 입력했더라도 맨첫글자를 가져와서 오류가 안뜨게 만든것 
		                               // 그냥 scan.next()를 사용하면 문자열을 가져온다
		
		if (sex == 'm' || sex == 'M') {     //if (input.equals("m") || input.equals("M")
			System.out.println("남자입니다");
		} else if (sex == 'f' || sex == 'F'){   //else if (input.equals("f") || input.equals("F")
			System.out.println("여자입니다.");
		} else {
			System.out.println("다시 입력하세요");
		}
		
	}//main

}//class
