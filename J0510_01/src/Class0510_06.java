import java.util.Scanner;

public class Class0510_06 {
	public static void main(String[] args) {
		//점수를 입력받아, 90점 이상이면 A, 80점 이상이면B, 70점 이상이면 C, 60점 이상이면 D, 나머지 F

//		double score = 0;
//		System.out.println("점수를 입력하세요>");
//		Scanner scan = new Scanner(System.in);
//		score = scan.nextDouble();
//		
//		if (score >= 90) {
//			System.out.println("A");
//		} else if(score >=80) {
//			System.out.println("B");
//		} else if(score >=70) {
//			System.out.println("C");
//		} else if(score >=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
//-if안에 if문 넣기----------------------------------------------------------		
		//97점 이상 A+, 93점 이하 A- ....
		
		double score = 0;
		System.out.println("점수를 입력하세요>");
		Scanner scan = new Scanner(System.in);
		score = scan.nextDouble();
		
		if (score >= 90) {
			System.out.print("A");          //여기가 println이면 줄바꿈해서 +가 다음줄로 떨어진다 
			                                  //=>print로 써야 안떨어짐
			if (score >= 97) {
				System.out.println("+");
			} else if(score<=93) {
				System.out.println("-");
			}
			
		} else if(score >=80) {
			System.out.print("B");
			if (score >= 87) {
				System.out.println("+");
			} else if(score<=83) {
				System.out.println("-");
			}
			
		} else if(score >=70) {
			System.out.print("C");
			if (score >= 77) {
				System.out.println("+");
			} else if(score<=73) {
				System.out.println("-");
			}
			
		} else if(score >=60) {
			System.out.print("D");
			if (score >= 67) {
				System.out.println("+");
			} else if(score<=63) {
				System.out.println("-");
			}
			
		} else {
			System.out.println("F");
		}		
		
		
	}

}
