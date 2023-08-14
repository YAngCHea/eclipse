

import java.util.Scanner;

//_02번 불러와서 객체 실습
public class Class0516_07 {

	//얘를 밖으로 뽑아야 두번째 메소드에서도 쓸 수 있다
	//static이 붙어서 클래스변수가 되었다
	//사용방법 = 클래스명.변수명 : 같은 클래스 내에서는 클래스명 생략가능
	static String[] title = {"이름","국어","영어","수학","합계","평균"};
	
//	String[] title = {"이름","국어","영어","수학","합계","평균"};  //1.이런식으로 쓰고싶으면

	
	public static void main(String[] args) {
//		Class0516_07 c = new Class0516_07();     //1.이런식으로 클래스변수로 선언을 해줘야한다
		
		
		Scanner scan = new Scanner(System.in);
		// [성적입력 프로그램]
		// 1.성적을 입력하세요
		// 2.성적을 출력합니다
		// 3.성적수정
		// 4.등수처리
		// 5.학생성적검색
		// 0.종료합니다
		// -------------------

		//이름,국어,영어,수학,합계,평균 - 10명
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int choice = 0;
		int count = 0; //성적입력 학생수
		String searchname = " ";
		int[] rank = new int[10];
		int check = 0;        //존재 유무
		
		//프로그램 시작 무한반복
		loop : while(true) {
			//화면 출력부분
//-----이부분떼어서 아래다 선언------------------------------------------------------------------
			screen();
//-----이런식으로 넣으면 된다------------------------------------------------------------------
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:// 1.성적을 입력하세요
				for(int i=count;i<name.length;i++) {
					System.out.println((i+1)+"번째 학생의 이름을 입력하세요.(0.이전 페이지 이동)>>");
					name[i] = scan.next();
			//이전페이지 이동하기
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다");
						System.out.println();
						break;  //for문 빠져나오기 :여기서 while로 빠져나와야하는게 아닌지?
					}
		    //과목 점수입력받기
					for(int j=0;j<3;j++) {                            
						//score[i][0]국어, score[i][1]영어, score[i][2]수학
						System.out.println(title[j+1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
			//합계부분
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
			//평균부분
					avg[i] = score[i][3] / 3.0;
					
					System.out.println((count+1) + "번째 학생 성적이 등록되었습니다");
					
			//학생수 1 증가
					count++; //얘를 써줘야 i가 올라간다
				}
				break;
				
			case 2://2.성적을 출력합니다
			//기본 출력페이지
				System.out.println("\t\t[ 학생성적 ]\t");
				
//---이부분-------------------------------------------------------------------				
//				for(int i=0;i<title.length;i++) {
//					System.out.print(title[i] + "\t");
//				}
//				System.out.print("등수");
//				System.out.println();
//				System.out.println("---------------------------------------------------");
//-------------------------------------------------------------------------				
				titlescreen();
//----이런식으로 넣으면된다------------------------------------------------				
				
				
			//성적 출력
				for(int i=0;i<count;i++) {
					System.out.print(name[i]+"\t");
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f\t",avg[i]);//평균
					System.out.println(rank[i]+"등");//등수
					System.out.println();
				}
				System.out.println();
				break;
				
			case 3:// 3.성적수정
				//수정할 학생이름 입력
				System.out.println("수정할 학생의 이름을 입력하세요");
				searchname = scan.next();
				
				//수정할 학생 검색하기
				for(int i=0;i<count;i++) {
					if(name[i].equals(searchname)) {
						//수정할 과목선택하기
						System.out.println("[수정할 학생을 찾았습니다]");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("------------------------------");
						System.out.println("수정할 과목을 입력하세요");
					    choice = scan.nextInt();
					    
					    //수정할 과목 이전점수 표시
					    //국어점수 score[i][0], 영어점수 score[i][1], 수학점수 score[i][2] 
					    //현재점수 출력
					    System.out.printf("[현재 %s 점수 : %d \n",title[choice],score[i][choice-1]);
					    System.out.println("---------------------------------------");
					    System.out.println("수정할 점수를 입력하세요.>>");
					    score[i][choice - 1] = scan.nextInt();
					    //합계변경하기
					    score[i][3] = score[i][0] + score[i][1] + score[i][2];
					    //평균 변경하기
					    avg[i] = score[i][3] / 3.0;
					    
						check = 1;//if문을 돌아야 check가 1이 된다
					}
				}//for
				//검색한 학생이 없을 때
				if(check==0) {
					System.out.println("입력할 학생이 없습니다. 다시 입력하세요");
					System.out.println();
				}
				
				break;
				
			case 4:// 4.등수처리 score[i][3]
				for(int i=0;i<count;i++) {
					int rankcount = 1;
					for(int j=0;j<count;j++) {
						//모든학생 성적합계를 비교
						if (score[i][3] < score[j][3]) {
							//자기 점수보다 높으면 등수 +1
							rankcount ++;
						}
					}
					//계산이 끝나면 등수에 입력
					rank[i] = rankcount;
				}//fori				
				
				System.out.println("등수처리가 완료되었습니다");
				System.out.println();
				
				break;
				
			case 5:// 5.학생성적검색
				System.out.println("[  학생 검색  ]");
				System.out.println("검색할 학생의 이름을 입력하세요>>");
				searchname = scan.next();
				check = 0;

//----이부분 뽑아내기-----기본 출력화면 만들기--------------------
//				for(int i=0;i<title.length;i++) {
//					System.out.print(title[i] + "\t");
//				}
//				System.out.print("등수");
//				System.out.println();
//				System.out.println("-----------------------------------------------");
//-------------------------------------------------------------------				
			//학생 검색하기
				for(int i=0;i<count;i++) {
					if(name[i].contains(searchname)) {       //.contains : 일부라도 포함되어있으면 True
						                                     //길 => 홍길동, 홍길순, 홍길자, 홍길구, 김구, 이순신 : 홍길동,홍길순,홍길자,홍길구 나온다
						
						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f\t", avg[i]);// 평균
						System.out.println(rank[i] + "등");// 등수
						System.out.println();
						
					}//if
					
				}//for
				
				if(check == 0) {//검색한 이름이 없는 경우
					System.out.println("찾고자 하는 학생이 없습니다.");					
				}
				System.out.println();
				
				break;
				
			case 0:// 0.종료합니다
				System.out.println("[프로그램 종료]");
				System.out.println("____________________________");
				break loop;  //while에 걸린 loop
			
			
			}
			
		}//while

		}//main
		
		
		
		//클래스 메소드
		static void screen() {
			System.out.println("[성적입력 프로그램]");
			System.out.println("1.성적을 입력하세요");
			System.out.println("2.성적을 출력합니다");
			System.out.println("3.성적을 수정합니다");
			System.out.println("4.등수처리");
			System.out.println("5.학생성적 검색");
			System.out.println("0.종료합니다");
			System.out.println("----------------------");
	}
		
		static void titlescreen() {
			for(int i=0;i<title.length;i++) {
				System.out.print(title[i] + "\t");
			}
			System.out.print("등수");
			System.out.println();
			System.out.println("-----------------------------------------------");
		}

}
