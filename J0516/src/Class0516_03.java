//2번 파일 연습하기

import java.util.Scanner;

public class Class0516_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String searchname = "";
		int choice = 0;
		int count = 0;
		int input = 0;

		while(true) {
			System.out.println("[성적입력 프로그램]");
			System.out.println("1.성적을 입력하세요");
			System.out.println("2.성적을 출력합니다");
			System.out.println("3.성적수정");
			System.out.println("4.등수처리");
			System.out.println("5.학생성적검색");
			System.out.println("0.종료합니다");
			System.out.println("--------------------------------------");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1 : //성적 입력하기
				for(int i=count;i<name.length;i++) {
					//번호
					System.out.print("[" + (i+1) + "번째 학생]");
					System.out.println("(0.이전페이지로 돌아가기)");
					//이름
				    System.out.println((i+1)+"번째 학생의 이름을 입력하세요");
				    name[i] = scan.next();
				    
		    //이전페이지로 돌아가기
				    if(name[i].equals("0")) {
				    	System.out.println("이전페이지로 돌아갑니다");
				        break;
				    }
				    
		    //점수입력
					for(int j=0;j<3;j++) {
					System.out.println(title[j+1] + "성적을 입력하세요");
						score[i][j] = scan.nextInt();						
					}//forj
			//합계부분
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
			//평균부분
					avg[i] = score[i][3] / 3.0;
					
					System.out.println((count+1) + "번째 학생 성적이 등록되었습니다");
					System.out.println();
					
					count++;
				}
				break;
				
			case 2 :// 2.성적을 출력합니다
				System.out.println("\t[  학생성적  ]\t");
				for (int i = 0; i < title.length; i++) {
					// 이름 국어 영어 수학 합계 평균
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------");
				for (int i = 0; i < name.length; i++) {
					// 이름
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						// 국어 영어 수학 합계
						System.out.print(score[i][j] + "\t");

					}
					// 평균
					System.out.printf("%.2f\n",avg[i]); // 소수점아래 2자리까지 출력하기
				}
				    	
				break;
			case 3 ://3.수정하기
				//수정할 학생 이름 입력받기
				System.out.println("수정할 학생의 이름을 입력하세요>");
				searchname = scan.next();
				
				int check = 0;//수정할 학생이 있으면 0 없으면 1
				for(int i=0;i<count;i++) {
					if(name[i].equals(searchname)) {
						System.out.println("수정할 학생을 찾았습니다");
						System.out.println("수정할 과목을 선택해주세요");
						System.out.println("------------------------");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						choice = scan.nextInt();
						
						//현재 점수 출력하기
						System.out.printf("현재 %s 점수 = %d점",title[i],score[i][choice-1]);
						System.out.println("---------------------------------------------");
						System.out.println("수정할" + title[i] +  "점수를 입력하세요>");
						score[i][choice-1] = scan.nextInt();
						
						
						
					}
				}
				
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 0 :
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
