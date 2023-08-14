//---2차원 배열 빙고판-------------------------------------------------
import java.util.Scanner;
public class Class0515_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5,5배열을 만드는데, 1~25까지 랜덤으로 값을 넣어서 만드세용
		
		String[][] box = new String[5][5];
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		int random = 0;
		int temp = 0;
		String input = " ";     //좌표를 묶어서 넣기 때문이다
		
		
		
		for(int i=0;i<25;i++) {
			num[i] = i+1;
		}
		
		//랜덤으로 섞기
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*25);
			
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		
     //무한반복 출력
		while(true) {
			
			
			//box배열 만들어서 일단 1~25값 넣기
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					box[i][j] = "" + num[(5*i) + j];   //box가 String이라서 ""넣는것
//				System.out.println(box[i][j]);
				}
			}
			
			//위쪽 인덱스 출력하기
			for(int i=0;i<5;i++) {
				System.out.print("\t" + i );			
			}
			System.out.println();
			System.out.println("---------------------------------------------");
			//출력하기
			for(int i=0;i<5;i++) {
				System.out.print(i + " |\t");
				for(int j=0;j<5;j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}
			
			
			
			System.out.println();
			System.out.println("좌표를 입력하세요.>>");
//			//좌표입력
//			input = scan.next();
//			char ch1 = input.charAt(0);     //첫번째 자리가 짤라져서 나온다
//			char ch2 = input.charAt(1);     //두번째 자리가 짤라져서 나온다
//			
//			
//			box[ch1][ch2] = "x"; //위에서 ch1,ch2를 문자로 받앗기때문에 아스키코드로 바꿔서 들어간다
			
			//좌표입력
			input = scan.next();
			int ch1 = input.charAt(0) - '0';     //첫번째 자리가 짤라져서 나온다 : 얘를 문자 0(아스키코드로48)을 빼면 된다
			int ch2 = input.charAt(1) - '0';     //두번째 자리가 짤라져서 나온다 : 얘를 문자 0(아스키코드로48)을 빼면 된다
			
			
			box[ch1][ch2] = "x"; //
			
		}//while
			
	}

}
