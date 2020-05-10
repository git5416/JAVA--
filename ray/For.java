package ray;
/*���������������齱�н����ʡ���������1~50֮���������ȡ6���������齱
 * ����ô���У�50*49*48*47*46*45��/��1*2*3*4*5*6���ֿ��ܵĽ���������н��Ļ���Ϊ
 * 1/15890700.ף����ˣ�*/
import java.util.Scanner;

public class For {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.print("What is the hignest number you can draw?");
		int n = in.nextInt();
		
		/*compute binomial coefficient n*(n+1)*(n+2)*...*(n-k+1)/(1*2*3*...*k)*/
		
		int lotteryOdds = 1;
		for(int i = 1;i <= k;i++)
			lotteryOdds = lotteryOdds * (n - i + 1)/i;
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ".Good luck!");
	}
}
