package j0508_01;

public class Class0508_04 {

	public static void main(String[] args) {
		
		long num = 2;        //long으로 선언을 해두면 long보다 작은 크기는 들어갈수있다 : byte,short,int
		long num2 = 0L;      //21억보다 작은 수는 L울 빼도 돌아가긴 한다. 하지만 습관적으로 붙이는게 좋음 
		
		char ch = 'A';
		//char ch2 = 'AB';
		char ch3 = ' ';
		String str1 = "";
		
		String str2 = "a"+"b";
		System.out.println(str2);
		
		int num3 = 7;
		String num4 = "7";
		int num5 = 7;
		System.out.println(num3 + num4);    //얘는 77이 나온다 : 문자열로 인식이 된 num4가 그냥 합쳐지는것  
		                                    //결과로 나오는 77은 문자열로 인식이 된다.
		System.out.println(num3 + num4 + num5);       //777    : type 문자열String
		System.out.println(num3 + num5 + num4);       //147    : type 문자열String
		System.out.println(num3 + num5);              //14     : type 숫자열int
		System.out.println("결과값 : "+ num3 + num5);   //결과값 : 77       : type String+int+int = String
		System.out.println("결과값 : "+ (num3 + num5));   //결과값 : 14       : type String+(int+int) = String
	}
}
