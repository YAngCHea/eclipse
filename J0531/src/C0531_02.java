import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//��ü����
		StuProcess sp = new StuProcess();
		
		List<Student> list = new ArrayList<>();
		
		int choice = 0;
		int stucount = 3;  //�й� : ȫ�浿�̶� �������� �����ϱ�!!
		
		list.add(new Student(1,"ȫ�⵿",100,100,100));
		list.add(new Student(2,"������",100,100,100));
		
		while(true) {
			System.out.println("[ �л�����ó�� ���α׷� ]");
			System.out.println("1.�л��Է�");
			System.out.println("2.�л����");
			System.out.println("8.���Ͽ��� ��������");
			System.out.println("9.���� �����ϱ�");
			System.out.println("0.���α׷� ����");
			
			System.out.println("-------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>");
			
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
//				//��ü����
//				StuProcess sp = new StuProcess();
//				sp.stuInput(list);        //���⼭ StuProcess�� �ִ� void�� �Ѿ��
//				break;   //�׷��� �� case 1�� �����ϸ� ȫ�浿 �̸��� ���´�
//------------------------------------------------------------------------------------				
				
				
				//�� �޼ҵ� ȣ�� �� ������ ���� �޴� �κ��� ���� �߿��ϴ�!!!!!!!!!!
//				list = sp.stuInput(list,stucount);        //���⼭ StuProcess�� �ִ� void�� �Ѿ��
				                                         //stucount�� �ϳ� �� ������ StuProcess �޼ҵ� ù�ٿ��� �־������
				Map<String,Object> map = sp.stuInput(list,stucount);
				list = (List<Student>) map.get("list");
				stucount = (int) map.get("stucount");
				
				
				//���
				for (int i=0;i<list.size();i++) {
					System.out.printf("%d %s \n",list.get(i).getStuNo(),list.get(i).getName());
				}
				break;   //�׷��� �� case 1�� �����ϸ� ȫ�浿 �̸��� ���´�
				
				
			case 2:  //2.�л����
				//�޼ҵ� ȣ�� �� �Ű����� ���޸� �ϸ� �ȴ� - list
				list = sp.stuOutput(list);  //���⼭ ������, �޴°� : �װ� list�� �����ؾ��Ѵ� 
				
				break;
				
			case 8:
				list = sp.stuRead();
				System.out.println("[ ���� �о���Ⱑ �Ϸ�Ǿ����ϴ�. ]");
				System.out.println();
				break;
				
				
			}//switch
			
			
			
			
			
		}//while
		
		
		
	}
}
