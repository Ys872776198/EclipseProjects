package MyExercise;

class Game{
	private String name;
	private String zy;
	private String dq;
	private int zl;
	private int hy;
	public Game() {
		
	}
	public void setName(String n) {
		name=n;
	}
	public void setZy(String n) {
		zy=n;
	}
	public void setDq(String n) {
		dq=n;
	}
	public void setZl(int n) {
		zl=n;
	}
	public void setHy(int n) {
		hy=n;
	}
	public String getNmae(String n) {
		return n;
	}
	public String getZy(String n) {
		return n;
	}
	public String getDq(String n) {
		return n;
	}
	public int getZl(int n) {
		return n;
	}
	public int getHy(int n) {
		return n;
	}
	public Game(String name,String zy,String dq,int zl,int hy) {
		setName(name);
		setZy(zy);
		setDq(dq);
		setZl(zl);
		setHy(hy);
	}
	public String info() {
		return name+"\n"+zy+"\n"+dq+"\n"+zl+"\n"+hy;
	}
}


public class Exercise6 {
	public static void main(String arge[]) {
		System.out.print(new Game("gaga","ck","ltwl",190000,20).info());
	}
}
