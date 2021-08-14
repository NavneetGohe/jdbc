package isolation;

public class MarksheetBean {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int rolllno;
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private int phy;
	private int che;
	private int mat;
	public int getRolllno() {
		return rolllno;
	}
	public void setRolllno(int rolllno) {
		this.rolllno = rolllno;
	}
	
	
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
public MarksheetBean() {
	// TODO Auto-generated constructor stub
}	
}
