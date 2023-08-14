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
//---1)InputStream : �ܺο� ������ �� try~catch--------------------------------------------------------------
		InputStream is = null;
		try {
			is = new FileInputStream("c:/savedata/a.txt");
			
////--------------------------------------------------------------------------------------
//			int i = is.read();     //���� �� ��ü �о���� �ѱ��ھ� �����°�  
//			System.out.println("������ : " + (char)i);
//			i = is.read();
//			System.out.println("������ : " + (char)i);
//			i = is.read();
//			System.out.println("������ : " + (char)i);
//		//=> �̷��� �ϳ��������� �󸶳� ����� �𸣴ϱ� while�� ���°�
////----------------------------------------------------------------------------------			
			
			int i = -1;
			while(true) {
				if((i = is.read())==-1) break;      //is.read()�� -1�̸� ���̻� �о�� �����Ͱ� ����
				System.out.println("������ : " + (char)i);    //����� �ѱ��ڰ� 1byte�� �������� �ѱ��� 2byte�� �̻��ϰ� ���´�
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
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");			
//			String str = scan.nextLine();
			String str = "���ڸ� �Է��մϴ�. �ȳ��ϼ���\r\n �ݰ����ϴ�. �ٴܶ��� �Ͽ����ϴ�.\r\n";
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
		
		System.out.println("������ ����Ǿ����ϴ�.");
		
		
		
		
	}//main
}
