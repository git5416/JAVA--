package leiTest;

public class CustomerTest {
	public static void main(String[] args)
	{
		Customer c = new Customer();
		c.setId(1001);
		c.setName("���");
		c.setAge(18);
		c.setAddr("��������");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
	}
}
