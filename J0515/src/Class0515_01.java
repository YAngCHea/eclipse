//----배열-------------------------
import java.util.Scanner;
public class Class0515_01 {

	public static void main(String[] args) {
//		// 배열 - 배열은 한번 정해지면 크기를 크게하거나, 삭제가 불가능하다 (부분삭제 불가)
//		//배열 10개 만들기
//		int[] arr = new int[10];
//		
//		for (int i = 0;i<10;i++) {
//			arr[i] = i +1;
//			System.out.println(arr[i]);
//		}
//-------------------------------------------------------------------------
//	//45개 배열 만들기
// -- 로또프로그램 복습하기		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[45];
		int random = 0;
		int temp = 0;
		int count = 0;                       //로또번호와 내가 입력한 숫자가 맞은 개수
		int[] mynum = new int[6];            //내가 입력한 숫자
		int[] lottonum = new int[6];         //로또번호 맞춘 개수		
		for (int i = 0;i<45;i++) {
			arr[i] = i +1;
			System.out.println(arr[i]);
		}
		
	//1.섞기
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*45);  //0-44까지
			
			temp = arr[0];
			arr[0] = arr[random];
			arr[random] = temp;
		}
		
	//2.번호 입력받기 - 6개
		for(int i=0;i<mynum.length;i++) {    //mynum배열의 개수가 6개!
			System.out.println((i+1)+"번호를 입력하세욥>");
			mynum[i] = scan.nextInt();
			
		}
		
	//3.랜덤으로 돌린 번호 출력하기
		System.out.print("로또 당첨 번호입니다");
		for(int i=0;i<mynum.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();    //enter

//ctrl + alt + 방향키 아래로 누르면 : 복사한다
		
	//4.입력한 번호 출력하기
		System.out.print("로또 당첨 번호입니다");
		for(int i=0;i<mynum.length;i++) {
			System.out.print(mynum[i]+" ");
		}
		System.out.println();    //enter

		
	//5.맞춘 개수 출력하기
		for(int i=0;i<mynum.length;i++) {
			for(int j=0;j<mynum.length;j++) {
				if(arr[i]==mynum[j]) {
					lottonum[count] = arr[i];        //맞춘번호가 몇번인지
					count++;            //mynum의 숫자와 arr의 숫자가 동일하면 +1을 한다
					continue;           //전체를 다 빠져나오면서 멈추는 게 아니고 그냥 한번만 빠져나와서 다시 돌리는것
				}
			}
		}
		
		//6.맞은 번호 출력하기
		System.out.print("로또 당첨" + count + "개 되었습니다");
		for(int i=0;i<count;i++) {
			if(count==0) {
				System.out.println("꽝입니다");
			}else {
				System.out.print(lottonum[i]+" ");				
			}
		}
		System.out.println();    //enter
		
		
		
		
	}//main

}
