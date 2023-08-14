import java.util.ArrayList;

public class C0530_05 {
	public static void main(String[] args) {
		//list : 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용한다.
		
		ArrayList list = new ArrayList();
		list.add("abc");   //0
		list.add("abc");   //1
		list.add("bbb");   //2
		list.add("aaa");   //3
		list.add("ccc");   //4
		list.add(3);   //Integer
		System.out.println(list.get(4));
		for(int i=0; i<list.size();i++) {
			System.out.println("list : " + list.get(i));
		}
//----------------------------------------------------------------------------------		
//		ArrayList list2 = new ArrayList();
//		list2.add(new Student(1,"홍길동",100,100,100));
//		list2.add(new Student(2,"유관순",90,90,90));
//		list2.add(new Student(3,"이순신",80,80,80));
//		
////		for(int i=0; i<list2.size();i++) {
////			System.out.println("list : " + list2.get(i));
////		}      
////		//=>이렇게 찍으면 주소가 나온다
//		
//		//
//		for(int i=0;i<list2.size();i++) {
//			Student student = (Student) list2.get(i);
////			System.out.println("이름 : " + student.getName());
////			System.out.println("총합 : " + student.getTotal());
//			System.out.printf("%d %s %d %d %d %d %.1f \n", 
//					student.getStuNo(), 
//					student.getName(), 
//					student.getKor(), 
//					student.getEng(), 
//					student.getMath(), 
//					student.getTotal(),
//					student.getAvg());
//		}
////----------------------------------------------------------------------------------
//		ArrayList<Student> list2 = new ArrayList();   //지네릭스 : 특정형태만 들어올 수 있게 막음
//		list2.add(new Student(1,"홍길동",100,100,100));
//		list2.add(new Student(2,"유관순",90,90,90));
//		list2.add(new Student(3,"이순신",80,80,80));
//		
////		for(int i=0; i<list2.size();i++) {
////			System.out.println("list : " + list2.get(i));
////		}      
////		//=>이렇게 찍으면 주소가 나온다
//		
//		//
//		for(int i=0;i<list2.size();i++) {
//			Student s = list2.get(i);    //지네릭스를 쓰면 여기서 형변환을 안해도 된다.
////			System.out.println("이름 : " + student.getName());
////			System.out.println("총합 : " + student.getTotal());
//			System.out.printf("%d %s %d %d %d %d %.1f \n", 
//					s.getStuNo(), 
//					s.getName(), 
//					s.getKor(), 
//					s.getEng(), 
//					s.getMath(), 
//					s.getTotal(),
//					s.getAvg());
//		}
		
		
		
		
		
		
	}
	
}
