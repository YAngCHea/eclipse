package shopMall;

import java.util.Scanner;

public class Shopmain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		
		//객체선언하기
		//id,pw
		Buyer b = new Buyer("hong","홍길동","길동스");
		
		while (true) {
			System.out.println("[ 삼성쇼핑몰 ]");
			System.out.println("1.QLED TV 70인치");
			System.out.println("2.갤럭시북");
			System.out.println("3.홈 미니 블루투스 스피커");
			System.out.println("4.세탁기");
			System.out.println("0.내가 구매한 품목");
			System.out.println("--------------------------------");
			System.out.println("구매하고 싶은 상품의 번호를 입력하세요");
			input = scan.nextInt();

			
			switch (input) {
			case 1:
				System.out.println("1.QLED TV 70인치");
//				Tv t = new Tv();
				b.buy(new Tv()); // 이미 Tv를 하나 구매한 것
				System.out.println("잔액 : " + b.money);
				System.out.println();
				break;
			case 2:// 컴퓨터 구매하기
				System.out.println("2.갤럭시북");
//				Computer c = new Computer();
				b.buy(new Computer());
				System.out.println("잔액 : " + b.money);
				System.out.println();
				break;
			case 3:// 스피커 구매하기
				System.out.println("3.홈 미니 블루투스 스피커");
				b.buy(new Speaker());
				System.out.println("잔액 : " + b.money);
				System.out.println();
				break;
			case 4:  //세탁기 구매하기
				System.out.println("4.세탁기");
				b.buy(new Washer());
				System.out.println("잔액 : " + b.money);
				System.out.println();
				break;
			case 0:
				break;
			}// switch
			
			System.out.println("[ 구매개수 ]");
			System.out.println(b.count);
//			System.out.println("[구매내역]");
//			for(int i=0;i<b.count;i++) {
//				System.out.print(b.cart[i].productName + ", ");     //b.cart[i] 얘는 p가 들어있어서 주소가 나온다
//			}
//			System.out.println();
//			System.out.println("====================================");
			
			//구매목록 메소드 호출
			b.buyList();
			
			
			
		}//while
		
		
		
		
		

	}

}
