package j0508_01;

//printf, println, print

public class Class0508_07 {

	public static void main(String[] args) {
		
		//System.out.println();   : sysout치고 + ctrl + space
		
		
		System.out.println(10/3.0);           //println = 출력 후 enter키가 포함되어있음
		System.out.printf("%.2f \n",10/3.0);//소수점 둘째자리까지 표현하겠다  //printf = 출력후 enter키 미포함
		                                                           //그래서 \n을 넣어서 출력해야함
		                                                           // \n = enter, \t = tab
		System.out.printf("%d \n",1000);
		System.out.printf("%9d \n",1000);                //9째자리까지 출력할것 : 뭘로 채울지 지정x => 공백으로 채움
		System.out.printf("%09d \n",1000);               //9째자리까지 출력할것 : 0으로 채워줘!
		System.out.printf("%x \n",16);                   //16진수
		System.out.printf("%o",9);                   //8진수
		
		
		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년\n", 25,86);       //나이의 %d는 25, 생년의 %d는 86을 받는다
		System.out.println("당신의 나이 : "+25+"세, 생년 : "+1997+"년");
		
		

		//%d = 10진수 형식으로 출력
		//%f = 부동 소수점의 형식으로 출력(float)
		//%s = 문자열로 출력 (string)
		
		
		
		
		
	}

}
