package ray;

import java.util.Arrays;

/*1.�̳������������������֮һ�����������ֱ��ǣ���װ���̳С���̬��
 * 2.�̳С��������������ǣ����븴�á����Ǽ̳�����Ҫ�������ǣ����˼̳в������Ժ�ġ������ĸ��ǡ��Ͷ�̬���ơ���
 * 3.�̳��﷨��ʽ��
 *       [���η��б�] class ���� extends ������{
 *                    ���� = ���� + ����
 *       }
 *       4.Java���Ե��еļ̳�֧֧�ֵ��̳У�һ���಻��ͬʱ�̳кܶ��ֻ࣬�ܼ̳�һ���ࡣ��c++��֧�ֶ�̳С�
 *       5.���ڼ̳е�һЩ���
 *       B��̳�A�࣬���У�
 *           A���Ϊ�����ࡢ���ࡢ���ࡢsuperclass
 *           B���Ϊ�����ࡢ�����ࡢsubclass
 *       6.��Java���Ե�������̳и��඼����Щ�����أ�
 *           *˽�еĲ�֧�ּ̳�
 *           *���췽����֧�ּ̳�
 *           *�������ݶ����Ա��̳�
 *       7.��ȻJava����ֻ֧�ֵ��̳У�����һ����Ҳ���Լ�������࣬���磺
 *               C extends B{
 *               }
 *               B extends A{
 *               }
 *               A extends T{
 *               }
 *               c��ֱ�Ӽ̳�B�࣬����C����T��A�ࡣ
 *        8.Java�����м���һ����û����ʾ�ļ̳��κ��࣬����Ĭ�ϼ̳�JavaSE�⵱���ṩ��java.lang.Object�ࡣ
 *        Java�������κ�һ�����ж���Object���������
 * */
public class Jicheng {
//�������ݼ�CTRL+shift+t
	public static void main(String[] args) {
		/*�̳�Object������������顣
		Jicheng ji = new Jicheng();
		String s = ji.toString();
		System.out.println(s);
		*/
		
		//�̳е�ʵ�֣�Jichengdemo�̳�Jichengtest��
		Jichengdemo j = new Jichengdemo();
		j.setActno("j-001");
		j.setBanlance(-1000.0);
		j.setCredit(0.99);
		 
		System.out.println(j.getActno() + "," + j.getBanlance() + "," + j.getCredit());
	}
}
