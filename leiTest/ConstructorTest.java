package leiTest;

public class ConstructorTest {

	public static void main(String[] args)
	{
		GouzaoqiDemo g1 = new GouzaoqiDemo();
		GouzaoqiDemo g2 = new GouzaoqiDemo(10);
		GouzaoqiDemo g3 = new GouzaoqiDemo("���");
		GouzaoqiDemo g4 = new GouzaoqiDemo(10 , "���");
		
		//���ô���static�ķ���:����.
		ConstructorTest.doSome();    
		doSome();    //��ͬһ�����п�ֱ�ӵ��ã�Ч������һ�д���һ��
		
		//����û��static�ķ���:����.
		//doOther������ConstructorTest���У�����Ҫ����ConstructorTest����
		//����ConstructorTest���󣬵����޲������췽����
		ConstructorTest c = new ConstructorTest();    //һ������û���κι��췽���Ļ���ϵͳĬ���ṩһ���޲���������
		c.doOther();
	}
	public static void doSome()
	{
		System.out.println("do some!");
	}
	
	public void doOther()
	{
		System.out.println("do other!");
	}
}
