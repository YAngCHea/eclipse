package j0508_01;

public class Class0508_01 {
	
  public static void main(String[] args) {
	  
	  boolean temp = true;
	  boolean temp2 = false;
	  boolean temp3;
	  temp3 = true;

	  char ch1 = ' ';     //'' 공백없이는 사용할 수 없음, 문자형 타입
	  char ch2 = 'a';     //무조건 작은따옴표 사용해야한다
	  char ch3 = 'A';
	  char ch4 = 't';
	  //char ch5 = " ";     //"" 사용불가
	  
	  byte num1 = 1;
	  short num2 = 10;
	  //byte num3 = 256;   // 127까지 숫자표현 가능
	  //short num4 = 32768;    //32767까지 표현가능
      
	  int num5 = 21;
	  // int num6 = 2147483648;   //2147483647까지 숫자표현 가능
	  long num7 = 21;
	  //long num8 = 2147483648;      //접미사 L을 안붙여서 에러가 난다 : l,L둘다 사용가능하지만 1이랑 헷갈려서 L사용
	  long num8 = 2147483648L;
	  
	  float num9 = 9.87654321f;     // 접미사 f/F를 붙여야 오류가 안난다 : float(실수형 소수점)
	                                // 실수형 : 8자리까지 정밀도 표현 가능 
	                                //: 8자리가 넘어가도 오류는 안나지만 나중에 불러오면 8자리 이후 숫자는 다른숫자가 뜬다
	  float num10 = 256.111111f;        // f를 붙여야 오류가 안난다 : float(실수형 소수점)
	  
	  double num11 = 1.123456789012345;  //실수형 16자리까지 정밀도 표현 가능
	  
	  // 문자열 -Class 대문자로 표현함  : 소문자로 쓰면 에러
	  String str1 = new String("abc");
      
	  String str = "aaa";    //기본형 타입으로 선언(예외)
	  
	  char str3 = ' ';    //무조건 공백이라도 넣어야한다  
	  String str4 = "";   //String은 아무것도 안넣어도 가능하다
	  
	  //변수
	  int score = 100;
	  score = score + 200;    //현재 score = 300
	  
	  //상수
	  final int SCO = 100;
	  //SCO = 200;     //상수는 값을 변경할 수 없음
	  
	  
	  
	  
	  
  }
  
  
}
