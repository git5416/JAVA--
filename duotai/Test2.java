package duotai;

public class Test2 {
	public static void main(String[] args)
	{
		//����������ָ�������Ͷ���
		//����ת��
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		
		//����ת�͡�ֻ�е�����������������еķ�����
		if (a1 instanceof Cat) {
			Cat ci = (Cat)a1;
		}
		if (a2 instanceof Bird) {
			Bird b1 = (Bird)a2;
		}
	}
}
