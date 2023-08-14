//어제 내주신 숙제
import java.util.Scanner;

public class Class0511_01 {

	public static void main(String[] args) {
//--10개의 숫자를 입력받아 합계를 출력하시오.-------------------------------------------------
		
		//1.변수선언하기
		int num = 0, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		//2.반복문 시작
		int i = 0;
		while(i<10) {
			System.out.println((i+1) + "번째 숫자를 입력하세요.");
			//3.입력받기
			num = scan.nextInt();
			sum = sum + num;
			i++;
		}
		
		//4.출력하기
		System.out.println("총 합계는 : "+sum);
		
		
		
		
		
		
		
		
		
		

	}

}
