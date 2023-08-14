import java.util.Scanner;
public class Class0516_06_Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Student[] s = new Student[10]; //Student 참조변수 배열 10개 생성
		                               //배열이라서 삭제 불가능
		s[0] = new Student();//객체선언
		
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String searchname = "";//검색할 이름
		int choice = 0;
		int count = 0;
		int input = 0;
		

		
		while(true) {
			System.out.println("[ 리모콘 프로그램 ]");
			System.out.println("1.전원 on/off");
			System.out.println("2.채널 Up");
			System.out.println("3.채널 Down");
			System.out.println("4.볼륨 Up");
			System.out.println("5.볼륨 Down");
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1 ://1.성적입력하기
				for(int i=count;i<s.length;i++) {
					s[i] = new Student();//객체선언 : 저장공간 만들어짐
					//번호
					System.out.print("[" + (i+1) + "번째 학생]");
					System.out.println("(0.이전페이지로 돌아가기)");
					//이름
				    System.out.println((i+1)+"번째 학생의 이름을 입력하세요");
				    s[i].name = scan.next();
				    
		    //이전페이지로 돌아가기
				    if(s[i].name.equals("0")) {
				    	System.out.println("이전페이지로 돌아갑니다");
				        break;
				    }
				    
		    //점수입력
				    System.out.println("국어점수를 입력하세요.");
				    s[i].kor = scan.nextInt();
				    System.out.println("영어점수를 입력하세요.");
				    s[i].eng = scan.nextInt();
				    System.out.println("수학점수를 입력하세요.");
				    s[i].math = scan.nextInt();
				    
				    
			//합계부분
					s[i].sum();
			//평균부분
					s[i].average();
					
				}//for
				break;
			}
		}
	}//main

	static void screen() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
