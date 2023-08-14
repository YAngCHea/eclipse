import java.util.ArrayList;
import java.util.Iterator;

public class C0530_06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		
//		list.remove(3);
//		list.remove(4);
		//지워지면 그 순번을 메꾸는식으로 지워진다
		
		//출력하기
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
//		//전체지우기  => 앞에서부터 지우면 배열복사가 발생한다
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.remove(i));
//		}
		
		//전체지우기  => 그래서 뒤에서부터 지워야함
				for(int i=list.size()-1;i>=0;i--) {
					System.out.println(list.remove(i));
				}
		
		System.out.println("몇개일까여! : " + list.size());
		
//-------------------------------------------------------------------
//		Iterator 사용해서 출력하기
		Iterator it = list.iterator();//컬렉션
		
		while(it.hasNext()) {     //데이터가 있는지 확인하기
			System.out.println(it.next());      //1개의 데이터를 가져온다 //이후 다시 위로 올라가서 돌아간다
		}
//----------------------------------------------------------------------
		//Iterator 사용출력 - 예전버전 : enumeration 
		//여러번쓰려면 여러번 선언해야한다
		Iterator it2 = list.iterator();// 컬렉션

		while (it2.hasNext()) { // 데이터가 있는지 확인하기
			System.out.println(it2.next()); // 1개의 데이터를 가져온다 //이후 다시 위로 올라가서 돌아간다
		}

		Iterator it3 = list.iterator();// 컬렉션

		while (it3.hasNext()) { // 데이터가 있는지 확인하기
			System.out.println(it3.next()); // 1개의 데이터를 가져온다 //이후 다시 위로 올라가서 돌아간다
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
