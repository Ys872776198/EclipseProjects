package MyExercise;
 /**
  * 数组的Copy
  * @author 笙歌
  *方法：System.arraycopy(原数组名称, 原数组起始点, 目标数组名, 目标数组起始点, 复制长度);
  *起始点是指从哪一位开始，而不是从那个数开始
  */
public class Exercise10 {
	public static void main(String arge[]) {
		int[] data=new int[] {1,2,3,4,5,6,7};
		int[] arr=new int[] {22,33,44,55,66,77};
		System.arraycopy(arr, 0, data, 1, 3);//从arr第0位开始，data从第1位开始（数组从0开始）
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]);
			if(i<data.length -1) {
			System.out.print(",");
					}
		}
	}
}
