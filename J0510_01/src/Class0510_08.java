
import java.util.Scanner;

public class Class0510_08 {
	
	public static void main(String[] args) {
//------------ppt.94 : math.random()-----------------------------------------------------------------
//------------(Math.random() * 끝번호) + 시작번호
		//랜덤숫자
//		int random = 0;
//		random = (int)(Math.random()*10);      //0.0 ~ 9.999999999999까지
//		
//	    double random = 0;
//	    random = (int)Math.random();           //0.0 ~ 0.9999999까지 인데 int선언했으니까 무조건 0.0나온다
//	    System.out.println(random);
//		
//	    double random = 0;
//	    random = (int)(Math.random()*3)+1;           //1.0 ~ 2.9999999까지 인데 int선언했으니까 무조건 0.0나온다
//	    System.out.println(random);
		
		
//------------------------------------------------------------------------------------------------
		//예제 : 1 ~ 10
//		int random = 0;
//		random = (int)(Math.random()*10)+1;
//		System.out.println(random);
//		
//		//숫자를 입력받아 random과 같은 값일 경우 당첨 그렇지 않으면 꽝 출력하세욥
//		int butter = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세욥");
//		butter = scan.nextInt();
//		
//		if (butter == random) {
//			System.out.println("!!당첨!!");
//		} else {
//			System.out.println("꽝 다음기회에!");
//		}
		
//------------------------------------------------------------------------------------------------		
		//여러번 반복하고싶음
		int random = 0;
		random = (int)(Math.random()*10)+1;
		System.out.println(random);
		
		//숫자를 입력받아 random과 같은 값일 경우 당첨 그렇지 않으면 꽝 출력하세욥
		int butter = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세욥");
		butter = scan.nextInt();
		
		//1.
		if (butter == random) {
			System.out.println("!!당첨!!");
		} else {
			System.out.println("꽝 다음기회에!");
		}
		//2.
		if (butter == random) {
			System.out.println("!!당첨!!");
		} else {
			System.out.println("꽝 다음기회에!");
		}
		//3.
		if (butter == random) {
			System.out.println("!!당첨!!");
		} else {
			System.out.println("꽝 다음기회에!");
		}
		
		//할 수 있지만 이부분이 귀찮음=> 반복문 for문 쓰면댄다
		
		
		
	}
}
