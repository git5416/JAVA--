package ray;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Wenjianshuruyushuchu {
	public static void main(String[] args) throws IOException{//�׳��쳣
		File file=new File("scores.txt");//�����ļ�
		if(file.exists()) System.out.println("file already exists");//����ļ��Ƿ����
		try(PrintWriter output=new PrintWriter(file);){//д���ļ�
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
		Scanner input=new Scanner(file);
		while(input.hasNext()){//��ȡ�ļ�
			String firstName=input.next();
			String mi=input.next();
			String lastName=input.next();
			
			String score =input.next();
			
			System.out.println(firstName+" "+mi+" "+lastName+" "+score);
		}
		input.close();//�ر��ļ�
		}
}
