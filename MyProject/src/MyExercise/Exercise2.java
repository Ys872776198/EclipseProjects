package MyExercise;

class Person { //类以class开头，方法以public static开头，还要注意有无返回值，
		private String name;//封装，后面要写get（获取）+变量名（首字母大写）和set（设置）+变量名（首字母大写）
		private int arg;
		public Person() { //构造方法，默认	
		}
		public Person(String n2,int n1) {	//构造方法 ，无返回值，在数据封装后
			setName(n2);	//获取参数的值可以直接赋给封装变量，也可以调用set方法
			setArg(n1);
			//name=n2;
			//arg=n1;
		}
		public void setName(String n) {	//获取主方法的参数值，赋给封装变量，数据类型要一致
			name=n;
		}
		public void setArg(int n) {
			arg=n;
		}
		public String getName(String n) {		//主方法调用封装变量可以用get方法
			return n;
		}
		public int getArg(int n) {
			return n;
		}
		public void add() {
			if(arg<=100 && arg>=0) {
				 int arg1=arg;
				System.out.println("name="+name+","+"arg="+arg1);
			}else {
				System.out.println("年龄无效");
			}	
		}
	}

public class Exercise2 {
	public static void main(String age[]) {
		Person person=new Person();
		//Person person=new Person("haha",101);
		person.setName("haha");
		//person.setArg(101);
		//new Person("gaga",30).add();
	    //person.add();
	}
}
