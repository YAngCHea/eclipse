import java.util.Scanner;

public class Class0517_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3개의 수를 입력받아, 평균 60점 이상이면 합격/불합격 출력하세요.
		//average() return int
		
		//객체선언하기
		Class0517_05 c = new Class0517_05();
		int[] input = new int[3];
		String result = "";
		
		//숫자 입력받기
		for (int i=0;i<3;i++) {
			System.out.println((i+1)+".숫자를 입력하세요> ");
			input[i] = scan.nextInt();
		}
		
		//결과 출력하기
		double result1 = c.average1(input[0], input[1], input[2]);
		System.out.println("평균 = " + result);

	}//main 메소드
	
	//average 메소드
	double average1(int a, int b, int c) {
		double result1 = (a + b + c) / 3.0;
		return result1;
	}
	
	//average 메소드 : 합불
	String average(int a, int b, int c) {
		String result = "";
		if(((a+b+c)/3.0)>=60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		return result;
	}

}
