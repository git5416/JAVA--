package ray;

import java.math.BigInteger;

public class DashuzhiDamo {
	public static void main(String[] args)
	{
		/*ʹ�þ�̬��valueOf�������Խ���ͨ����ֵת��Ϊ����ֵ*/
		BigInteger a = BigInteger.valueOf(100);
		BigInteger b = BigInteger.valueOf(11);
		/*����ʹ��+��*��������������������ֵ��
		 * ��Ҫ�ô���ֵ���е�add��multiply�ȷ�����
		 */
		BigInteger c = a.add(b);
		BigInteger d = c.multiply(b.add(BigInteger.valueOf(2)));
		System.out.println(c);
		System.out.println(d);
		
	}

}
