
public class Class0517_07 {

	public static void main(String[] args) {

		//static 객체선언없이 사용
		
		int[] num = new int[2];
		
		int a = 10;
		int b = 5;
		
		calulate(num,a,b);
		
//		num[0] = 20;
		
		System.out.println("합계 : " + num[0]);
		System.out.println("평균 : " + num[1]);
		
	}
	
	static void calulate(int[] num, int a, int b) {  //void여서 return 값 필요없다.
		//두 수의 합, 평균
		num[0] = a+b;
		num[1] = (a+b)/2;
		

	}
}
