package leiTest;

public class OOtest01 {
	public static void main(String[] args)
	{
		OOtestUser u = new OOtestUser();
		
		System.out.println(u.num);
		System.out.println(u.name);
		System.out.println(u.addr);
		
		u.num = 001;
		u.name = "���";
		u.addr = new OOtestAddress();
		//OOtestAddress a = new OOtestAddress();
		//u.addr = a;    ����������һ��������ͬ
		
		System.out.println(u.name + "��ס��" + u.addr.city + "��");
		System.out.println(u.addr.city + "�е�" + u.addr.street + "�ֵ�");
		System.out.println("����������" + u.addr.zipcode);
		
		u.addr.city = "����";
		//a.city = "����";    �����д�������һ��
		u.addr.street = "����·";
		u.addr.zipcode = "719200";
		
		System.out.println(u.name + "��ס��" + u.addr.city + "����");
		System.out.println(u.addr.city + "���е�" + u.addr.street + "�ֵ�");
		System.out.println("����������" + u.addr.zipcode);
	}
}
