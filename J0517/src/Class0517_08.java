
public class Class0517_08 {

	public static void main(String[] args) {
		// Tv 사용하기
		//객체 선언하기
		TV t1 = new TV();
		TV t2 = new TV();

		t1.channel = 7;
		System.out.println("TV t1 channel : "  + t1.channel);
		
		t2.channel = 8;
		System.out.println("TV t2 channel : "  + t2.channel);
		
		t2 = t1;
		System.out.println("TV t2 channel : "  + t2.channel);
		
		t2.channel = 0;
		
		
		
	}

}
