import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass {
	
	Map<String, Object> execute(){
		
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
		
		int nowPage = 3;
		int startRow = 21;
		int endRow = 30;
		
		map.put("list", list);
		map.put("nowPage", nowPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
		return map;
	}
	
	
}
