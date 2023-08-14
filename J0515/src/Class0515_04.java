
public class Class0515_04 {

	public static void main(String[] args) {
		// 2차원 배열
		//[4][3]
		int[][] box = new int[4][3];
		int[][] arr = new int[4][3];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++){
				box[i][j] = (3*i) + (j+1);  //일차방정식을 잘 쓰기,,,,
			}
		}
		
//	//위 타이틀 출력
//		for (int i=0;i<3;i++)
//			System.out.print("\t"+i);
//		System.out.println();
		System.out.println("------------------------------------");
		
		//번호 출력하기
		for(int i=0;i<4;i++) {
	//왼쪽 타이틀 출력하기
//			System.out.print(i + " |\t");      
			for(int j=0;j<3;j++){
				System.out.print(box[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
