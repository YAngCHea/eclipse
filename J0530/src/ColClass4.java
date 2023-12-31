import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass4 {

	// list,nowPage=1,startRow=1,endRow=10
	// 메소드명 : execute4()
	// 리턴타입 : Map<String,Object> map

	// map리턴하시오.
    Map<String, Object> execute4(){
		
		Map<String, Object> map = new HashMap<>();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student());
		
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",90,90,90));
		list.add(new Student(3,"이순신",80,80,80));
		list.add(new Student(4,"강감찬",100,100,99));
		list.add(new Student(5,"김구",90,90,90));
		list.add(new Student(6,"홍길순",80,80,80));
		list.add(new Student(7,"홍길자",100,100,99));
		list.add(new Student(8,"김유신",90,90,90));
		list.add(new Student(9,"김유순",80,80,80));
		list.add(new Student(10,"김유자",80,80,80));
		
		int nowPage = 1;
		int startRow = 1;
		int endRow = 10;
		
		map.put("list", list);
		map.put("nowPage", nowPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
		return map;
	
}
}
