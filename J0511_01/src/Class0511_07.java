//--------배열 ppt.110-----------------------
public class Class0511_07 {

	public static void main(String[] args) {
// -----배열 array : 같은 타입의 여러변수를 하나의 묶음으로 다루는것 : 다른타입의 변수는 불가능하다
		// 많은 양의 데이터(값)을 다룰때 유용 : 각 요소가 연속적임
		int[] num = new int[5];
//		 int[] num;
//		 num = new int[5];      //위에있는 한줄과 동일함
		System.out.println(num); // num에는 5개의 공간 주소가 들어감

		String[] name = new String[100];
		double[] avg = new double[50];
		
		
		//선언하고 값을 넣으면 된다
		int[] score = new int[3];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		System.out.println(score[0] + score[1] + score[2]);        //1+2+3 = 6
		
		
		int[] score10 = new int[10];
		score10[0] = 1;
		score10[1] = 2;
		score10[2] = 3;
		score10[3] = 4;
		score10[4] = 5;
		score10[5] = 6;
		score10[6] = 7;
		score10[7] = 8;
		score10[8] = 9;
		score10[9] = 10;
		
//		int[] input = {1,2,3,4,5,6,7,8,9,10}         : 위에있는 11줄이랑 동일하다
		// 선언방법 : 타입[] 변수이름 = new 타입[몇개]
		
	}

}
