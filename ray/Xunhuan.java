package ray;

import java.util.Scanner;
//������Ҫ�೤ʱ����ܹ��洢һ�����������ݽ�
//�ٶ�ÿ�������ͬ�����Ľ����������ǹ̶���
public class Xunhuan {    //whileѭ��
	public static void main(String[] args)
	{
		//read inputs
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire?");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you conteibute every year?");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;    //������
		
		//update account balance while goal isn't reached
		while(balance < goal)
		{
			//add this year's payment and interest
			balance += payment;
			double interest = balance * interestRate/100;
			balance += interest;
			years += 1;
		}
		
		System.out.println("You can retire in " + years +"years.");
	}

}
