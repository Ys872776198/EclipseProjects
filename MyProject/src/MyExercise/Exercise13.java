package MyExercise;

/**
 * 数组装置：首尾交换：
 * 一维数组
 * 1、开辟新数组，倒序存放（最大问题：开辟两块相同空间，空间浪费）
 * 2、直接数组首尾换
 * @author 笙歌
 *
 */

public class Exercise13 {
	public static void main(String arge[]) {
		int[] data=new int[] {1,2,3,4,5,6,7,8,9};
		data=temp(data);
		System.out.println("一维数组倒置");
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]);
		}
	}
	
	public static int[] temp(int data[]) {
		int a=data.length/2;	//装置次数
		int head=0;	//头部索引
		int tail=data.length-1;	//尾部索引
		for(int i=0;i<a;i++) {
			int x=data[head];
			data[head]=data[tail];
			data[tail]=x;
			head++;
			tail--;
		}
		return data;
	}
}
/*public class Exercise13 {
	public static void main(String arge[]) {
		int[][] data=new int[][] {{0,1,2,3,4},{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		data=temp(data);
		System.out.println("二维数组倒置");
		for(int i=0;i<data.length;i++) {
			for(int y=0;y<data[i].length;y++) {
				System.out.print(data[i][y]);
			}
			System.out.println();
		}
	}
	
	public static int[][] temp(int data[][]) {
		for(int x=0;x<data.length;x++) {
			for(int y=0;y<data[x].length;y++) {
				if(x!=y) {
						int temp=data[x][y];
						data[x][y]=data[y][x];
						data[y][x]=temp;
				}
			}
		}
		return data;
	}
	}*/
