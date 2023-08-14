import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StuProcess {

	ArrayList<Student> list = new ArrayList<>();  //얘를 위로 뽑아놔야 list를 편하게 쓸 수 있다
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;
	String createDate;
	
//---파일 읽어오기 메소드 : 리턴타입 메소드명()--------------------------------------------------------
	ArrayList<Student> stuRead() throws Exception {    //try-catch 대신 throws Exception 를 쓰는것!!
		//파일에 있는 글자를 읽어오기
		BufferedReader br = null;   
		br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
		
		while(true) {
			String data = br.readLine(); //1줄 읽어오기
			if(data==null) break;
			String[] dataArr = data.split(",");    //데이터 분리 : ,를 기준으로 짜름 : 1,홍길동,100,100,100,2023-06-01  를 전부 분리해서 넣어줘
			//Integer.parseInt() : 잘라오면 String으로 잘린다 => int 형태로 바꿔주는것!
			stuNo = Integer.parseInt(dataArr[0]);
			name = dataArr[1];
			kor = Integer.parseInt(dataArr[2]);
			eng = Integer.parseInt(dataArr[3]);
			math = Integer.parseInt(dataArr[4]);
			createDate = dataArr[5];
			list.add(new Student(stuNo, name, kor,eng, math, createDate));    //list에 저장
		}
		br.close();
		return list;
	}
	
	
	
	
	
//---학생성적입력 메소드--------------------------------------------------------------------------
	void stuInput() { // return 할 타입으로 변경해줘야한다
		
		while (true) {
			System.out.println("[ 학생성적 입력 ]");
			System.out.println((list.size() + 1) + "학생번호를 입력하세요");
			stuNo = (list.size() + 1);
			System.out.println((list.size() + 1) + "번째 이름을 입력하세요(0.이전페이지로 이동)");
			name = scan.next();

			// 0.이전페이지 이동
			if (name.equals("0")) {
				System.out.println("[ 이전페이지로 이동합니다 ]");
				System.out.println();
				break;
			}

			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			//날짜입력하기
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			createDate = sdf.format(today);
			
			//저장하기
			list.add(new Student(stuNo,name,kor,eng,math,createDate));
			System.out.println("저장되었습니다.");
			System.out.println();
		}//while
//		return list;    //얘가 없어도 된다
	}//stuInput
}
