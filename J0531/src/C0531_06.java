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
		//println ���
		
		BufferedReader br = null;
		FileReader fr = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			while(true) {
//				if(br.readLine() == null) break;
//				System.out.println(br.readLine());  
				//�̷������� ������ϰ� �׳� ����ϸ� ���� ������������.
				
				String data = br.readLine();
				if(data == null) break;
				String[] dataArr = data.split(",");   
				//1,ȫ�浿,100,100,100�� , �� �������� ������
				System.out.println(data);
				stuNo = Integer.parseInt(dataArr[0]);   
				//int�� �����ϱ� ���ؼ� integer.parseInt�� �����ִ°�
				name = dataArr[1];  //��� stringŸ��
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
