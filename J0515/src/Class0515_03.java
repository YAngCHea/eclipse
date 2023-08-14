// 보물찾기 프로그램 복습

import java.util.Scanner;


public class Class0515_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	// 10개 중 2개의 보물을 찾기 프로그램을 구성하시오
		//1.box배열 10개
		//2.arr배열 10개
		//3.섞기 temp, random
		//4.scan입력 -> input
		//5.while - 무한반복
		//6.화면 출력 - arr출력, 번호출력
		
		int[] box = {0,0,0,0,0,0,0,0,1,10};
		String[] arr = new String[10];
		int random = 0;
		int temp = 0;
		int mynum = 0;
		
		//box에 있는 보물 위치 섞기
		for(int i=0;i<10;i++) {
			random = (int)(Math.random()*10);
			
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}
		
//// ---while돌리기-------------------------------------------------------------		
//		//기본 프로그램 돌리기
//		System.out.println("[보물찾기 프로그램");
//		for(int i=1;i<=10;i++) {
//			System.out.print(i + "\t");			
//		}
//		System.out.println();
//		System.out.println("-----------------------------------------------------------------------------");
//		for(int i=0;i<10;i++) {
//			arr[i] = "?";
//			System.out.print(arr[i] + "\t");
//		}
//		System.out.println();
//
//		//보물 위치 찾을 숫자 입력받기
//		int mynum = 0;
//		System.out.println("숫자를 입력하세요>");
//		mynum = scan.nextInt();
////---while돌리기-------------------------------------------------------------		
		
		for(int i=0;i<10;i++) {
			arr[i] = "?";
		}
		
		while(true) {
			//기본 프로그램 돌리기
			System.out.println("[보물찾기 프로그램");
			for(int i=0;i<10;i++) {
				System.out.print((i+1) + "\t");			
			}
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			for(int i=0;i<10;i++) {
//				arr[i] = "?";            //얘를 여기다가 넣으면 오류가 생긴다 : while 밖에다가 넣어줘야함
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
//종료옵션 넣기	
			if(mynum == 0) {
				System.out.println("프로그램을 종료합니다");
				System.out.println("_____________________");
				break;
			}

			//보물 위치 찾을 숫자 입력받기
			System.out.println("숫자를 입력하세요>");
			mynum = scan.nextInt(); //1-10숫자를 입력
			
			if(box[mynum-1] == 1) {   //mynum의 입력값이 1-10이라서 이렇게 넣음
				arr[mynum-1] = "보물";
			}else if(box[mynum-1] == 10) {
				arr[mynum-1] = "대박보물";
			}else {
				arr[mynum-1] = "꽝";
			}
				
			
			
		}
  	
	}


}
