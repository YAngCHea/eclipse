package j0508_01;

//10.강제 형변환

public class Class0508_06 {
	
	public static void main(String[] args) {
		//형변환
		//기본형 - 8가지
		// 논리형 1바이트 - boolean 
		// 문자형 2바이트 - char
		// 정수형 1/2/4/8바이트 - byte, short, int, long
		// 실수형 4/8바이트 - float, double
		// 문자열 - String
		
		// 큰거에서 작은거로 변환할때는 무조건 ()안에 지정해줘야함
		float flo = 1.6f;  //소수점이 있음
		int i = (int)flo;      // 강제적으로 ()안에 변환 할 형태를 넣어줘야한다. : 강제 형변환
		                       // 소수점 아래가 사라진다
		System.out.println(i);    
		
		// 거꾸로도 가능 : 작은거에서 큰거로 넘어갈때는 ()로 지정 안해줘도 된다.
		int num = 10;
		double d = num;            //작은쪽에서 큰쪽으로 넘어가는것도 가능하다
		                           //소수점이 붙어서 넘어온다
		System.out.println(d);    
		
		//크기의 순서
		// String > double > float > long > int > char, byte, short
		
	    char ch = 'A';
	    int n = ch;
	    System.out.println(n);   //65
	    
	    int n2 = 97;
	    char ch2 = (char)n2;
	    System.out.println(ch2);
	}

}
