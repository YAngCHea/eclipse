import java.util.ArrayList;

public class C0525_02 {

	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<Card> list = new ArrayList<>();
		
		//ArrayList에 넣기
//		Card c1 = new Card(Card.kinds[0],1);
//		Card c2 = new Card(Card.kinds[0],2);
//		Card c3 = new Card(Card.kinds[0],3);
		
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);
		
//		list.add(new Card(Card.kinds[0],1));
//		list.add(new Card(Card.kinds[0],2));
//		list.add(new Card(Card.kinds[0],3));
//------------------------------------------------------------------------------------------		
////		//퀴즈1 : 1~13번까지 넣어보세욥
//		for(int i=0; i<13;i++) {
//				list.add(new Card(Card.kinds[0],i+1));
//		}
//		
//		//출력하기
//		for (int i = 0; i < 13; i++) {
//			System.out.println(list.get(i).kind + "," + Card.numbers[list.get(i).number]);
//		}
////--------------------------------------------------------------------------------------------		
//		//퀴즈2 : 카드 4개를 만들어서, 4가지 종류를 넣으세요 : 총52개 출력
//		for (int j = 0; j < 4; j++) {
//			for (int i = 0; i < 13; i++) {
//				list.add(new Card(Card.kinds[j], i + 1));
//			}
//		}
//		//출력하기
//		for (int j = 0; j < 4; j++) {
//			for (int i = 0; i < 13; i++) {
//				System.out.println(list.get(13*j).kind + "," + Card.numbers[list.get(i).number]);
//			}
//		}
//--------------------------------------------------------------------------------------------		
	//퀴즈3. for문 한번만 써서 52개 돌리기
		for(int i=0;i<52;i++) {
			list.add(new Card(Card.kinds[i/13],(i%13)+1));
		}
		
		//출력하기
		for (int i=0;i<52;i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number);
		}
		
	}
}
