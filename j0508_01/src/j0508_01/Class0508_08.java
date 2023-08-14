package j0508_01;

public class Class0508_08 {
	public static void main(String[] args) {
		// int로 선언한 num1 변수 10, num2변수 3을 선언후,두 수를 나눠서 소수점 2자리까지 출력하시오.
		int num1 = 10;
		int num2 = 3;
		System.out.printf("%.2f \n", (float)num1/num2);
		
		
		//변수 n1 : 3.14, 변수 n2 : 5
		// [ n1 + n2의 결과값 : 7.14]를 출력하시오.
	    float n1 = 3.14f;
	    float n2 = 5;
	    System.out.printf("[n1 + n2 의 결과값 : %.2f] \n",n1+n2);
	    
	    
	    //국어점수 kor 100, eng 100, math 99
	    //합계와 평균을 출력. 평균은 소수점 2자리까지 출력
	    // [ 합계 : 299, 평균 : 99.99]
	    int kor = 100;
	    int eng = 100;
	    int math = 99;
	    //=> int kor = 100, eng = 100, math = 99; 로 쓸 수 있다 : 
	    
	    System.out.printf("[ 합계 : %d, 평균 : %.2f ]", kor+eng+math, (float)(kor+eng+math)/3);
	    
	    
		
	}

}
