
public class School {
   protected int regno;
   protected String sch_name;
   
   
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getSch_name() {
	return sch_name;
}
public void setSch_name(String sch_name) {
	this.sch_name = sch_name;
}
public Student getSob() {
	System.out.println("ROLL : "+sob.getRollno());
	System.out.println("NAME : "+sob.getName());
	return sob;
}
public void setSob(Student sob) {
	this.sob = sob;
}
Student sob;
   public School(){
	   super();
   
  }
public School(int i, String s, Student std) {
	regno=i;sch_name=s;sob=std;
}
   
   
}
