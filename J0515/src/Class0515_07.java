//--Class0515_06 정리본--------------------------
import java.util.Scanner;
public class Class0515_07 {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		// 5,5 배열
		String[][] box = new String[5][5];
		int random = 0;
		int temp = 0;
		
		//1.1개 배열에 숫자 넣기
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;      // = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}
		}
		
		
		//2.2차원 배열에 숫자 넣기
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
//				box[i][j] = num[5*i + j];      //타입이 int / String타입으로 달라서 넣을 수 없다
				                               //String타입 = "" + int; 
				box[i][j] = "" + num[5*i + j];
				//box[0][0] = num[0]
				//box[0][1] = num[1]
				//box[0][2] = num[2]
				//box[0][3] = num[3]
				//box[0][4] = num[4]
				//box[1][0] = num[5]
				//...
				//box[4][4] = num[24]
			}
		}
		
		//2-1.배열 섞기
		for(int i=0; i<1000;i++) {
			random = (int)(Math.random()*25);
			
			temp = num[0];
			num[0]= num[random];
			num[random] = temp;
		}
	
	//출력하기
		while(true) {
			//상단 번호출력
			System.out.print(" |"+"\t");
			for(int i=0;i<5;i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("-----------------------------------------------------");
			//3.화면 출력하기
			for (int i = 0; i < box.length; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < box[i].length; j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}
			
		//좌표입력하기
			//1번
//			System.out.println("좌표를 입력하세욥>>");
//			String input = scan.next();    //
//			int no1 = '4' - '0';        //4
//			int no2 = '1' - '0';         //char - '0' = int로 바뀐다 !!!!!!!!!! (공식이다 외워랑)
			
			//2번
//			System.out.println("X좌표를 입력하세요.(0-4까지의 번호)>");
//			int no1 = scan.nextInt();
//			System.out.println("Y좌료를 입력헤세요.(0-4까지의 번호)>");
//			int no2 = scan.nextInt();
			
			//3번
			System.out.println("1 ~ 25까지 번호를 입력하세요.>>");
			int input = scan.nextInt();
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(box[i][j].equals(input + "")) {//input + "" : String으로 변환해주는것
						box[i][j] = "X";
						continue;         //input을 찾으면 멈춘다
					} 
//					System.out.println(i+"랑 "+j);
				}
			}
			
			
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
