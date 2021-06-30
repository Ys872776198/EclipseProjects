package MyExercise;

class Course{
	private int cno;
	private String sname;
	private String cname;
	private int cpno;
	private int ccredit;
	public Course() {
		
	}
	
	public void setCno(int n) {
		cno=n;
	}
	public void setSname(String n) {
		sname=n;
	}
	public void setCname(String n) {
		cname=n;
	}
	public void setCpno(int n) {
		cpno=n;
	}
	public void setCcredit(int n) {
		ccredit=n;
	}
	public int getCno(int n) {
		return n;
	}
	public String getSname(String n) {
		return n;
	}
	public String getCname(String n) {
		return n;
	}
	public int getCpno(int n) {
		return n;
	}
	public int getCcredit(int n) {
		return n;
	}
	public Course(int cno,String sname,String cname,int cpno,int ccredit) {
		setCno(cno);
		setSname(sname);
		setCname(cname);
		setCpno(cpno);
		setCcredit(ccredit);
	}
	public String info() {
	return "学号"+cno+"\n"+
			"学生名"+sname+"\n"+
			"课程名"+cname+"\n"+
			"先行课"+cpno+"\n"+
			"成绩"+ccredit;
	}
}


public class Exercise4 {
	public static void main(String args[]) {
		System.out.println(new Course(1,"haha","数据库",5,99).info());
	}
}
