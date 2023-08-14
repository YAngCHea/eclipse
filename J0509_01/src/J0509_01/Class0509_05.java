package J0509_01;

//연산자의 종류

public class Class0509_05 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		int result = num1 + (num2 * num3);  //23 : 괄호를 사용해서 우선순위를 잡아서 코딩한다 : 안쓰면 오류가 날 가능성이 높음
		System.out.println(result);
		
		
		// 증감연산자_전위형 : ++ = +1
		int result1 = ++num3;   //5 + 1
		System.out.println(result1);
		
		// 증감연산자_후위형 
		int result2 = num2 ++; //4
		System.out.println(result2);
		System.out.println("num2 : "+num2);
		
		//num2 = num2 + 1 = num2 ++    :이렇게 이해하면 조금 더 쉽다
	}
}
