// ppt.103 break문
public class Class0511_04 {
	public static void main(String[] args) {

//		int i = 0, sum = 0;
//		
//		while(true) {
//			if(i>100) {
//				break;
//			}
//			i++;
//		}
//		System.out.println("i의 결과값 : "+i);        //i가 +1되는 동안은 출력X 100이 초과되면 출력 => 101
////---------------------------------------------------------------------
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum = sum + i;     //i = 13일때 sum = 91
//			i++;
//		}
//		System.out.println("i의 결과값 : "+i);
//		System.out.println("sum의 결과값 : "+sum);
//		//i=0sum=0 i=1 / sum=1 i=2 /  sum=3 i=3 / sum=6 i=4 / ....../ sum=91 i=14 /sum=105 i=15
////------------------------------------------------------------------------
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			i++;                     //i의 위치가 sum 위로 올라가면 i=14 sum=105가 나온다
//			sum = sum + i;     
//		}
//		System.out.println("i의 결과값 : "+i);
//		System.out.println("sum의 결과값 : "+sum);
////----------------------------------------------------------------------------
		int i = 0, sum = 0;

		for (i = 0;;) {
			if (sum > 100){
				break;
			}
			i++;                         //i의 위치에 따라 값이 달라진다  순서를 잘 생각해서 검증해야한다!!
			sum = sum + i;
		}

		System.out.println("i의 결과값 : " + i);
		System.out.println("sum의 결과값 : " + sum);

	}

}
