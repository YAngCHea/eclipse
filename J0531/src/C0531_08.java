import java.util.ArrayList;
import java.util.List;

public class C0531_08 {

	public static void main(String[] args) {
		//객체선언
		DataClass d = new DataClass();
		
		
		int num1 = 10;
		int num2 = 5;
		int sum = d.numAdd(num1,num2);
		System.out.println(sum*2);
		
		int kor = 100;
		int eng = 100;
		int math = 99;
		
		Student s = d.stuAdd(kor, eng, math);
		System.out.println(s.getTotal());
		
		
        System.out.println();
		
		//학번과 이름을 출력하세요
//		List<Student> list = new ArrayList<>();
        
        List<Student> list = d.stulist();
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d \n", 
					list.get(i).getStuNo(),
					list.get(i).getName(),
					list.get(i).getKor(),
					list.get(i).getEng(),
					list.get(i).getMath());
		}
		System.out.println("-----------------");
		
	}

}
