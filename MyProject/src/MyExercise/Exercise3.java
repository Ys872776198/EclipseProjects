package MyExercise;

class Student{
	private String  sname;
	private int sno;
	private String ssex;
	private int sage;
	private String sdept;
	public  Student() {
		
	}
	public void setSname(String n) {
		sname=n;
	}
	
	public void setSno(int n) {
		sno=n;
	}
	public void setSsex(String n) {
		ssex=n;
	}
	public void setSage(int n) {
		sage=n;
	}
	public void setSdept(String n) {
		sdept=n;
	}
	public String getSname(String  n) {
		return n;
	}
	public int getSno(int n) {
		return n;
	}
	public String getSsex(String n) {
		return n;
	}
	public int getSage(int n) {
		return n;
	}
	public String getSdept(String n) {
		return n;
	}
	public Student(int z,String q,String m,int n,String d) {
		setSno(z);
		setSname(q);
		setSsex(m);
		setSage(n);
		setSdept(d);
	}
	 public String info() {
		 return "姓名"+sname+"\n"+
				"年龄"+sage+"\n"+
				"性别"+ssex+"\n"+
				"学号"+sno+"\n"+
				"系别"+sdept;
	 }
	
}

public class Exercise3 {
	public static void main(String args[]) {
		/**
		 * 类的属性被封装可用匿名对象输出
		 */
		System.out.println(new Student(201602305,"haha","男",20,"电院").info());
		/*Student stu=new Student();		//实例化一个对象
		stu.setSno(201602305);	//动态初始化
		stu.setSname("haha");
		stu.setSsex("男");
		stu.setSage(18);
		stu.setSdept("电院");
		stu.info();*/
		//System.out.println("姓名"+stu.sname);此行报错，Student类中属性已被封装，外部无法调用
		//System.out.println(new Student(18,201602305).info());可以
		
		/*Student stu=new Student();
		stu.setSno(201602305);
		stu.setSname("haha");
		stu.setSsex("男");
		stu.setSage(18);
		stu.setSdept("电院");
		System.out.println(stu.info());用此方法输出也可以*/
	}
}
