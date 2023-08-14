import java.util.ArrayList;

public class C0525_01 {
	
	public static void main(String[] args) {
////---배열로 돌려보기 : ArrayList의 중요성 강조하기-----------------------------------------------------	
//		Card[] c = new Card[3];    //배열사용하기
//		
//		Card c1 = new Card(Card.kinds[0],1);
//		Card c2 = new Card(Card.kinds[1],1);
//		Card c3 = new Card(Card.kinds[2],1);
//		Card c4 = new Card(Card.kinds[3],1);
//		
//		c[0] = c1;
//		c[1] = c2;
//		c[2] = c3;
//		c[3] = c4;
		
//		//코드를 짤 때 에러는 안나지만 실행시키면 에러가 난다 : 종료된다 : 실제 프로그램을 돌릴때 문제가 된다.
//		//배열은 늘릴 수 없기때문에 고치려면 애초에 개수를 늘려야한다 : 실질적으로 어려운말
		
////---ArrayList 사용하기-----------------------------------------------------------------------------------------------		
//	//1. <> 사용X : 들어갈 수 있는 변수 한정X
//		ArrayList list = new ArrayList();
//		
//		Card c1 = new Card(Card.kinds[0],1);
//		Card c2 = new Card(Card.kinds[1],1);
//		Card c3 = new Card(Card.kinds[2],1);
//		Card c4 = new Card(Card.kinds[3],1);
//		
//		//1)ArrayList 추가하기 
//		list.add(c1);//0  //Object o = new Card(Card.kinds[1],1)   라는 뜻
//		list.add(c2);//1
//		list.add(c3);//2
//		list.add(c4);//3
//		// c1,c2,c3,c4 => 타입이 object
//		
//		//2)ArrayList 읽기
////		list.get(0);
////		System.out.println(c1);              //아래꺼랑 똑같이 나옴 : 주소값만 출력
////		System.out.println(list.get(0));     //list.get 자체가 Object랑 같음
//		
//		Card card = (Card)list.get(0);      //강제형변환한다 : 부모인Object에서는 열 수 없으니까!!
//		System.out.println(card.kind + "," + card.number); 
////--------------------------------------------------------------------------------------------------		
    //2.<> 사용 : 들어갈 수 있는 변수를 Card안에 있는것으로 한정
		ArrayList<Card> list = new ArrayList();
		
		Card c1 = new Card(Card.kinds[0],1);
		Card c2 = new Card(Card.kinds[1],2);
		Card c3 = new Card(Card.kinds[2],3);
		Card c4 = new Card(Card.kinds[3],4);
		
	//1)ArrayList 추가하기 : .add
		list.add(c1);//0  //Object o = new Card(Card.kinds[1],1)   라는 뜻
		list.add(c2);//1
		list.add(c3);//2
		list.add(c4);//3
		// c1,c2,c3,c4 => 타입이 object
		
	//2)ArrayList 읽기 : .get
		Card card = (Card)list.get(0);      //강제형변환한다 : 부모인Object에서는 열 수 없으니까!!
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number); 
		}
		System.out.println("개수 : " + list.size());
		
	//3)ArrayList 지우기 : .remove
		
		//Q. kind = HEART 삭제하기.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).kind.equals("HEART") ) {     //String일때 == 안댐  .equals 쓰기
				list.remove(i);
			}
		}
		//Q2. number = 4 삭제하기.
		for(int i=0;i<list.size();i++) {
			if(list.get(i).number == 4) {
				list.remove(i);
			}
		}
		

		System.out.println("---------------------------------------");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number); 
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
