package ray;

import java.util.Arrays;

public class Shuzuchuangjian {
	public static void main(String[] args)
	{
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};    //�����������ͬʱ�����ʼֵ�ļ���д��ʽ
		smallPrimes = new int[] {1, 2, 3, 4, 5};
		int [] anonymous = {17, 19, 23, 29, 31, 37};
		smallPrimes = anonymous;
		System.out.println(Arrays.toString(smallPrimes));
		
		int[] luckyNumbers = smallPrimes;    //������Ԫ�صĿ���
		luckyNumbers[5] = 12;
		System.out.println(smallPrimes[5]);
		
		int[] copiedluckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);    //��һ�����������е�ֵ������һ���µ�������
		System.out.println(Arrays.toString(copiedluckyNumbers));
		
		luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);    //�ڶ���������������ĳ��ȣ��������ͨ��������������Ĵ�С
		System.out.println(Arrays.toString(luckyNumbers));
		
	}
}
