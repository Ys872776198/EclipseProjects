package MyExercise;
/**
 * ��������ͳ��
 * @author �ϸ�
 *
 */
public class Exercise11 {
	public static void main(String args[]) {
		int[] data=new int[] {1,20,5,40,30,60};
		double[] temp=Array(data);
		System.out.println("�������"+temp[0]);
		System.out.println("��С����"+temp[1]);
		System.out.println("�ܺͣ�"+temp[2]);
	}
	public static double[] Array(int data[]) {	//��Ϊ����ֵ��3�������������鷵�أ���Ϊ���ص��������Ͳ�һ�£�������double
		double[] arr=new double[3];
		arr[0] =data[0];
		arr[1] =data[0];
		arr[2] =0;
		for(int i=0;i<data.length;i++) {
			if(arr[0]<data[i]) {
				arr[0]=data[i];
			}
			if(arr[1]>data[i]) {
				arr[1]=data[i];
			}
			arr[2]+=data[i];
		}
		return arr;
	}
}

/**
 * 
 * @author �ϸ�
 *
 */
/*public class Exercise11{
	public static void main(String args[]) {
		
	}
}*/