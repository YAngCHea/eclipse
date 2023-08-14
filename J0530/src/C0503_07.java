import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0503_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		list.add("bbb");
		list.add("ccc");
		//출력하기
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
//-------------------------------------------------------------------		
		HashSet hs = new HashSet();
		hs.add("abc");
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("abc");
		hs.add("bbb");
		hs.add("aaa");
		
		// 출력하기
		Iterator it2 = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it2.next());
		}

		System.out.println("----------------------------");
		
		
		
		
		
		
		
		
	}

}
