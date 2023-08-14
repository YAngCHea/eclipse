import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C0531_07 {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			for(int i=0;i<3;i++) {
				String data = "1,홍길동,100,100,100\r\n2,유관순,90,90,90\r\n3,이순신,80,80,80";
				fw.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		String data = "";
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍기동",100,100,100));
		list.add(new Student(2,"유관순",100,100,100));
		list.add(new Student(3,"김유신",100,100,100));
		
		
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			data += String.format("%d \t %s \t %d \t %d \t %d \t %d \t %.1f \t %d\n",
					s.getStuNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
			
		}
		
		
		
		
		
		
//		// student.txt 파일 읽어오기
//		BufferedReader br = null;
//		br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
//		String data = "";
//		while(true) {
//			data = br.readLine();
//			if(data == null)break;
//			System.out.println(data);
//		}
//		br.close();

	}

}
