package MyExercise;

/**
 * 数组的排序
 * @author 笙歌
 *
 */

public class Exercise9 {
	public static void main(String args[]) {
		int[] data=new int[] {20,5,3,48};
		char[] temp=new char[] {'赵','钱','孙','李'};
		java.util.Arrays.sort(data);//java.util.Arrays.sort(数组名);Java只带的数据排列方法
		java.util.Arrays.sort(temp);
		Array(data);	//此处为方法重载
		Array(temp);
	}
	public static void Array(int[] temp) {  //无返回值方法输出
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
	public static void Array(char[] temp) {  //无返回值方法输出
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
}
