package MyExercise;

/**
 * �������飨���ģ�
 * ����Ҳ���Զ���Ϊ���飬������������������Ϊ�����ж��壬���磺�࣬�ӿڡ�
 *����
 * 1����̬��ʼ�������� ����������=new ����[����]
 * 2����̬��ʼ�������� ����������=new ����[] {ʵ��������.....}
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
		return "����:"+name+"\n"
				+"����:"+age;
	}
}

public class Exercise14 {
	public static void main(String arge[]){
		/*Person1[] per=new Person1[3];	//ʵ������������
		//��̬��ʼ��
		per[0]=new Person1("����",18);
		per[1]=new Person1("����",19);
		per[2]=new Person1("����",20);*/	
		Person1[] per=new Person1[]{
		//��̬��ʼ��
		new Person1("����",18),new Person1("����",19),new Person1("����",20)
		};
		 
		for(int x=0;x<per.length;x++) {
			System.out.println(per[x].getInfo());
		}
		
	}
}
