import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;
	String createDate,updateDate;

	//���� �����ϱ�
	void stuSave(List<Student> list) {
		//��������
		String data="";
		for(int i=0;i<list.size();i++) {
			data += String.format("%d,%s,%d,%d,%d,%s,%s\r\n",
					list.get(i).getStuNo(),list.get(i).getName().trim(),
					list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
					list.get(i).getCreateDate(),list.get(i).getUpdateDate()
					);
		}//for
		
		//data = "1,ȫ�浿,100,100,99\r\n2,������,99,99,98\r\n3,�̼���,88,88,87\r\n";

		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//try
		
	}//stuSave
	
	
	//���� �о����
	List<Student> stuRead(){
		List<Student> list = new ArrayList<>();
		// ���� �о����
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data="";
			while(true) {
				data = br.readLine();
				if(data==null) break;
				String[] dataArr = data.split(","); //1,ȫ�浿,100,100,99 + 10010099 299
				//System.out.println(data);
				
				stuNo = Integer.parseInt(dataArr[0]);
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				createDate = dataArr[5];
				list.add(new Student(stuNo,name,kor,eng,math,createDate));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		// ���� �о����
		return list;
	}
	
	//�л�������� - ����Ÿ�� �޼ҵ��
	List<Student> stuOutput(List<Student> list ) {
		//
		String[] title = {"�й�","�̸�","����","����","����","�հ�","���","���","�Է���","������" };
		//���
		System.out.println("[ �л����� ���ȭ�� ]");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6],title[7],title[8],title[9]
				);
		System.out.println("----------------------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%s\t%s \n",
					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank(),s.getCreateDate(),s.getUpdateDate()
					);
		}
		System.out.println();
		
		return list;
	}//stuOutput
	
	
	// ����Ÿ�� �޼ҵ��
	Map<String,Object> stuInput(List<Student> list,int stuCount) {
		// �ݺ�
		while (true) {
			System.out.println("[ �л����� �Է� ]");
			System.out.println(stuCount+"��° �̸��� �Է��ϼ���.(0.���������� �̵�)");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("[ ���������� �̵� ]");
				break;
			}
			System.out.println("���������� �Է��ϼ���.");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			math = scan.nextInt();
			//��¥��ü����
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			createDate = sdf.format(d);
			
			
			list.add(new Student(stuCount, name, kor, eng, math,createDate));

			stuCount++; //1����
		} // while

		System.out.println();
		// list,stuCount 2��
		Map<String, Object> map = new HashMap<>();
		map.put("list", list); // list=list
		map.put("stuCount", stuCount); //stuCount=4
		
		return map;
	}//stuProcess
	
	
}
