package shopMall;

import java.util.ArrayList;

public class Buyer {
	
	Buyer(){}
	
	Buyer(String id,String name,String nickname){
		this.id = id;
		this.name = name;
		this.nickName = nickname;
	}

	Product[] cart = new Product[10];
	
	//배열
	//Product[] cart = new Product[10];
	//cart[0] = p;
	//Collection
	ArrayList<Product> list = new ArrayList();     //제너릭 : 규정되어있는것만 들어올 수 있음<>안에 
	//cart[i] = p, list.add(0) : 객체추가
	//cart[0]   ,  list.get(0) : 데이터 읽어오기
	//cart.length, list.size : 총개수
	
	
	
	
	
	String id;
	String pw;
	String name;
	String nickName;
		
	
	int money = 10000;
	int bonusPoint = 0;
	int count = 0;  //구매 횟수
	
	void buyList() {
		System.out.println("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			list.get(i);
			if(i==0) {
				System.out.print(cart[i].productName);
			}else {
				System.out.print(", ");
				System.out.print(cart[i].productName);
			}
		}
		System.out.println();
		System.out.println("======================================");
	}
	
	
	
	
	
	

////---------------------------------------------------------------------------------
//	void buy(Tv t) {
//		money = money - t.price;     //Tv의 가격을 빼고 다시 money에 넣음
//		bonusPoint = bonusPoint + t.bonusPoint;    //현재 보너스에 추가해서 다시 보너스에 넣음
//		System.out.println(t);     //이름 출력하기
//	}
//	void buy(Computer c) {
//		money = money - c.price;     //Computer의 가격을 빼고 다시 money에 넣음
//		bonusPoint = bonusPoint + c.bonusPoint;    //현재 보너스에 추가해서 다시 보너스에 넣음
//	}
//	void buy(Speaker s) {
//		money = money - s.price;     //Speaker의 가격을 빼고 다시 money에 넣음
//		bonusPoint = bonusPoint + s.bonusPoint;    //현재 보너스에 추가해서 다시 보너스에 넣음
//	}
//	void buy(Washer w) {
//		money = money - w.price;
//		bonusPoint = bonusPoint + w.bonusPoint;
//	}
//-------------------------------------------------------------------------------------
//	void buy(Product p) {
//		money = money - p.price;     //Product의 가격을 빼고 다시 money에 넣음
//		bonusPoint = bonusPoint + p.bonusPoint;    //현재 보너스에 추가해서 다시 보너스에 넣음
//	}
//-----------------------------------------------------------------------------------	
	void buy(Object o) {
		Product p = (Product)o;
		money = money - p.price;     //Product의 가격을 빼고 다시 money에 넣음
		bonusPoint = bonusPoint + p.bonusPoint;    //현재 보너스에 추가해서 다시 보너스에 넣음
		System.out.println("구매품목" + p.productName);
		cart[count] = p;
		count++;
	}
	
}
