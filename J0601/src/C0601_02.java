import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0601_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�й��� �Է��ϼ���.");
		int stuNo = scan.nextInt();
		System.out.println("�̸��� �Է��ϼ���");
		String name = scan.next();
		System.out.println("���������� �Է��ϼ���.");
		int kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int eng = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int math = scan.nextInt();
		
		//��¥�� �ְ����
		//1.Date��ü����  2.simpleDateFormat  3.format
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String createDate = sdf.format(today);
		
		//�긦 ���鶧 ���� �������ֱ�..!
		Student s = new Student(stuNo, name, kor, eng, math, createDate);
		              //=> ����ϱ� ���ؼ��� Student���� createDate�� getset�������
		//Ȯ���ϱ�
//		System.out.println("�Էµ� ��¥ : " + s.getCreatedate());
		
		
		
		
		System.out.println("����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
