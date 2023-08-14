
// for문의 기초
import java.util.Random;
import java.util.Scanner;

public class Class0510_09 {

	public static void main(String[] args) {
		// 반복문 - for , while
////--for문-------------------------------------------------------------------		
//		int sum =0;
//		int i = 1;
//		for (i = 1; i <= 100; i++) {         //i는 for문 안에서만 존재하는 지역변수
//			sum = sum + i;       //sum += i로 써도 동일하다
//		}
//			System.out.println(i+":"+sum);        //i를 선언해줘야 오류가 안뜬다
////--------------------------------------------------------------------------
//		// 숫자를 세번 반복해서 입력받아 합을 출력하세욥
//		// 1.변수선언
//		// 2.scan 1번 선언
//		// 3.반복문
//		// 4.숫자 입력 넣어줌
//		// 5.sum변수에 더하기 해줌
//		// 6.sum을 출력
//
//		int num = 0;
//		int sum = 0;
//		
// 		Scanner scan = new Scanner(System.in);       //맨 위에 써도 된다
// 		
// 		for (int i = 1; i <=2; i++) {
// 			System.out.println("enter num");
// 			num = scan.nextInt();
// 			sum += num; 
// 		}
// 		System.out.println("입력한 수의 총 합은 "+sum);
////---정답-----------------------------------------------------------------------
//		int num = 0;
//		int sum = 0;
//		
// 		Scanner scan = new Scanner(System.in);       //맨 위에 써도 된다
// 		
// 		for (int i = 0; i < 3; i++) {               //0부터 해야 배열배울때 도움이 된다
// 			System.out.println((i + 1)+"번째 숫자를 입력하세요");
// 			num = scan.nextInt();
// 			sum = sum + num; 
// 		}
// 		System.out.println("입력한 수의 총 합은 "+sum);
//
////--이중 for문----------------------------------------------------------------------- 
//// 구구단 만들기
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("[          " + i + "단 입니다.           ]");
//			// = System.out.printf("[     %d 단입니다.   ]\n",i);
//			for (int j = 1; j <= 9; j++) { // System.out.println(i + "*" + i + " = " + (i*i));
//				System.out.printf("%d * %d = %d \n", i, j, i*j); // 위에꺼랑 동일하지만, 이게 더 편하다
//			}//2번째 for
//			System.out.println();          //이러면 j가 한바퀴를 돌고난 후에 한줄을 띄워준다
//		}//1번째 for
////-----------------------------------------------------------------------------------
//		//0-9까지 출력하세요
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}
//	
////-----------------------------------------------------------------------------------		
////이중for문 예제문제
//		//00 01 02 03 04....09 10 11 12.....99
//		//중첩(이중) for문을 사용해서 출력하세욥
//		
//		for (int i = 0; i <= 9; i++) {
//			for (int j = 0; j <= 9; j++) {
//				System.out.printf("%d%d ",i,j);
//			}//j for문
//			System.out.println();
//		}//i for문
//		
////-------------------------------------------------------------------------------------		
//	//while 반복문
//		
//		// i--, i-=1, i=i-1
//		// i++, i+=1, i=i+1
//		
//	    for (int i = 0; i < 10; i += 1) {
//	    	System.out.println(i);
//	    }
//		
//		//while : 초기화가 밖에 있음
//	    int i = 0;
//	    while(i<10) {
//	    	System.out.println(i);
//	    	i++;
//	    }
//		
//-------------------------------------------------------------------------------------		
    //랜덤숫자 1-100까지의 랜덤숫자 1개를 출력하세용		
		int random = 0;
		random = (int)(Math.random()*100) + 1;
		System.out.println(random);
		
		
		
   //숫자 맞추기 프로그램
		//10번
		Scanner scan = new Scanner(System.in);
		
		int ii = 1;
		while(ii<=10) {
			System.out.println("숫자를 입력하세욥");
			int input = scan.nextInt();
			if(input == random) {
				System.out.println("정답입니다");
				break;
			}else if(input>random) {
				System.out.println("[오답] 입력한 숫자보다 작은 수입니다.");
			}else {
				System.out.println("[오답] 입력한 숫자보다 큰 수입니다.");
			}
		}

	}// main

}
