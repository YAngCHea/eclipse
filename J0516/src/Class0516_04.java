// 객체 진도나가기 ppt.123

public class Class0516_04 {

	String name = "";
	int kor = 0;
	int total = 0;
	
	
	//메인 메소드
	public static void main(String[] args) {
//		//객체 : 배열은 하나의 종류만 넣을 수 있는데 객체는 여러가지 타입을 다 넣을 수 있다.
//		
//		//원래는 이런식으로 선언했었음 : 변수가 더 필요하면 다른이름으로 계속 생성했음
//		String name = "";
//		String name2 = "";
//		int kor = 0;
//		int kor2 = 0;
//		String[] arrname = new String[5];
//		int[] arrkor = new int[5];
//		
//		name = "홍길동";
//		
//		
//		Student s1 = new Student(); //홍길동, 100
//		Student s2 = new Student(); //유관순,99
		
		//변수선언
		int a = 0;                       //기본형변수 a
		String str = new String();       //참조변수 str
		String s = "";
		
		
		
		
		//객체선언
		TV t = new TV();   //이런식으로 선언하면 TV안에 들어있는 모든게 들어가 있다.
		                   //선언을 해야지 쓸 수 있다 : 이름은 뭐든 상관없음(영어권장)

		t.color = "white";
		System.out.println(t.color);
		
		//객체선언
		TV t2 = new TV();
		t2.color = "red";
		System.out.println(t2.color);
	}

}
