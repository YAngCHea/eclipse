//ppt.85 조건문, 반복문
import java.util.Scanner;

public class Class0510_02 {

	public static void main(String[] args) {
		//조건문, 반복문 : 반복적인 작업을 줄이고 간결하게 보일 수 있도록 하는 작업
		// if문이 더 많이 쓰이고(90%이상) : 크다 작다를 쓸 수 있음
		// switch문 : 크다 작다를 쓸 수 없음 : 정답이 있는것을 도출하려면 switch가 더 유리, 경우의 수가 많은경우 switch
		//모든 switch문은 if문으로 변경이 가능하지만, if문은 switch문으로 변경할 수 없는 경우가 많다
//		int num = 8;
//		(num>=1)? "1보다 크다":"1보다 작다"; // 삼항식\
		
//-------------------------------------------------------------------------		
		// 조건문 if, else
//		if (num==8) {
//			System.out.println("8입니다.");
//		}else {
//			System.out.println("8이 아닙니다");
//		}
		
//-------------------------------------------------------------------------		
//		//if, else if, if
//		int num = 0;
//		if (num >0) {                             //if 조건1
//			System.out.println("양수입니다");
//		}else if(num==0) {                        //else if 조건2
//			System.out.println("0입니다");
//		}else (num <0) {                          //else 조건3
//			System.out.println("음수입니다");
//		}

//-------------------------------------------------------------------------	
//		//if문만 존재
//		int num = 0;
//		if (num==0) {
//			
//		}
		

//-------------------------------------------------------------------------	
		//실습예제
		//입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다. 출력
//		int num = 0;
//		System.out.println("숫자를 입력하세요>");
//		Scanner scan = new Scanner(System.in);
//		num = scan.nextInt();
//
//		if (num%2 == 0) {                          //중괄호 빼도 되긴하지만 지금은 계속 써..
//			System.out.println("2의 배수입니다.");
//		} else {
//			System.out.println("2의 배수가 아닙니다");
//		}

		
//-------------------------------------------------------------------------	
		//실습예제
		//점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 입력하세요.
		double score = 0;
		System.out.println("너의 점수는 몇점?");
		Scanner scan1 = new Scanner(System.in);
		score = scan1.nextDouble();
		
		if (score >=60) {
			System.out.println("60점 이상이네! 너 합격!");
		} else {
			System.out.println("60점 안되는거같은데.. 너 불합격!");
		}
		
	}

}
