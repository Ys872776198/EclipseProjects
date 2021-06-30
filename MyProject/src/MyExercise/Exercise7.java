package MyExercise;

class Room{
	private String jd;
	private String wz;
	private int lc;
	private int fj;
	private int fjh;
	public void setJd(String n) {
		jd=n;
	}
	public void setWz(String n) {
		wz=n;
	}
	public void setLc(int n) {
		lc=n;
	}
	public void setFj(int n) {
		fj=n;
	}
	public void setFjh(int n) {
		fjh=n;
	}
	public String getJd(String n) {
		return n;
	}
	public String getWz(String n) {
		return n;
	}
	public int getLc(int n) {
		return n;
	}
	public int getFj(int n) {
		return n;
	}
	public int getFjh(int n) {
		return n;
	}
	public Room() {
		
	}
	public Room(String jd,String wz,int lc,int fj,int fjh) {
		setJd(jd);
		setWz(wz);
		setLc(lc);
		setFj(fj);
		setFjh(fjh);
	}
	public  String info() {
		return jd+"\n"+wz+"\n"+lc+"\n"+fj+"\n"+fjh;
	}
}

public class Exercise7 {
	public static void main(String args[]) {
		System.out.println(new Room("jj","dd",4,20,4020).info());
	}
}
