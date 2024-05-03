package test;
import java.io.*;
public class EmployeeBean implements Serializable{
	//creating variables for values
	private String eid,ename,edesg;
	private float bsal,hra,da,totSal;
	public EmployeeBean() {}
	//creating Getter and Setter Methods
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public float getBsal() {
		return bsal;
	}
	public void setBsal(float bsal) {
		this.bsal = bsal;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getTotSal() {
		return totSal;
	}
	public void setTotSal(float totSal) {
		this.totSal = totSal;
	}
	
}
