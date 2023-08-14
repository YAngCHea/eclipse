package j0508_01;

public class Class0508_02 {//class    : 계속 중괄호를 써야한다

	public static void main(String[] args) {//main
		boolean power = true;
		
        //char ch = "A";   // ""를 쓰면 String 형태
		char ch = 'A';
		int num = 1;
		int num2 = 1+ch;   //에러가 안뜬다 : 문자 + 숫자
		char ch2 = '\u0041';        
		char ch3 = 65;             //아스키코드로 A
		char tab = '\t';           //tab으로 인식
		
		byte b = 127;
		short s = 32767;
		int i = 100;
		int oct = 0100;   //8진수
		int hex = 0x100;  //16진수
		
		long l = 1000000000L;
		float f = 3.14f;
		double d = 3.14;
		float f2 = 100f;
		
		System.out.println(power);    //출력하기 : 결과값을 consol에 표시해준다  : 맨 위쪽에 출력버튼 : 단축키ctrl+f11
		System.out.println(ch);
		System.out.println(num2);      //66나온다 : 아스키코드에서 A는 65 => +1을 했을때 66이 나오는것
		System.out.println("" + ch + num);    //A1를 출력하고 싶으면 ""로 문자열로 바꾼다음 출력해야한다
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(""+tab+ch2);       //""가 있어야 문자열로 인식해서 결과값이 나온다
		System.out.println(f2);
	}//main   : 얘를 안쓰면 나중에 찾기가 힘들다

}//class

