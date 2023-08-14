package J0509_01;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
        //실습예제
		//double num = 564.124586 소수점 3자리 절사 2자리까지 존재
		double num = 564.124586;
		double result = (int)(num * 100)/100.0;
		System.out.println(result);
		
		//실수를 입력받아 소수점 4자리까지만 출력하시오
		
		Scanner scan = new Scanner(System.in);
        System.out.println("실수입력해!");
		double input = scan.nextDouble();
		double result1 = (int)(input * 10000)/10000.0;         //이건 외워야 문제를 풀 수 있다
        System.out.println("소수점 4자리까지만! : "+result1);
		
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;       //1000으로 나누면 형태가 그냥 int가 되어버려서 3.0이 나온다
//		System.out.println(result);

	}

}
