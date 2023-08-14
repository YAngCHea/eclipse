import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_05 {

	public static void main(String[] args) {
		
//---1)파일 읽어오기---------------------------------------
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("c:/savedata/news.txt"));
//		    
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		
		
//---2)파일쓰기 - c.txt --------------------------------------------------
		File f = new File("c:/savedata/new1.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			String str = "파일쓰기를 시작합니다.";
			fw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}

}
