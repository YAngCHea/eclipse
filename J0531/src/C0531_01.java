import java.util.ArrayList;
import java.util.List;

public class C0531_01 {
	public static void main(String[] args) {
		//������ �θ��� ���������� �ڼ��� ��ü�� �ٷ�� ��
		List list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		
		System.out.println(list.get(1));
		
		for(int i=0;i<list.size();i++) {
			System.out.println();list.get(i);
		}
		
		System.out.println("------------------------------------");
		
		List list2 = new ArrayList<>();
//		Student s1 = new Student(1,"ȫ�浿",100,100,100);
//		list.add(s1);
		
		list2.add(new Student(1,"ȫ�浿",100,100,100));
		list2.add(new Student(2,"������",100,100,100));
		Student s = (Student) list2.get(1);
		
//		System.out.println((Student)(list2.get(1)));    //list2.get(1) ����ٰ� ��ȣ�� �Ⱥ��̸� list2�� ����ȯ�� �ȴ�
		System.out.println(((Student)list2.get(1)).getName());
		
		System.out.println("------------------------------------");
		
		List<Student> list3 = new ArrayList<>();    //���׸��� : ���� Ÿ���� �̸� �����ϴ°�
		list3.add(new Student(1,"ȫ�浿",100,100,100));
		list3.add(new Student(2,"������",100,100,100));		
		
		Student ss = list3.get(0);
		System.out.println(ss.getName());
		System.out.println(list3.get(0).getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
