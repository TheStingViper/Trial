
public class Student {
   protected int rollno;
   protected String name;
   public Student(int i, String s, double d, double j, double k) {
	   rollno=i; name=s;m1=d;m2=j;m3=k;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getM1() {
	return m1;
}
public void setM1(double m1) {
	this.m1 = m1;
}
public double getM2() {
	return m2;
}
public void setM2(double m2) {
	this.m2 = m2;
}
public double getM3() {
	return m3;
}
public void setM3(double m3) {
	this.m3 = m3;
}
protected double m1,m2,m3;
}
