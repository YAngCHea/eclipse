// 로또 프로그램 정리본---------------------------------------
import java.util.Scanner;

public class Class0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.배열생성 - 45개
		int temp = 0;//임시저장변수
		int count = 0; //당첨개수
		int random = 0; //랜덤변수
		int[] mynum = new int[6];  //내가 입력한 숫자
		int[] lottonum = new int[6];   //
		
		int[] lotto = new int[45];
		
		//2.로또번호 생성
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		//3.로또번호 섞기
		for (int i=0;i<1000;i++) {
			random = (int)(Math.random()*45);     //랜덤 만들기
			
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		//4.로또번호 입력
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			mynum[i] = scan.nextInt();
		}
		
		//5.로또번호 당첨개수확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i] == mynum[j]) {
					lottonum[count] = lotto[i];//당첨번호 저장
					count++;       //맞은개수가 늘어나는것
				}
			}
		}
		
		//6.로또번호 출력
		System.out.println("생성된 로또 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]+" ");
		}
		//7.입력번호 출력
		System.out.println("입력된 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.println(mynum[i]+" ");
		}
		//8.당첨번호 출력
		if(count>0) {
			for(int i=0;i<count;i++) {
				System.out.println("내가 맞춘당첨번호 : " + lottonum[i]+" ");
			}			
		} else {
			System.out.println("내가 맞춘당첨번호 : 없습니다");
		}
		//9.당첨개수 출력
		System.out.println("당첨개수 : "+count);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
