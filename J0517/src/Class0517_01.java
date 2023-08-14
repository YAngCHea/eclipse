//--Card class에서 참조변수 가져오기 ppt146-------------------------------------------------
public class Class0517_01 {

	public static void main(String[] args) {
//---기본 설정하기-------------------------------------------------------------------------		
//		//객체선언하기
//		Card c1 = new Card();
//		//사용방법 참조변수명.변수명
//		c1.kind = "Heart";
//		c1.number = 7;
//		
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 4;
//
//		System.out.println("c1 카드종류 : " + c1.kind);
//		System.out.println("c1 카드숫자 : " + c1.number);
//		System.out.println("c1 가로길이 : " + c1.width);
//		System.out.println("c1 세로길이 : " + c1.height);
//		System.out.println("-----------------------------");
//		System.out.println("c2 카드종류 : " + c2.kind);
//		System.out.println("c2 카드숫자 : " + c2.number);
//		System.out.println("c2 가로길이 : " + c2.width);
//		System.out.println("c2 세로길이 : " + c2.height);
//		
//---위에꺼에서 width변경하기------------------------------------------------------------------
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		c1.width = 500;        //이런식으로 c1만 바꿨지만 c2의 width도 변경된다
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1 카드종류 : " + c1.kind);
		System.out.println("c1 카드숫자 : " + c1.number);
		System.out.println("c1 가로길이 : " + Card.width);       //500 //c1,c2 이런식으로 써도 되긴하지만 통일성을 위해 card로 쓰는게 좋다
		System.out.println("c1 세로길이 : " + Card.height);
		System.out.println("-----------------------------");
		System.out.println("c2 카드종류 : " + c2.kind);
		System.out.println("c2 카드숫자 : " + c2.number);
		System.out.println("c2 가로길이 : " + Card.width);      //500
		System.out.println("c2 세로길이 : " + Card.height);
		
		
		
		
	}

}
