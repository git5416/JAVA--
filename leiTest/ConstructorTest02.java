package leiTest;

public class ConstructorTest02 {

	public static void main(String[] args) {
		
		//��������
		 //��һ������Ԫ�ع��࣬����ٲ鿴���ڵ�ǰ����ʹ��CTRL + o ��ݼ���Ȼ������Ҫ���ҵ�Ԫ�����ơ�
		 Account act1 = new Account();
		 
		 System.out.println("�˺�: " + act1.getActno());
		 System.out.println("���: " + act1.getBalance());
		 
		 Account act2 = new Account("222");
		 
		 System.out.println("�˺�: " + act2.getActno());
		 System.out.println("���: " + act2.getBalance());
		 
		 Account act3 = new Account(33.33);
		 
		 System.out.println("�˺�: " + act3.getActno());
		 System.out.println("���: " + act3.getBalance());
		 
		 Account act4 = new Account("444" , 44.44);
		 
		 System.out.println("�˺�: " + act4.getActno());
		 System.out.println("���: " + act4.getBalance());
	}

}
