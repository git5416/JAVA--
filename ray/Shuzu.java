package ray;

import java.util.Arrays;

public class Shuzu {
	public static void main(String[] args)
	{
		int[] a = new int[10];
		for(int i = 0; i < 10; i++)
			a[i] = i;
		System.out.println(Arrays.toString(a));    
		/*���������ʱ����Arrays���е�toString����Ч������
		 * �ҿ��Ա������[I@50cbc42f���������Ϊ�����һԪ�صĵ�ַ��
		 * */
		
		for(int i = 0; i < a.length; i++)    /*ѭ��a�е�ÿһ��Ԫ��*/
			System.out.println(a[i]);
		System.out.print("\n");
		
		for(int element : a)    /*for eachѭ����ѭ��a�е�ÿһ��Ԫ��
		                          �ŵ��ǲ���Ϊ�±����ʼֵ����ֵֹ���ģ����׳���*/
			System.out.println(element);
	}

}
