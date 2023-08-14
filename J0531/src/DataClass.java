import java.util.ArrayList;
import java.util.List;

public class DataClass {

	int numAdd(int num1, int num2) {
		System.out.println("더하기");
		int sum = num1 + num2;
		return sum;
	}
	
	Student stuAdd(int kor, int eng, int math) {
		System.out.println("학생성적추가");
		int stuNo = 1;
		String name = "홍길동";
		Student s = new Student(stuNo, name, kor, eng, math);
		return s;
	}
	
	
	List<Student> stulist() {
		List<Student> list = new ArrayList<>();
//		ArrayList<Student> list = new ArrayList<>();    //위에꺼로 선언해도 됨 : 위에꺼가 더 큰범주
		System.out.println("list");
		
		list.add(new Student(1,"홍길동",100,100,100));
		list.add(new Student(2,"이순신",90,90,90));
		
		return list;   //선언된 리턴타입의 이름만 넣으면 되는것
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
