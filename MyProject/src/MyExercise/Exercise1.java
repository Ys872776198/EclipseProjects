package MyExercise;

public class Exercise1 {
	public static void main(String arg[]) {
		for(int x=1; x<10;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
		}
		
		int line=5;
		for(int i=1;i<=line;i++) {
			for(int e=1;e<=line-i;e++) {
				System.out.print(" ");
			}
			for(int e=1;e<=i;e++) {
			System.out.print("* ");
		}
			System.out.println();
	}
		print();
		println("world");
		int add=add(10,50);
		System.out.println(add);
		int add2= add1(10);
		System.out.println(add2);
}
	/**
	 * 方法的定义
	 */
	public static void print() {
		System.out.println("hello");
	}
	
	public static void println(String string) {
		System.out.println(string);
	}
	
	public static int add(int b,int c) {
		return b+c;
	}
	
	/**
	 * 递归调用
	 * @return
	 */
	public static int add1(int f) {
		if(f==1) {
			return 1;
		}
		return f*add1(f-1);
	}
}
