import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_04 {

	public static void main(String[] args) {
////---1)fileWriter : 문자열 저장하기------------------------------------------------------------
//		File f = new File("c:/savedata/b.txt");
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter(f);
//			for(int i=0;i<10;i++) {
//				String data = i+"번째 줄입니다. \r\n";
//				fw.write(data);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fw.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
//---2)fileReader : 문자열 읽어오기
		File f = new File("c:/savedata/b.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();    //1줄을 ㅇ릭어와서 String에 데이터를 넣음
				if(line == null)break;          //더이상 데이터가 없으면 종료함
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
