package MyExercise;
/**
 * 数组数据统计
 * @author 笙歌
 *
 */
public class Exercise11 {
	public static void main(String args[]) {
		int[] data=new int[] {1,20,5,40,30,60};
		double[] temp=Array(data);
		System.out.println("最大数："+temp[0]);
		System.out.println("最小数："+temp[1]);
		System.out.println("总和："+temp[2]);
	}
	public static double[] Array(int data[]) {	//因为返回值有3个，所以用数组返回，因为返回的数据类型不一致，所以用double
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
 * @author 笙歌
 *
 */
/*public class Exercise11{
	public static void main(String args[]) {
		
	}
}*/