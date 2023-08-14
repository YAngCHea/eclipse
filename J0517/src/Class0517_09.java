import java.util.Scanner;

public class Class0517_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3개의 숫자를 입력받아 작은수 부터 순차적으로 출력하세요
		//calculate() 메소드를 만들어서 사용하세요
		Class0517_09 c = new Class0517_09();
		int[] input = new int[3];
		int[] out = new int[3];


		
		//숫자 입력받기
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + ".숫자를 입력하세요");
			input[i] = scan.nextInt();
		}
		
		calculate(out,input[0],input[1],input[2]);
		int resultmax;
		
		System.out.println(out[0]);//최대값
        System.out.println(out[2]); //중간값
		System.out.print(out[1]);//최소값
		
		//최대값

	}//main 메소드

	static void calculate(int out[],int a, int b, int c) {
		//최대값
		out[0] = Math.max(Math.max(a, b), c);
		//최소값
		out[1] = Math.min(Math.min(a, b), c);
		out[2] = (a+b+c) -(out[0] + out[1]);
	}
	
	
}//class
