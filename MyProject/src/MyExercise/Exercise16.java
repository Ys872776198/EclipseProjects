package MyExercise;

//Stringz类中没有首字母大写的方法

/**
 *下面是首字母大写变换的代码（常用） 
 *str.substring(0,1)是String截取的方法（常用）
 *str.toUpperCase()是String指定字符小写转大写的方法。（常用）
 * @author Administrator
 *
 */

public class Exercise16 {

	public static void main(String[] args) {
		String str="hello";
		System.out.println(initcap(str));
	}

	public static String initcap(String str) {
		//"".equals(String)和str.isEmpty()  都是检查字符串是否为空 ，在不配合str ==null时，str.isEmpty()会产生空指向
		if(str ==null || "".equals(str)) {
			return str;
		}
		if(str.length()>1) {
			return str.substring(0,1).toUpperCase()+str.substring(1);
		}
		return str.toUpperCase();
	}
	
}
