
public class Class0515_05 {

	public static void main(String[] args) {
////--- 5,4배열 1-29까지 숫자 출력하세용--------------------------------------
//		
//		int[][] box = new int[5][4];
//		
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<4;j++) {
//				box[i][j] = (4*i) + (j+1);
//			}
//		}
//		
//	//출력하기
//	//위에 인덱스 출력하기
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<4;j++) {
//				System.out.print(" \t" + j);
//				
//			}
//			break;
//		}
//		System.out.println();
//		
//	//기본 출력
//		System.out.println("\t-------------------------------");
//		
//		for (int i=0;i<5;i++) {
//	//왼쪽 인덱스 출력하기
//			System.out.print(i + " |\t");
//			for (int j=0;j<4;j++) {
//				System.out.print(box[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	
//		System.out.println("\t------------------------------");
//-------------------------------------------------------------------		
	//--- 5,4배열 1-29까지 숫자 출력하고, 1~16까지는 0, 17~20까지는 1 넣기 , 그리고 random으로 섞기--------------------------------------
			int temp = 0;
			int random = 0 ;
			int[][] box = new int[5][4];
			int[] num = new int[20];
			for (int i = 0; i < 20; i++) {

				if (i < 15)
					num[i] = 0;
				else
					num[i] = 1;
			}
			
			//1차원 배열을 섞기
			for(int i=0;i<100;i++) {
				random = (int)(Math.random()*20);
				
				temp = num[0];
				num[0] = num[random];
				num[random] = num[0];
			}
			
			
			for (int i=0;i<5;i++) {
				for (int j=0;j<4;j++) {
					box[i][j] = num[(4*i) + j];      //num을 섞어서 여기로 넣을 생각
//					if(i!=4) {
//						box[i][j] = 0;
//					}else {
//						box[i][j] = 1;
//					}                   //값 넣기
				}
			}
			
		//출력하기
		//위에 인덱스 출력하기
			for (int i=0;i<5;i++) {
				for (int j=0;j<4;j++) {
					System.out.print(" \t" + j);
					
				}
				break;
			}
			System.out.println();
			
		//기본 출력
			System.out.println("\t-------------------------------");
			
			for (int i=0;i<5;i++) {
		//왼쪽 인덱스 출력하기
				System.out.print(i + " |\t");
				for (int j=0;j<4;j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}
		
			System.out.println("\t------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
