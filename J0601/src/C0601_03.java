import java.io.FileWriter;
import java.io.IOException;

public class C0601_03 {

	public static void main(String[] args) {
		
		//
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/a.txt",true);    //true�� ���̸� �߰��� ������ �ȴ�
//			fw = new FileWriter("c:/savedata/a.txt",false);    //false�� ���̸� ����Ȱ��� ������
			String data = "�ȳ��ϼ���. ���õ� ������ ���ƿ�.\r\n";
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
		
		System.out.println("������ ����Ǿ����ϴ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
