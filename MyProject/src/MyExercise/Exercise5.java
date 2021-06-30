package MyExercise;

class Company{
	private String name;
	private String bm;
	private String zw;
	private int gz;
	private String sj;
	public Company() {
		
	}
	public void setName(String n) {
		name=n;
	}
	public void setBm(String n) {
		bm=n;
	}
	public void setZw(String n) {
		zw=n;
	}
	public void setGz(int n) {
		gz=n;
	}
	public void setSj(String n) {
		sj=n;
	}
	public String getName(String n) {
		return n;
	}
	public String getBm(String n) {
		return n;
	}
	public String getZw(String n) {
		return n;
	}
	public int getGz(int n) {
		return n;
	}
	public String getSj(String n) {
		return n;
	}
	public Company(String name,String bm,String zw,int gz,String sj) {
		setName(name);
		setBm(bm);
		setZw(zw);
		setGz(gz);
		setSj(sj);
	}
	public String info() {
		return name+"\n"+bm+"\n"+zw+"\n"+gz+"\n"+sj;
	}
}

public class Exercise5 {
	public static void main(String arg[]) {
	System.out.println(new Company("gaga","hq","buz",5000,"20190320").info());
	}
}