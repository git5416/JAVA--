package lei;

public class CustomerTest {
    public static void main(String[] args)
    {
        Customer c = new Customer();
        c.setId(1001);
        c.setName("王琛");
        c.setAge(18);
        c.setAddr("陕西榆林");

        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getAddr());
    }
}