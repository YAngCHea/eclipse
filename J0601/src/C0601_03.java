import java.io.FileWriter;
import java.io.IOException;

public class C0601_03 {

	public static void main(String[] args) {
		
		//
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/a.txt",true);    //true를 붙이면 추가로 저장이 된다
//			fw = new FileWriter("c:/savedata/a.txt",false);    //false를 붙이면 저장된것이 빠진다
			String data = "안녕하세요. 오늘도 날씨가 좋아요.\r\n";
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("파일이 저장되었습니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
