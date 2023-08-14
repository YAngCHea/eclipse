
import java.util.Scanner;

public class Class0517_03 {

	//main메소드
	public static void main(String[] args) {
		//객체선언
		//클래스명 참조변수명 = new 클래스명();
		Class0517_03 c = new Class0517_03();
		Scanner scan = new Scanner(System.in);
//3개의 숫자를 입력받아 합계를 구하세요.------------------------------------------
		//add 메소드를 사용하세요
		

		//숫자 3개 입력받기
		int[] num = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + "번째 숫자를 입력하세요>");
			num[i] = scan.nextInt(); 
		}
		
		//입력받은 숫자 더하기 //메소드호출
		int result = c.add(num[0],num[1],num[2]);
		System.out.println(num[0] +" + "+ num[1] +" + "+ num[2] + " = " + result);
//-------------------------------------------------------------------------
		
		
		
		
	}//main메소드

	//add메소드 만들기
	int add(int num1,int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;
	}//add메소드
	
}//class
