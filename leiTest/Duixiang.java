package leiTest;

public class Duixiang {

	public static void main(String[] args)
	{
		Duixiangdemo s = new Duixiangdemo();  //ʹ���Զ�����,sΪ���õľֲ�����
		
		/*����ʵ���������﷨��ʽ
		  ��ȡ���ݣ�����.��������
		  �޸����ݣ�����.������ = ֵ��*/
		
		//��ȡ����
		int n = s.num;
		int a = s.age;
		String na = s.name;
		String ad = s.addr;
		
		System.out.println("ѧ�� = " + n);
		System.out.println("���� = " + na);
		System.out.println("���� = " + a);
		System.out.println("��ַ = " + ad);
		
		System.out.println("ѧ�� = " + s.num);
		System.out.println("���� = " + s.name);
		System.out.println("���� = " + s.age);
		System.out.println("��ַ = " + s.addr);
		
		//�޸�����
		s.num = 001;
		s.name = "���";
		s.age = 19;
		s.addr = "����";
		
		System.out.println("ѧ�� = " + s.num);
		System.out.println("���� = " + s.name);
		System.out.println("���� = " + s.age);
		System.out.println("��ַ = " + s.addr);
	}
}
