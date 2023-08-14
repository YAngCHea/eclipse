
import java.util.Scanner;

public class Class0517_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Class0517_02 c = new Class0517_02();
		int num1 = 10;
		int num2 = 5;
		int input1 = 0;
		int input2 = 0;
		
		
		
//		//객체선언 
//        //클래스명 참조변수명 = new 클래스명();
//		//Card c2 = new Card();
//        
//		int result = c.add(num1,num2);
//		System.out.println("두수의 더하기 : " + result);
		
//---문제1.두 수를 입력받아 더하기 결과값을 출력하세요.--------------------------------------------------------
		
//	//1.그냥 전부 쳐서 입력받기	
//	    System.out.println("더할 첫번째 수를 입력하세요");
//	    num1 = scan.nextInt();
//	    System.out.println("더할 두번째 수를 입력하세요");
//	    num2 = scan.nextInt();
//		
//	//2.for문으로 입력받기    
//	    int[] num = new int[2];
//	    for (int i=0;i<2;i++) {
//	    	System.out.println("더할" + (i+1) + "번째 수를 입력하세요");
//		    num[i] = scan.nextInt();
//	    }
//	    
//	 //결과값 출력
//	    int result = c.add(num[0],num[1]);
//	    System.out.println("결과 = " + result);
	    
//---문제2.두 수를 입력받아 빼기 결과값을 출력하세요.-----------------------------------------------------------
	//숫자 입력받기
		int[] input = new int[2];
		for (int i=0;i<2;i++) {
			System.out.println("계산할 " + (i+1) + "번째 수를 입력하세요");
			input[i] = scan.nextInt();
		}
	//결과
	    int result1 = c.sub(input[0],input[1]);
	    System.out.println("결과 : " + input[0] +" - " + input[1] + " = "+result1);
	    
//---문제3.두 수를 입력받아 곱하기 결과값을 출력하세요.-----------------------------------------------------------		
	// 숫자 입력받기
		int[] input3 = new int[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("계산할 " + (i + 1) + "번째 수를 입력하세요");
			input3[i] = scan.nextInt();
		}
	//결과
	    int result2 = c.sub(input[0],input[1]);
	    System.out.println("결과 : " + input[0] +" * " + input[1] + " = "+result2);

//---문제4.두 수를 입력받아 나누기 결과값을 출력하세요.-----------------------------------------------------------
		// 숫자 입력받기
		int[] input4 = new int[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("계산할 " + (i + 1) + "번째 수를 입력하세요");
			input3[i] = scan.nextInt();
		}
	//결과
	    int result4 = c.sub(input[0],input[1]);
	    System.out.println("결과 : " + input[0] +" / " + input[1] + " = "+result2);
	    
	    
//--한꺼번에 보기--------------------------------------------------------------------------------------------	    
	 
	    
	    
	    
	    
	}//main

	
	
  //더하기 메소드
	int add(int num1, int num2) {  //리턴값이 무조건 있어야한다  
		int result = num1 + num2;
		return result;
	}
	
  //빼기 메소드
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
  //곱하기 메소드
	int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
  // 나누기 메소드
	int div(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
}//class
