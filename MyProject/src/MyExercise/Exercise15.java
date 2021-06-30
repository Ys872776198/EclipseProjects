package MyExercise;

/**
 * String类对象实例化
 * String是个类，必然有自己的构造函数
 * 
 * 字符串比较：
 * “==”是用来进行数值比较，在字符串比较中使用“==”表示是存储地址比较
 * 进行字符串比较可以使用String类中的方法：
 * 内容比较;public boolean equals(String str);//(布尔型换回的是TRUE 或者 false)
 * 
 * String匿名对象
 * @author 笙歌
 *
 */
public class Exercise15 {
	public static void main(String args[]) {
		/*String str =new String("Hello");
		//string str="hello";	//两种实例化方法
		System.out.println(str);*/
		
		/*字符串比较
		String str1="hello";
		String str2=new String("hello");
		System.out.println(str1.equals(str2));*/
		
		
//		System.out.println(new String("hello"));
		
		String str="hello";
		String str2="world";
		str=str + str2;
		char[] data=str.toCharArray();
		for(int i=0;i<data.length;i++) {
			data[i] -=32;
			System.out.print(data[i]);
			System.out.print(",");
		}
		System.out.println(new String(data,0,1));
		System.out.println(isNum(str)?"匹配":"不匹配");
	}
	
	public static boolean isNum(String str) {
		char[] data=str.toCharArray();
		for(int i=0;i<data.length;i++) {
		if(data[i] < '0'||data[i] > '9') {
			return false;
			}	
		}
		return true;
	}
}
