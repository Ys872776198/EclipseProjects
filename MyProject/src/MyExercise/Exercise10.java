package MyExercise;
 /**
  * �����Copy
  * @author �ϸ�
  *������System.arraycopy(ԭ��������, ԭ������ʼ��, Ŀ��������, Ŀ��������ʼ��, ���Ƴ���);
  *��ʼ����ָ����һλ��ʼ�������Ǵ��Ǹ�����ʼ
  */
public class Exercise10 {
	public static void main(String arge[]) {
		int[] data=new int[] {1,2,3,4,5,6,7};
		int[] arr=new int[] {22,33,44,55,66,77};
		System.arraycopy(arr, 0, data, 1, 3);//��arr��0λ��ʼ��data�ӵ�1λ��ʼ�������0��ʼ��
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]);
			if(i<data.length -1) {
			System.out.print(",");
					}
		}
	}
}
