package MyExercise;

class Person { //����class��ͷ��������public static��ͷ����Ҫע�����޷���ֵ��
		private String name;//��װ������Ҫдget����ȡ��+������������ĸ��д����set�����ã�+������������ĸ��д��
		private int arg;
		public Person() { //���췽����Ĭ��	
		}
		public Person(String n2,int n1) {	//���췽�� ���޷���ֵ�������ݷ�װ��
			setName(n2);	//��ȡ������ֵ����ֱ�Ӹ�����װ������Ҳ���Ե���set����
			setArg(n1);
			//name=n2;
			//arg=n1;
		}
		public void setName(String n) {	//��ȡ�������Ĳ���ֵ��������װ��������������Ҫһ��
			name=n;
		}
		public void setArg(int n) {
			arg=n;
		}
		public String getName(String n) {		//���������÷�װ����������get����
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
				System.out.println("������Ч");
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
