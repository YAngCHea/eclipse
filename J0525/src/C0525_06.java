
public class C0525_06 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		System.out.println(0/0);    //오류발생
		
		try {
			System.out.println(3);
			System.out.println(0/0);     //예외 발생
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5);
		}
		
		System.out.println(6);
		
		
		
		
		
		
	}
}
