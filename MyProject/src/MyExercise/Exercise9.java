package MyExercise;

/**
 * ���������
 * @author �ϸ�
 *
 */

public class Exercise9 {
	public static void main(String args[]) {
		int[] data=new int[] {20,5,3,48};
		char[] temp=new char[] {'��','Ǯ','��','��'};
		java.util.Arrays.sort(data);//java.util.Arrays.sort(������);Javaֻ�����������з���
		java.util.Arrays.sort(temp);
		Array(data);	//�˴�Ϊ��������
		Array(temp);
	}
	public static void Array(int[] temp) {  //�޷���ֵ�������
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
	public static void Array(char[] temp) {  //�޷���ֵ�������
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
}
