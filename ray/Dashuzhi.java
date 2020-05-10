package ray;
/*�����㱻����μӳ齱�������490�����ܵ���ֵ�г�ȡ60����������򽫻�õ�
 * �вʵĸ���1/191528501975691732068491783499249034628788241073665059156342839832464942946480
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Dashuzhi {
	public static void main(String[] args)
	{ 
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw?");
		int n = in.nextInt();
		
		/*
		 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
		 */
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for(int i = 1; i <= k; i++)
			lotteryOdds = ((BigInteger) lotteryOdds).multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}

}
