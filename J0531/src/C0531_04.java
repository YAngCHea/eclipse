import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_04 {

	public static void main(String[] args) {
////---1)fileWriter : ���ڿ� �����ϱ�------------------------------------------------------------
//		File f = new File("c:/savedata/b.txt");
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter(f);
//			for(int i=0;i<10;i++) {
//				String data = i+"��° ���Դϴ�. \r\n";
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
		
		
		
//---2)fileReader : ���ڿ� �о����
		File f = new File("c:/savedata/b.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();    //1���� ������ͼ� String�� �����͸� ����
				if(line == null)break;          //���̻� �����Ͱ� ������ ������
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
