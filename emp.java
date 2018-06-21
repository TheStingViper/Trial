
public class emp {
	
	protected static String cname = "Zensar";
	protected int ecode;
	protected String ename;
	
	
	public static String getCname() {
		return cname;
	}


	public static void setCname(String cname) {
		emp.cname = cname;
	}


	public int getEcode() {
		return ecode;
	}


	public void setEcode(int ecode) {
		this.ecode = ecode;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}

}
