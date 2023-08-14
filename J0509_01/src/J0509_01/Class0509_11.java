package J0509_01;

public class Class0509_11 {

	public static void main(String[] args) {
		// 소수점 4째자리에서 반올림 출력하시오.
		//1.변수선언
		//2.출력
		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;       //소수점3째자리까지 출력
		double result = Math.round(pi*1000)/1000.0;  //소수점 4째자리에서 반올림해서 3.142나온다
		System.out.println(result);
				

		//double pi = 3.7894 소수점 2자리에서 반올림 출력하시오
		double pi1 = 3.7894;
		double result2 = Math.round(pi1 * 10)/10.0;
		System.out.println("소수점 2자리에서 반올림 했다 : "+result2);
		
	}

}
