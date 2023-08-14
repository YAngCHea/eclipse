
// 10진수를 2진수로 변경하는 프로그램-------------------------------------------
import java.util.Scanner;

public class Class0512_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		// 10진수를 2진수로 변경하는 프로그램
//
//		String[] binary = { "0000", "0001", "0010", "0011", "0100", 
//				            "0101", "0110", "0111", "1000", "1001" };          //한꺼번에 값 넣기
////		                = binary[0], binary[1], binary[2], binary[3], binary[4], 
////		                  binary[5], binary[6], binary[7], binary[8], binary[9]
//
//		// 1025 - 0001 0000 0010 0101
//		// 1 ,0 , 2, 5 : 이런식으로 따로 받게 되면 int로 받아서 합쳐야한다
//		// 0125 : 이런식으로 맨 앞에 0이 있는 경우는 int로 받을 수 없음: 0이 사라지기 때문 : String으로 받아서 합쳐야한다.
//
//		int[] num = new int[4];
//
//		// 1개씩 받기
//		// 1025 - 0001 0000 0010 0101
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("번호를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		System.out.println();
//
//		// 10진코드 출력하기
//		System.out.println("10진코드 : ");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i] + " ");
//		}
//		System.out.println();
//
//		// 2진코드로 번호 출력
//		System.out.println("이진코드 : ");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(binary[num[i]] + " ");
//		}
//		System.out.println();
////-----------------------------------------------------------------------------------------
	//위에꺼 다시------------------------------------------------
//		int[] num = new int[10];
//		              0  1  2  3  4  5  6  7  8  9  번 방
//		int[] data = {0,10,20,30,40,50,60,70,80,90};
//                        0    1    2    3    4    5    6    7    8    9  번 방
//		String[] data = {"0","10","20","30","40","50","60","70","80","90"};
//		String[] data = { "0000", 
////	                         0			
//				          "0001", "0010", "0011", "0100", "0101", 
////				             1      2       3       4       5
//				          "0110", "0111", "1000", "1001" };
////		                     6       7       8       9
//		
//		
//		while(true) {
//			System.out.println("10진수를 입력하세요");    //5
//			int num = scan.nextInt();
//			System.out.println("입력하신 수를 2진수로 변경하면 " + data[num] + "입니다.");
//		}
//---------------------------------------------------------------------------------
		String[] data = { "0000", 
//                0			
	          "0001", "0010", "0011", "0100", "0101", 
//	             1      2       3       4       5
	          "0110", "0111", "1000", "1001" };
//                6       7       8       9
		
		int[] num = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("10진수를 입력하세요");    //5
			num[i] = scan.nextInt();			
		}
		
		System.out.println("입력하신 수를 2진수로 변경하면 ");
		
		loop : for(int i=0;i<5;i++) {
			System.out.print(data[num[i]]);
			if(i==4) {
				break loop;
			}
			System.out.print(", ");
		}
		
		System.out.println(" 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
