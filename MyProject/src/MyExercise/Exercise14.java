package MyExercise;

/**
 * 对象数组（核心）
 * 对象也可以定义为数组，往往以引用数组类型为主进行定义，例如：类，接口。
 *定义
 * 1、动态初始化：类名 对象数组名=new 类名[长度]
 * 2、静态初始化：类名 对象数组名=new 类名[] {实例化对象，.....}
 */
class Person1{
	private String name;
	private int age;
	public void setName(String a) {
		name=a;
	}
	public void setAge(int a) {
		age=a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Person1() {
	}
	public Person1(String name,int age) {
		setName(name);
		setAge(age);
	}
	public String getInfo() {
		return "姓名:"+name+"\n"
				+"年龄:"+age;
	}
}

public class Exercise14 {
	public static void main(String arge[]){
		/*Person1[] per=new Person1[3];	//实例化对象数组
		//动态初始化
		per[0]=new Person1("张三",18);
		per[1]=new Person1("李四",19);
		per[2]=new Person1("王五",20);*/	
		Person1[] per=new Person1[]{
		//静态初始化
		new Person1("张三",18),new Person1("李四",19),new Person1("王五",20)
		};
		 
		for(int x=0;x<per.length;x++) {
			System.out.println(per[x].getInfo());
		}
		
	}
}
