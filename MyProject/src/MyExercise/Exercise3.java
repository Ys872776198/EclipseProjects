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
		 return "����"+sname+"\n"+
				"����"+sage+"\n"+
				"�Ա�"+ssex+"\n"+
				"ѧ��"+sno+"\n"+
				"ϵ��"+sdept;
	 }
	
}

public class Exercise3 {
	public static void main(String args[]) {
		/**
		 * ������Ա���װ���������������
		 */
		System.out.println(new Student(201602305,"haha","��",20,"��Ժ").info());
		/*Student stu=new Student();		//ʵ����һ������
		stu.setSno(201602305);	//��̬��ʼ��
		stu.setSname("haha");
		stu.setSsex("��");
		stu.setSage(18);
		stu.setSdept("��Ժ");
		stu.info();*/
		//System.out.println("����"+stu.sname);���б���Student���������ѱ���װ���ⲿ�޷�����
		//System.out.println(new Student(18,201602305).info());����
		
		/*Student stu=new Student();
		stu.setSno(201602305);
		stu.setSname("haha");
		stu.setSsex("��");
		stu.setSage(18);
		stu.setSdept("��Ժ");
		System.out.println(stu.info());�ô˷������Ҳ����*/
	}
}
