package j0508_01;

//﻿9. 정수의 오버플로우 Overflow

public class Class0508_05 {

	public static void main(String[] args) {
		//오버플로우
		//2147483647
		int num = 2147483647;            //int가 감당할 수 있는 크기의 수를 넘음 : 오버플로우 
		System.out.println(num+2);
		
		int num1 = 1000000;
		int num2 = 2000000;
		System.out.println(num1*num2);
		
		
	}
	
}
