import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			//��ü����
			StuProcess sp = new StuProcess();
			List<Student> list = new ArrayList<>();
			int choice = 0;
			int stuCount = list.size()+1; //�й�
			
			//����� ������ �о�ñ?
			System.out.println("����� �л����������� �о�ñ?(1.yes, 2.no)");
			choice = scan.nextInt();
			if(choice == 1) {
				list = sp.stuRead();    //�길 ������ �ٷ� �ҷ�������
				System.out.println("[ �л����������� ����Ǿ����ϴ� ]");
			}

			
			while(true) {
				System.out.println("[ �л�����ó�� ���α׷� ]");
				System.out.println("1. �л��Է�");
				System.out.println("2. �л����");
				System.out.println("8. ���Ͽ��� ��������");
				System.out.println("9. ���������ϱ�");
				System.out.println("-----------------------");
			    System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			    choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					//�޼ҵ�ȣ���� ���������� ����.
					stuCount = list.size()+1;
					Map<String,Object> map = sp.stuInput(list,stuCount);
					list = (List<Student>) map.get("list");
					stuCount = (int) map.get("stuCount");
					break;
					
				case 2:
					//�޼ҵ�ȣ��(�Ű����� ����)-list
					list = sp.stuOutput(list);
					break;
					
				case 8: //���Ͽ��� ��������
					list = sp.stuRead();
					System.out.println("[ ���� �о���Ⱑ �Ϸ�Ǿ����ϴ�. ]");
					System.out.println();
					break;
				
				case 9:
					sp.stuSave(list);
					System.out.println("[ �л������� ����Ǿ����ϴ�. ]");
					System.out.println();
					break;
					
					
					
				}//switch
				
			}//while

		
		
		
	}
}
