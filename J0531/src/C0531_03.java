import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class C0531_03 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//---1)InputStream : 외부와 접속할 때 try~catch--------------------------------------------------------------
		InputStream is = null;
		try {
			is = new FileInputStream("c:/savedata/a.txt");
			
////--------------------------------------------------------------------------------------
//			int i = is.read();     //파일 을 전체 읽어봐서 한글자씩 꺼내는것  
//			System.out.println("데이터 : " + (char)i);
//			i = is.read();
//			System.out.println("데이터 : " + (char)i);
//			i = is.read();
//			System.out.println("데이터 : " + (char)i);
//		//=> 이렇게 하나씩읽으면 얼마나 긴건지 모르니까 while을 쓰는것
////----------------------------------------------------------------------------------			
			
			int i = -1;
			while(true) {
				if((i = is.read())==-1) break;      //is.read()가 -1이면 더이상 읽어올 데이터가 없음
				System.out.println("데이터 : " + (char)i);    //영어는 한글자가 1byte라서 괜찮지만 한글은 2byte라서 이상하게 나온다
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
			
		
		
//---2)OutputStream----------------------------------------------------------------------------------------
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:/savedata/a.txt");
			System.out.println("원하는 글자를 입력하세요.");			
//			String str = scan.nextLine();
			String str = "글자를 입력합니다. 안녕하세요\r\n 반갑습니다. 줄단락을 하였습니다.\r\n";
			byte[] bs = str.getBytes();
			os.write(bs);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일이 저장되었습니다.");
		
		
		
		
	}//main
}
