import java.util.Scanner;

public class C0530_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "ht";
		String str2 = "http";
		
		String[] files = {"fifamobile","asgard","warhaven"};
		
		String domain = "https://forum.nexon.com";
		String url = "https://forum.nexon.com/fifamobile";
		
		url.substring(0,domain.length());
		
		System.out.println("파일명 : " + url.substring(domain.length()+1));
		
		for(int i=0;i<files.length;i++) {    //배열일 때는 length에 ()없어도 된다
			if(url.substring(domain.length()+1).equals(files[i])) {       //String이면 length에 () 있어야 한다.
				System.out.println("file배열 " + i + "번째에 있습니다");
			}
		}
//-------------------------------------------------------------------------------		
		String input = url.substring(domain.length()+1);
		
		System.out.println("원하는 페이지를 호출하세요");
		input = scan.next();
		
////-------------------------------------------------------------------------------		
//		switch (input) {
//		case "fifamobile": {
//			System.out.println("fifamobile 페이지를 열어줍니다");
//			break;
//		}
//		case "asgard": {
//			System.out.println("asgard 페이지를 열어줍니다");
//			break;
//		}
//		case "warhaven": {
//			System.out.println("warhaven 페이지를 열어줍니다");
//			break;
//		}
//		}// switch    => 정확하게 대소문자도 맞아야 나온다
//------------------------------------------------------------------------------
		
		if(input.equalsIgnoreCase(files[0])) {                    //equalsIgnoreCase()를 쓰면 대소문자가 달라도 나온다
			System.out.println("fifamobile 페이지로 호출합니다");
		}else if (input.equalsIgnoreCase(files[1])) {
			System.out.println("asgard 페이지로 호출합니다");
		}else {
			System.out.println("warhaven 페이지로 호출합니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
