package paixu;
/*
 * -Ͱ����
 *     -��Ŀ����5��ͬѧ�����ԣ��ֱ���5�֡�3�֡�5�֡�2�ֺ͡�8�֣�������10�֣�
 *         -��������С�����������
 */
import java.util.Scanner;

public class Tong {

	public static void main(String[] args) {
		int[] a = new int[11];
		int i,j;
		for (i = 0 ; i  < 10 ; i ++)
		{
			a[i] = 0;    //��ʮ������Ԫ�ض���ʼ��Ϊ0
		}
		
		for (i = 0 ; i < 5 ; i ++)    //ѭ������5����
		{
			Scanner in = new Scanner(System.in);    //�Ӽ������뿼���ķ���
			int t = in.nextInt();    //�������룬������λͬѧ�Ŀ��Գɼ�
			a[t] ++;   //���м���
		}
		
		for (i = 0 ; i < 10 ; i ++)    //�����ж�a[0]~a[10]
		{
			for (j = 1 ; j <= a[i] ; j ++)    //�����˼��ξ��������
			{
				System.out.print(i);
			}
		}
	}

}
