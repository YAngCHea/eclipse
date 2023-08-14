import java.util.ArrayList;
import java.util.List;

public class C0531_01 {
	public static void main(String[] args) {
		//다형성 부모의 참조변수로 자손의 객체를 다루는 것
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
//		Student s1 = new Student(1,"홍길동",100,100,100);
//		list.add(s1);
		
		list2.add(new Student(1,"홍길동",100,100,100));
		list2.add(new Student(2,"유관순",100,100,100));
		Student s = (Student) list2.get(1);
		
//		System.out.println((Student)(list2.get(1)));    //list2.get(1) 여기다가 괄호를 안붙이면 list2만 형변환이 된다
		System.out.println(((Student)list2.get(1)).getName());
		
		System.out.println("------------------------------------");
		
		List<Student> list3 = new ArrayList<>();    //지네릭스 : 받을 타입을 미리 결정하는것
		list3.add(new Student(1,"홍길동",100,100,100));
		list3.add(new Student(2,"유관순",100,100,100));		
		
		Student ss = list3.get(0);
		System.out.println(ss.getName());
		System.out.println(list3.get(0).getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
