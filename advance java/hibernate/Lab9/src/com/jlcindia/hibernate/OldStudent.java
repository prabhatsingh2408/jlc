package com.jlcindia.hibernate;

public class OldStudent extends Student{
private String ocompany;
private String oemail;
private double octc;
public OldStudent() {
	super();
}
public OldStudent(String sname, String city, String status, double totalfee,String ocompany, String oemail, double octc) 
{
	super(sname, city, status, totalfee);
		
	this.ocompany = ocompany;
	this.oemail = oemail;
	this.octc = octc;
}
public String getOcompany() {
	return ocompany;
}
public void setOcompany(String ocompany) {
	this.ocompany = ocompany;
}
public String getOemail() {
	return oemail;
}
public void setOemail(String oemail) {
	this.oemail = oemail;
}
public double getOctc() {
	return octc;
}
public void setOctc(double octc) {
	this.octc = octc;
}
@Override
public String toString(){
	return super.toString()+","+ocompany+","+oemail+","+octc;
}
}