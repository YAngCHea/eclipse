//--수정하기 부분 다시 수정하기 switch빼기--------------------------------------
import java.util.Scanner;

public class Class0516_05 {

	//메인 메소드
	public static void main(String[] args) {	
//		String name = "";
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int total = 0 ; 
//		double avg = 0;
//		int rank = 0;
		
		
//		name = "홍길동";
//		kor = 100;
//		eng = 100;
//		math = 99;
//		total = kor + eng + math;
//		avg = total/3.0;
//
////-----위와 동일한것을 아래와 같이 선언------------------------
//		Student s1 = new Student();
//		
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.sum();
//		s1.average();
//		
//        Student s2 = new Student();
//		
//		s2.name = "유관순";
//		s2.kor = 99;
//		s2.eng = 99;
//		s2.math = 99;
//		s2.sum();
//		s2.average();
//	
//		
//		System.out.println(s1.total);
//		System.out.println(s1.avg);
//		
//---------------------------------------------------------
		//리모콘
		//1,2,3,4,5,6,7,8,9
		//channelUp, channelDown,이전보기, 자막
		//volumeUp,volumeDown,음소거
		//전원
		Scanner scan = new Scanner(System.in);
		
	//객체선언 
		TV t = new TV();
		int choice = 0;
		int tempvolume = 0;//임시볼륨 저장변수
		
		
		
		
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
			case 1 :
				t.power(); //객체 사용방법 : 참조변수명.메소드명
				if(t.power==true) {
					System.out.println("전원 On되었습니다.");
				}else {
					System.out.println("전원 Off되었습니다.");
				}
				System.out.println();
				break;
			case 2 :
				if(t.power == false) {
					System.out.println("전원을 On해야 기능이 구동됩니다");
					break;
				}
				
				t.channelUp();
				System.out.println("현재채널 : " + t.channel);
				System.out.println();
				break;
				
			case 3 :
				if(t.power == false) {
					System.out.println("전원을 On해야 기능이 구동됩니다");
					break;
				}
				
				t.channelDown();
				System.out.println("현재채널 : " + t.channel);
				System.out.println();
				break;
				
			case 4 : //volumeup
				if(t.power == false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				t.volumeUp();
				System.out.println("현재볼륨 : " + t.volume);
				System.out.println();
				break;
				
			case 5 : //volumeDown
				if(t.power == false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				t.volumeDown();
				System.out.println("현재볼륨 : " + t.volume);
				System.out.println();
				break;
				
			case 6 ://음소거
				if(t.power == false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				
				if(t.volume ==0) {
					t.volume=tempvolume;
					System.out.println("음소거 해제");
					System.out.println("현재 볼륨 : " + t.volume);
				}else {
					tempvolume = t.volume;
					t.volume = 0;				
					System.out.println("음소거 실행");
					System.out.println("현재 볼륨 : " + t.volume);
				}
				break;
				
			}//switch
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
