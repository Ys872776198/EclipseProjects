package MyExercise;

/**
 * String�����ʵ����
 * String�Ǹ��࣬��Ȼ���Լ��Ĺ��캯��
 * 
 * �ַ����Ƚϣ�
 * ��==��������������ֵ�Ƚϣ����ַ����Ƚ���ʹ�á�==����ʾ�Ǵ洢��ַ�Ƚ�
 * �����ַ����ȽϿ���ʹ��String���еķ�����
 * ���ݱȽ�;public boolean equals(String str);//(�����ͻ��ص���TRUE ���� false)
 * 
 * String��������
 * @author �ϸ�
 *
 */
public class Exercise15 {
	public static void main(String args[]) {
		/*String str =new String("Hello");
		//string str="hello";	//����ʵ��������
		System.out.println(str);*/
		
		/*�ַ����Ƚ�
		String str1="hello";
		String str2=new String("hello");
		System.out.println(str1.equals(str2));*/
		
		
//		System.out.println(new String("hello"));
		
		String str="hello";
		String str2="world";
		str=str + str2;
		char[] data=str.toCharArray();
		for(int i=0;i<data.length;i++) {
			data[i] -=32;
			System.out.print(data[i]);
			System.out.print(",");
		}
		System.out.println(new String(data,0,1));
		System.out.println(isNum(str)?"ƥ��":"��ƥ��");
	}
	
	public static boolean isNum(String str) {
		char[] data=str.toCharArray();
		for(int i=0;i<data.length;i++) {
		if(data[i] < '0'||data[i] > '9') {
			return false;
			}	
		}
		return true;
	}
}
