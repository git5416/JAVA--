package ray;

public class Zifuchuan {
	public static void main(String[] args)
	{
		String greeting = "hello";   /*ȡ�Ӵ�*/
		String s = greeting.substring(0, 3);
		System.out.println(s);
		String expletive = "Expensive";    /*�ַ���ƴ��*/
		String PG13 = "delete";
		String message = expletive + PG13;
		System.out.println(message);
		greeting = greeting.substring(0, 3) + "p!";    /*�޸��ַ���*/
		System.out.println(greeting);
		System.out.println(s.equals(message));    /*����ַ����Ƿ����*/ 
		int n = greeting.length();    /*�ַ������ȣ����뵥Ԫ������*/
		System.out.println(n);
		char first = greeting.charAt(0);    /*����s.charAt(n)����λ��n�Ĵ��뵥Ԫ*/
		char last = greeting.charAt(4);
		System.out.println(first);
		System.out.println(last);
	}
}
