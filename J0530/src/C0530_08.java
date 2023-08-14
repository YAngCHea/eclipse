import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class C0530_08 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("aaa");
		list.get(0);
		
		HashMap map = new HashMap<>();
		map.put("id", "aaa");
		map.put("list", "data");
		map.put("no", "1");
		map.put("lastNo", "100");
		map.put("id", "bbb");
		//1개 출력
		System.out.println("map : " + map.get("id"));
		//전체출력
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
