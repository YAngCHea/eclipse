import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	
	//���� �ҷ�����
	List<Student> stuRead(){	
		List<Student> list = new ArrayList<>();
		
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
				
				
				list.add(new Student(stuNo, name, kor, eng, math));
				
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
		
		return list;
		
	}
	
	//���� �о����
	
	
	Scanner scan = new Scanner(System.in);
	// �޼ҵ�
//	void stuInput(List<Student> list) {     //
//		System.out.println("stuInput �޼ҵ尡 ȣ��Ǿ����ϴ�.");
//		list.get(0);
//		System.out.println(list.get(0).getName());
//		
//	}   //���⼭ ������ ���� C0531_02�� case 1���� �ٽ� ���ư���
////-----------------------------------------------------------	
//	
//	//�޼ҵ�
//			List<Student> stuInput(List<Student> list) {     //
//				System.out.println("stuInput �޼ҵ尡 ȣ��Ǿ����ϴ�.");
//				list.add(new Student(3,"�̼���",100,100,100));
//				
//				return list;//�긦 �̷��� ������ ����Ʈ�� ���ư���
//			}  //��� ������ ��� �߰��� �ȴ�
//----------------------------------------------------------------	
	// ��������
	int stuNo;
	String name;
	int kor, eng, math;
//----------------------------------------------------------------------------------
	// �޼ҵ�=>case 1    
//	List<Student> stuInput(List<Student> list, int stucount) { //�Ʒ��� map���� ���������ϱ� ���⵵ map���� �����ؾ���
	Map<String,Object> stuInput(List<Student> list, int stucount) {
		while (true) {
			System.out.println("[ �л������Է� ]");
//-------------------------------------------------------------------------
//			System.out.println("�й��� �Է��ϼ���.(0.������������)");
//			stuNo = scan.nextInt();
//
//			if (stuNo == 0) {
//				System.out.println("[������������ ���ư��ϴ�]");
//				break;
////				return list;
//			}
//------------------------------------------------------------------------
			
			System.out.println("�̸��� �Է��ϼ���.(0.������������)");
			name = scan.next();
			
			if (name.equals("0")) {       //name�� StringŸ���̱� ������ "0"���� ����Ѵ�
				System.out.println("[������������ ���ư��ϴ�]");
				break;
			}
			
			System.out.println("���������� �Է��ϼ���");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���");
			eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���");
			math = scan.nextInt();
			list.add(new Student(stucount, name, kor, eng, math)); // �긦 �־�θ� �ڵ����� ����Ǿ �Ѿ��

			stucount++;  //�й� 1�� ����
			//break;//while�� �ȿ� break�� ������ ������ ��� �ٵ� ���⿡ ������ ���⼭ �����
		}

		System.out.println();
		//list, stucount 2��
		Map<String, Object> map = new HashMap<>();   //map 1���� ������ �� 
		map.put("list", list); //list = list  : list��� ������ list(�̸�)�� ������ ��
		map.put("stucount", stucount);  //stucount = 4
		
		return map;  //������ map���� ���������ϱ� map���� �������Ѵ�
//		return list;// �긦 �̷��� ������ ����Ʈ�� ���ư���

	} // �ٽ� case 1�� ���ư���
	
	
	
//--case 2----------------------------------------------------------------------------------------------
	List<Student> stuOutput(List<Student> list) {    //�Ű����� list�����������
		System.out.println("[ �л����� ���ȭ�� ]");
		
		String[] title = {"�й�","�̸�","����","����","����","�հ�","���","���"};
		
		//���
//		System.out.println("[ �л����� ���ȭ�� ]");
		System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \t %s \t %s \n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6],title[7]);
//		System.out.println("�й� \t �̸� \t ���� \t ���� \t ���� \t �հ� \t ��� \t ���");
		System.out.println("----------------------------------------------------------------");
		for (int i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d \t %s \t %d \t %d \t %d \t %d \t %.1f \t %d\n",
					s.getStuNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}
		
		return list;   //ó���� ����Ÿ���� List�� �־����ϱ� list�� �޾ƾ���
		

	}//stuOutput
	
	
	
	
	
	
	
	
	
	
	
	
}
