import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	
	//파일 불러오기
	List<Student> stuRead(){	
		List<Student> list = new ArrayList<>();
		
		BufferedReader br = null;
		FileReader fr = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			while(true) {
//				if(br.readLine() == null) break;
//				System.out.println(br.readLine());  
				//이런식으로 선언안하고 그냥 출력하면 단이 내려가버린다.
				
				String data = br.readLine();
				if(data == null) break;
				String[] dataArr = data.split(",");   
				//1,홍길동,100,100,100를 , 를 기준으로 나눈다
				System.out.println(data);
				stuNo = Integer.parseInt(dataArr[0]);   
				//int로 변경하기 위해서 integer.parseInt로 묶어주는것
				name = dataArr[1];  //얘는 string타입
				kor =Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				
				
				list.add(new Student(stuNo, name, kor, eng, math));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
		
	}
	
	//파일 읽어오기
	
	
	Scanner scan = new Scanner(System.in);
	// 메소드
//	void stuInput(List<Student> list) {     //
//		System.out.println("stuInput 메소드가 호출되었습니다.");
//		list.get(0);
//		System.out.println(list.get(0).getName());
//		
//	}   //여기서 끝나고 나면 C0531_02의 case 1으로 다시 돌아간다
////-----------------------------------------------------------	
//	
//	//메소드
//			List<Student> stuInput(List<Student> list) {     //
//				System.out.println("stuInput 메소드가 호출되었습니다.");
//				list.add(new Student(3,"이순신",100,100,100));
//				
//				return list;//얘를 이렇게 넣으면 리스트로 돌아간다
//			}  //계속 돌리면 계속 추가가 된다
//----------------------------------------------------------------	
	// 변수선언
	int stuNo;
	String name;
	int kor, eng, math;
//----------------------------------------------------------------------------------
	// 메소드=>case 1    
//	List<Student> stuInput(List<Student> list, int stucount) { //아래서 map으로 변경했으니까 여기도 map으로 변경해야함
	Map<String,Object> stuInput(List<Student> list, int stucount) {
		while (true) {
			System.out.println("[ 학생성적입력 ]");
//-------------------------------------------------------------------------
//			System.out.println("학번을 입력하세요.(0.이전페이지로)");
//			stuNo = scan.nextInt();
//
//			if (stuNo == 0) {
//				System.out.println("[이전페이지로 돌아갑니다]");
//				break;
////				return list;
//			}
//------------------------------------------------------------------------
			
			System.out.println("이름을 입력하세요.(0.이전페이지로)");
			name = scan.next();
			
			if (name.equals("0")) {       //name이 String타입이기 때문에 "0"으로 써야한다
				System.out.println("[이전페이지로 돌아갑니다]");
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			list.add(new Student(stucount, name, kor, eng, math)); // 얘를 넣어두면 자동으로 저장되어서 넘어간다

			stucount++;  //학번 1씩 증가
			//break;//while문 안에 break가 없으면 오류가 뜬다 근데 여기에 있으면 여기서 끊긴다
		}

		System.out.println();
		//list, stucount 2개
		Map<String, Object> map = new HashMap<>();   //map 1개를 보내는 것 
		map.put("list", list); //list = list  : list라는 형식의 list(이름)을 보내는 것
		map.put("stucount", stucount);  //stucount = 4
		
		return map;  //위에서 map으로 변경했으니까 map으로 보내야한다
//		return list;// 얘를 이렇게 넣으면 리스트로 돌아간다

	} // 다시 case 1로 돌아간다
	
	
	
//--case 2----------------------------------------------------------------------------------------------
	List<Student> stuOutput(List<Student> list) {    //매개변수 list설정해줘야함
		System.out.println("[ 학생성적 출력화면 ]");
		
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		//출력
//		System.out.println("[ 학생성적 출력화면 ]");
		System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \t %s \t %s \n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6],title[7]);
//		System.out.println("학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 합계 \t 평균 \t 등수");
		System.out.println("----------------------------------------------------------------");
		for (int i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d \t %s \t %d \t %d \t %d \t %d \t %.1f \t %d\n",
					s.getStuNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}
		
		return list;   //처음에 리턴타입을 List로 넣었으니까 list로 받아야함
		

	}//stuOutput
	
	
	
	
	
	
	
	
	
	
	
	
}
