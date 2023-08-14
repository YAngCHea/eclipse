package j0508_01;

public class Class0508_03 {

	static int n = 0; //여기서도 변수를 선언할 수 있음
	             //이 위에서 선언을 한다 = 전역변수 : main안에서도 사용가능한 함수
	             //자동으로 디폴트 값을 0으로 설정해준다
	static int n1;
	
	public static void main(String[] args) {
		int num = 0;    //main안에서 변수를 선언 = 지역변수(함수내부에서 선언하는 변수)
		                //main 안에 있는 변수에는 디폴트값을 자동으로 넣어주지 않는다 : 무조건 값을 지정해서 넣어줘야함
		System.out.println("main메소드 num 호출 : "+num);
		sub();          //아래 있는 sub()를 실행시키고 다시 돌아와!
	}
	
	static void sub( ) {
	//System.out.println(num);         //main안에서 선언한 num은 main안에서만 사용가능
    //System.out.println("sub메소드 num 호출 : "+num);     //main안에서 선언한 num은 main안에서만 사용가능
	System.out.println(n);
	}

}
