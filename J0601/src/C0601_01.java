import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class C0601_01 {
	
	public static void main(String[] args) {
		
		Date today = new Date();   //날짜객체 2023-06-01 , 2023년 06월 01일
		System.out.println(today.toString());
		
		//날짜형태를 지정하는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss zzz");
		System.out.println(sdf.format(today));
		
		System.out.println(today.getDate());    //getDate()가 사용은 가능하지만, 권장하지 않음
		System.out.println(today.getDay());     //요일
		System.out.println(today.getMinutes());     //분
		System.out.println(today.getSeconds());     //초
		System.out.println(today.getYear());     //년
		
		
		//객체선언 - 싱글톤 패턴
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		Date date1 = cal.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date1));
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year);
		System.out.println(month);//0부터 시작한다 : 0=1월, 1=2월,3=4월 이런식임
		System.out.println(month+1);  //이렇게 해야 원하는 월이 나옴
		System.out.println(date);
		
	}
	
}
