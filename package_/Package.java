package package_;
/*
 * ����Java���Ե��еİ����ƣ�
 *     1.���ֳ�Ϊpackage��Java������package�����﷨������Ҫ��Ϊ�˷���������
 *              ��ͬ���ܵ��౻���ű���طŵ���ͬ����������У����ұȽϷ��㣬����Ҳ�ȽϷ��㣬��ά����
 *     2.��ô����package�أ�
 *       -��JavaԴ����ĵ�һ���ϱ�дpackage���
 *       -packageֻ�ܱ�дһ����䡣
 *       -�﷨�ṹ�� package ����;
 *     3.���������淶����˾�������� + ��Ŀ�� + ģ���� + ��������
 *       - ���磺com.bjpowernode.oa.user.service;org.apache.tomcat.core;
 *     4.����Ҫ��ȫ��Сд������Ҳ�Ǳ�ʶ�����������ر�ʶ������������
 *     5.һ����������Ӧ����һ��Ŀ¼
 *     6.ʹ����package���ƺ�Ӧ����ô���룿��ô�����أ�
 *       ��ʹ����package����֮������������Package�ˣ�������package_.Package
 *       -���룺javac javaԴ�ļ�·������Ӳ��������һ��class�ļ���Package.class ��
 *       -�ֶ���ʽ����Ŀ¼����Package.class�ֽ����ļ��ŵ�ָ����Ŀ¼��
 *       -���У�java package_.Package
 *       -��һ�ַ�ʽ������ + ���У���
 *           *���룺javac -d ����֮����·�� javaԴ�ļ���·��
 *           *���磺��F��\Hello.java�ļ�����֮��ŵ�C:\Ŀ¼��
 *               -javac -d C:\F:\Hello.java
 *           *java -d . *.java
 *               -����ǰ·����*��java����֮���ŵ���ǰĿ¼�¡�
 *           *���У�JVM���������ClassLoaderĬ�ϴӵ�ǰ·�����ء�
 *               -��֤DOS����ڵ�·�����л���package���ڵ�·����ִ�У�
 *               package_.Package.
 *     7.����������ͬһ�����µ�ʱ����Ҫ�Ӱ�����
 */
public class Package {

	public static void main(String[] args) {
		System.out.println("Package's main method execute!");
	}

}
