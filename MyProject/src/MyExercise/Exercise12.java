package MyExercise;

/**
 * Ã°ÅİÅÅĞò
 * ÉıĞò
 * 
 * @author óÏ¸è
 */

public class Exercise12 {
	public static void main(String args[]) {
		int[] data=new int[] {8,7,9,5,4,6,2,3,1,0};
		data=temp(data);
		System.out.println("Ã°ÅİÅÅĞò½á¹û£º");
		for(int i=0;i<data.length;i++) {
			
		System.out.print(data[i]);
		}
	}
	
	public static int[] temp(int data[]){
		int x;
		for(int i=0;i<data.length;i++) {
			for(int y=0;y<data.length-1;y++) {
				if(data[y]>data[y+1]) {
					x=data[y+1];
					data[y+1]=data[y];
					data[y]=x;
			}
			}
		}
		return data;
	}
}
