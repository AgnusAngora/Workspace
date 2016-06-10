package cl.java.Builder;

public class GPS {

	private String sO;
	private int version;
	public String getsO() {
		return sO;
	}
	public void setsO(String sO) {
		this.sO = sO;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public GPS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GPS(String sO, int version) {
		super();
		this.sO = sO;
		this.version = version;
	}
	
	
}
