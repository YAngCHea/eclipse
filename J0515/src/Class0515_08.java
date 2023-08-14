import java.util.Scanner;
public class Class0515_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5,5배열을 만들어서 해당 번호를 X표시하는 프로그램을 구현하시오
		
		String[][] box = new String[5][5];
		int random = 0;
		int temp = 0;
		int input = 0;
		
		//box를 채우기 위해 num에 값을 넣기
		int[] num = new int[25];
		for(int i=0;i<25;i++) {
			num[i] = i+1;
		}
		
		//num에 랜덤 숫자를 돌린다
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*25);
			
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		//만들어 놓은 num을 box에 넣는다
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				box[i][j] = "" + num[5*i + j];   //num은 int고 box는 String이라서 ""를 붙여준다
			}//forj
		}//fori

		//출력하기
		while(true) {
			System.out.println("[뽑기 프로그램]");
			for(int i=0;i<5;i++) {
				System.out.print("\t" + i);
			}
			System.out.println();
			System.out.println("-------------------------------------------");
			
			for (int i=0;i<5;i++) {
				System.out.print(i + "|\t");
				for(int j=0;j<5;j++) {
					System.out.print(box[i][j] + "\t");
				}//forj
				System.out.println();
			}//fori
			
			//입력받은 숫자를 좌표로 X표시하기
			System.out.println("좌표를 입력하세요>>");
			input = scan.nextInt();
			
			loop : for(int i=0;i<5;i++) {
				for(int j=0;j<4;j++) {
					if(box[i][j].equals(input+"")) { //input+"": 이거 조심하기ㅜㅠㅜ
						box[i][j] = "*X*";
						break loop;
					}
				}
			}
			
		}//while
		
	}

}
