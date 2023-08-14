//--수정하기 부분 다시 수정하기 switch빼기--------------------------------------
import java.util.Scanner;

public class Class0516_01 {

	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);

	// [성적입력 프로그램]
	// 1.성적을 입력하세요
	// 2.성적을 출력합니다
	// 3.성적수정
	// 4.등수처리
	// 5.학생성적검색
	// 0.종료합니다
	// -------------------

	String[] title = {"이름","국어","영어","수학","합계","평균"};
	String[] name = new String[10];
	int[][] score = new int[10][4];//아래있는애들을 한꺼번에 몰아서 score로 쓴다
//	int[] kor = new int[10];
//	int[] math = new int[10];
//	int[] eng = new int[10];
//	int[] total = new int[10];
	double[] avg = new double[5];
	String modifyname = "";  //수정하기 할 때 추가함
	int input = 0;
	int count = 0;

	while (true) {
		System.out.println("[성적입력 프로그램]");
		System.out.println("1.성적을 입력하세요");
		System.out.println("2.성적을 출력합니다");
		System.out.println("3.성적을 수정합니다");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적 검색");
		System.out.println("0.종료합니다");
		System.out.println("----------------------");
		input = scan.nextInt();

		// 조건문
		switch (input) {

		case 1: // 성적입력
			for (int i = count; i < name.length; i++) {
				if (i > name.length)
					break;

				System.out.println("[" + (i + 1) + "번째 학생]");
				System.out.println("이름을 입력하세요.0번을 누르면 뒤로 돌아갑니다.]");
				name[i] = scan.next();

				if (name[i].equals("0")) {
					System.out.println("이전화면으로 돌아갑니다.");
					break;
				}

				//국어,영어,수학 => 합계
				for(int j=0;j<3;j++) {
					System.out.println(title[j+1] + "점수를 입력하세요");
					score[i][j] = scan.nextInt();
					score[i][3] = score[i][3] + score[i][j];   //total
				}
				avg[i] = score[i][3] / 3.0;//avg
				count++;

			} // for

		case 2:// 성적출력
			System.out.println("2.성적을 출력합니다.");
//			System.out.println("이름\t국어\t수학\t영어\t합계\t평균"); //얘를 아래줄처럼 for문 돌리기
			for(int i=0;i<title.length;i++) {
				System.out.print(title[i]+"\t");
			}
			System.out.println();
			System.out.println("----------------------------------------------");
			for (int i = 0; i < count; i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], score[i][0],score[i][1],score[i][2],score[i][3],
						avg[i]);
				System.out.println();
			} // for
//------수정하기--------------------------------------------------------------				
		case 3://수정하기
			System.out.println("수정할 학생 이름을 입력하세요.");
			modifyname = scan.next();
			
			int check = 0;//찾을 학생이 없을 경우 0 , 있으면 1
			
			for(int i=0;i<count;i++) {  //모든 학생을 검색한다
				if(name[i].equals(modifyname)) {
					System.out.println("[수정과목 선택]");
					System.out.println("-------------------------------------------");
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.println("수정할 과목을 선택해주세요");  //국어 영어 수학 중 뭘 수정할껀지 선택해야함
					input = scan.nextInt();
					check = 1;          //찾는학생이 있을 경우 1로 변경
					
					
//					switch(input) {
//					case 1 : case 2 : case 3 : //국어 : 영어  : 수학
//						//score[1][0]국어 score[i][1]영어 score[i][2]수학 score[i][3]합계
//						System.out.println("현재 "+title[input]+"점수 = " + score[i][input-1]);  //여기 title[input]!!
//						System.out.println("------------------------------");
//						System.out.println("변경할 "+title[input]+"점수를 입력하세요");
//						score[i][input-1] = scan.nextInt();
//						score[i][3] = score[i][0] + score[i][1] + score[i][2]; //합계수정
//						avg[i] = score[i][3] / 3.0; //평균 수정 
//						System.out.println("[!!수정 완료!!]");
//						System.out.println();
//						break;
//					}//switch
//--switch도 없애도 된다--------------------------------------------------------------------------------
			// 이런식으로 없애도 가능하다
					// score[1][0]국어 score[i][1]영어 score[i][2]수학 score[i][3]합계
					System.out.println("현재 " + title[input] + "점수 = " + score[i][input - 1]); // 여기 title[input]!!
					System.out.println("------------------------------");
					System.out.println("변경할 " + title[input] + "점수를 입력하세요");
					score[i][input - 1] = scan.nextInt();
					score[i][3] = score[i][0] + score[i][1] + score[i][2]; // 합계수정
					avg[i] = score[i][3] / 3.0; // 평균 수정
					System.out.println("[!!수정 완료!!]");
					System.out.println();
					break;
				}//if                      => 여기서 else를 쓰면 i가 끝까지 돌때까지 계속 없다고 나온다
			}//for
			
			//check
			if(check == 0) {
				System.out.println("[찾는 학생 없음]");
				System.out.println("찾는 학생이 없습니다. 다시 입력해주세요");
				System.out.println();
			}	
//------수정하기--------------------------------------------------------------					
		case 0:// 종료
			System.out.println("프로그램을 종료합니다");
			System.out.println("___________________________");
			break ;

		}// switch

	} // while

	}//main
	
	
	
	//클래스 메소드
	static void screen() {
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
