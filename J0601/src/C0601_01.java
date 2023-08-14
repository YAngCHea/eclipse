import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class C0601_01 {
	
	public static void main(String[] args) {
		
		Date today = new Date();   //��¥��ü 2023-06-01 , 2023�� 06�� 01��
		System.out.println(today.toString());
		
		//��¥���¸� �����ϴ� ��ü
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss zzz");
		System.out.println(sdf.format(today));
		
		System.out.println(today.getDate());    //getDate()�� ����� ����������, �������� ����
		System.out.println(today.getDay());     //����
		System.out.println(today.getMinutes());     //��
		System.out.println(today.getSeconds());     //��
		System.out.println(today.getYear());     //��
		
		
		//��ü���� - �̱��� ����
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		Date date1 = cal.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date1));
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year);
		System.out.println(month);//0���� �����Ѵ� : 0=1��, 1=2��,3=4�� �̷�����
		System.out.println(month+1);  //�̷��� �ؾ� ���ϴ� ���� ����
		System.out.println(date);
		
	}
	
}
