package ray;

//this��һ�����ã���һ��������this�б������ڴ��ַ��ָ������this�洢��JVM���ڴ�Java�����ڲ���
//��ʹ��s1ȥ���ʶ����ʱ��,���������е�this��s1.
//ÿһ��������һ��this.
//this���Գ����ڡ�ʵ�����������У�ָ��ǰ����ִ����������Ķ���
//�ص㣺û��static�ؼ��ֵķ�������Ϊ��ʵ��������
//�ص㣺û��static�ؼ��ֵı�������Ϊ��ʵ����������ʵ��������������á�����.���ķ�ʽ���ʡ�
//ע�⣺��һ����Ϊ����ִ�еĹ���������Ҫ�������ģ���ô�������һ��Ҫ����Ϊ��ʵ������������Ҫ��static�ؼ���
public class This {
	public static void main(String[] args)
	{
		Thisss s1 = new Thisss();
		s1.name = "zhangsan";
		
		s1.shopping();
		
		Thisss s2 = new Thisss();
		s2.name = "lisi";
		
		s2.shopping();
			
	}
}
