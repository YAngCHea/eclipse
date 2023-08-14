package J0509_01;

//데이터 입력받아서 출력하기
import java.util.Scanner;       //Scanner를 사용하려면 패키지를 import해와야한다

public class Class0509_03 {

	public static void main(String[] args) {
		int kor = 0;
		double eng = 0;
		int math = 0;
		String name = "홍길동";
		
		//데이터 입력받아서 출력하기
		Scanner scan = new Scanner(System.in);   //화면에서 입력을 받겠다.  //변수명이 scan
		System.out.println("이름을 입력하세요");
		//name = scan.next();                    //홍 길동 : 사이에 공백이 있으면 앞에꺼만 받아온다
		name = scan.nextLine();                  //홍 길동 : 사이에 공백이 있어도 전체를 받아온다
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextInt();                    //scan.nextInt() : 화면에서 점수를 입력받을 수 있도록 하는 함수
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextDouble();                 //scan.nextDouble() : 소수점이 있는경우 
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		
		double total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("=======================================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("=======================================");
		System.out.printf("%s\t%d\t%.1f\t%d\t%.1f\t%.1f",name,kor,eng,math,total,avg);

	}
	
}
