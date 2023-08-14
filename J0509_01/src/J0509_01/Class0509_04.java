package J0509_01;

//﻿데이터 입력받아서 출력하기_실습문제
//.next() 와 .nextLine()의 차이점

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		//아이디, 패스워드, 이름을 입력받아 출력하시오.
		//문자열, 정수형, 문자열
		
		String ID = " ";
		int PW = 0;
		String name = " ";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		ID = scan.next();
		System.out.println("패스워드를 입력하세요 : ");
		PW = scan.nextInt();                      //정수형이라서 0328을 입력하면 0을 빼고 출력된다=>고치고싶으면 문자열로 받아야함
		System.out.println("이름을 입력하세요 : ");
		name = scan.next();                      //scan.next() : 값을 입력하고 enter를 치면 enter는 뱉어낸다
		                                         //scan.nextLine() : 위에서 뱉어낸 enter를 여기서 받아서 입력을 안받고 넘어가는것처럼 보인다
		
		                                         //nextLine()과 next()메소드의 차이는 nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴한다는 것이고 
		                                         //next() 메소드는 Space 즉 공백 전까지 입력받은 문자열을 리턴한다는 것
		System.out.println("===============================");
		System.out.println("아이디\t패스워드\t이름");
		System.out.println("===============================");
		System.out.printf("%s\t%d\t%s",ID,PW,name);
		
	}
}
