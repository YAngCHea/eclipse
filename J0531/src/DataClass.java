import java.util.ArrayList;
import java.util.List;

public class DataClass {

	int numAdd(int num1, int num2) {
		System.out.println("���ϱ�");
		int sum = num1 + num2;
		return sum;
	}
	
	Student stuAdd(int kor, int eng, int math) {
		System.out.println("�л������߰�");
		int stuNo = 1;
		String name = "ȫ�浿";
		Student s = new Student(stuNo, name, kor, eng, math);
		return s;
	}
	
	
	List<Student> stulist() {
		List<Student> list = new ArrayList<>();
//		ArrayList<Student> list = new ArrayList<>();    //�������� �����ص� �� : �������� �� ū����
		System.out.println("list");
		
		list.add(new Student(1,"ȫ�浿",100,100,100));
		list.add(new Student(2,"�̼���",90,90,90));
		
		return list;   //����� ����Ÿ���� �̸��� ������ �Ǵ°�
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
