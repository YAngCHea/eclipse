import java.util.Scanner;
//조건문 Switch문
public class Class0510_04 {

	public static void main(String[] args) {
// 조건문 Switch문-----------------------------------------------------------
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		
		//switch()
		switch(input) {                        //얘는 조건이 많아도 1번돌아감 : if보다 가벼움
		                                       //하지만 case에 들어갈 정확한 값이 필요하다 : ~보다 크다 작다 연산불가
		case 1:
			System.out.println("1입니다.");
		    break;                            //여기서 break를 써야한다!!!! : case가 끝날때마다 써야한다
		case 6:
			System.out.println("6입니다.");
		    break;                            //여기서 break를 써야한다!!!!
		case 9:
			System.out.println("9입니다.");
			break;                            //여기서 break를 써야한다!!!!
		default:
			System.out.println("다시 입력하세요");
		}//switch
		
//switch 실습예제-----------------------------------------------------------------
		//m,f를 입력받아 m남자 f여자라고 출력하세용: switch문 사용
		String sex = "m";
		Scanner scan1 = new Scanner(System.in);
		System.out.println("성별을 입력하세요(f/m)");
		sex = scan1.next();
		
		switch(sex) {
		case "m":
		case "M":                            //조건을 추가하고싶으면 ||나&&를 쓰지말고 이런식으로 써야한다!!!!!!!!!!
			System.out.println("남자입니다");
			break;
		case "f":
		case "F":
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
			
	}

}
