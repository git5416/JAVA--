package duotai;
/*
 * z����
 */
/*
public class Zhuren {
	
	 //ι������ķ���
	 
	public void feed(Chongwu c) {
		c.eat();
	}
	public void eat(Dogcw d) {
		d.eat();
	}
}
//Zhuren��Chongwu��Dogcw���������͵Ĺ����̶Ⱥ�ǿ����϶Ⱥܸߣ���չ���
*/

//���ͳ������϶ȡ�����ϡ�����߳�����չ�������������һ������Ҫ��Ŀ�꡿
public class Zhuren {

	//Zhuren�������������һ�������Pet,�����������ĳ���
	//�ᳫ����������̣���Ҫ��������̡�
	//��������̵ĺô��ǣ���϶ȵͣ���չ��ǿ��
	public void feed(Pet pet) { //Pea pet ��һ�������͵�����
		pet.eat();
	}
}
