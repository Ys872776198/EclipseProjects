package MyExercise;

//Stringz����û������ĸ��д�ķ���

/**
 *����������ĸ��д�任�Ĵ��루���ã� 
 *str.substring(0,1)��String��ȡ�ķ��������ã�
 *str.toUpperCase()��Stringָ���ַ�Сдת��д�ķ����������ã�
 * @author Administrator
 *
 */

public class Exercise16 {

	public static void main(String[] args) {
		String str="hello";
		System.out.println(initcap(str));
	}

	public static String initcap(String str) {
		//"".equals(String)��str.isEmpty()  ���Ǽ���ַ����Ƿ�Ϊ�� ���ڲ����str ==nullʱ��str.isEmpty()�������ָ��
		if(str ==null || "".equals(str)) {
			return str;
		}
		if(str.length()>1) {
			return str.substring(0,1).toUpperCase()+str.substring(1);
		}
		return str.toUpperCase();
	}
	
}
