import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체선언
		StuProcess sp = new StuProcess();
		
		List<Student> list = new ArrayList<>();
		
		int choice = 0;
		int stucount = 3;  //학번 : 홍길동이랑 유관순이 있으니까!!
		
		list.add(new Student(1,"홍기동",100,100,100));
		list.add(new Student(2,"유관순",100,100,100));
		
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1.학생입력");
			System.out.println("2.학생출력");
			System.out.println("8.파일에서 가져오기");
			System.out.println("9.파일 저장하기");
			System.out.println("0.프로그램 종료");
			
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요>>");
			
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
//				//객체선언
//				StuProcess sp = new StuProcess();
//				sp.stuInput(list);        //여기서 StuProcess에 있는 void로 넘어간다
//				break;   //그래서 이 case 1을 실행하면 홍길동 이름이 나온다
//------------------------------------------------------------------------------------				
				
				
				//요 메소드 호출 후 데이터 전달 받는 부분이 제일 중요하다!!!!!!!!!!
//				list = sp.stuInput(list,stucount);        //여기서 StuProcess에 있는 void로 넘어간다
				                                         //stucount를 하나 더 보내면 StuProcess 메소드 첫줄에서 넣어줘야함
				Map<String,Object> map = sp.stuInput(list,stucount);
				list = (List<Student>) map.get("list");
				stucount = (int) map.get("stucount");
				
				
				//출력
				for (int i=0;i<list.size();i++) {
					System.out.printf("%d %s \n",list.get(i).getStuNo(),list.get(i).getName());
				}
				break;   //그래서 이 case 1을 실행하면 홍길동 이름이 나온다
				
				
			case 2:  //2.학생출력
				//메소드 호출 후 매개변수 전달만 하면 된다 - list
				list = sp.stuOutput(list);  //여기서 보내고, 받는것 : 그걸 list에 저장해야한다 
				
				break;
				
			case 8:
				list = sp.stuRead();
				System.out.println("[ 파일 읽어오기가 완료되었습니다. ]");
				System.out.println();
				break;
				
				
			}//switch
			
			
			
			
			
		}//while
		
		
		
	}
}
