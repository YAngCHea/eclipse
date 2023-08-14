import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class C0531_06 {
	public static void main(String[] args) {
		int stuNo = 0;
		String name = "";
		int kor = 0, eng = 0, math = 0;
		List<Student> list = new ArrayList<>();
		
		//BufferedReader - student.txt;
		//println 출력
		
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
				
				
//				list.add(new Student(stuNo, name, kor, eng, math));
				
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
