package MyExercise;

public class Exercise8 {
	public static void main(String args[]) {
		int[] data=init();
		Array(data);
	}
		//int[] data=new int[] {1,2,3,4,5};
		//Array(data);
		/*int[] temp=data;
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		}*/
	public static void Array(int[] temp) {  //无返回值方法输出
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]*2);
		}
	}
	public static int[] init() { //返回类型：int型数组
		return new int[] {1,2,3,20};//匿名数组赋值方式
	}
}
