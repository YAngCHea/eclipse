import java.util.Scanner;

public class Class0517_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//---최대값 : 세개의 숫자를 입력받아 가장 큰 수를 출력하시오-------------------------------------
		Class0517_04 c = new Class0517_04();
//		int[] input = new int[3];
//		
//	//숫자 입력받기
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1) + "번째 숫자를 입력하세요>");
//			input[i] = scan.nextInt();
//		}
//		
//	//출력하기
//		System.out.println(c.numMax(input[0],input[1],input[2]));
//
//
//	}

//----------------------------------------------------------------		
// 삼항식
//		max = (num1>num2)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);
// Math.Max()
//		max = Math.max(Math.max(num1,num2),num3);
		
		
		
//---최소값 : 세가지 수 중 가장 작은 수를 출력하세요-------------------------------------------------------------
		int[] input = new int[3];
		int min = 0;
		
		//숫자 입력받기
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + "번째 숫자를 입력하세요>");
			input[i] = scan.nextInt();
		}
//		//숫자비교하기
//		min = Math.min(Math.min(input[0],input[1]),input[2]);
//		System.out.println("최소값 = " + min);

		//메소드 선언했으면 그냥 이렇게 쓰세욤
		int result = c.min(input[0],input[1],input[2]);
		System.out.println("최소값 = " + result);
//------------------------------------------------------------------------------------------------------		
	}// main 메소드
		//
//			//numMax메소드
//			int numMax(int a, int b, int c) {
//			//1.if문
//				if(a>b && a>c) {
//					return a;
//					}else if(b>a && b>c) {
//						return b;
//						}else {
//							return c;
//							}
	
	//최소값 메소드
	int min(int a, int b, int c) {
		int result = 0;
		result = Math.min(Math.min(a, b), c);
		
		return result;
	}
	
	
	
}
