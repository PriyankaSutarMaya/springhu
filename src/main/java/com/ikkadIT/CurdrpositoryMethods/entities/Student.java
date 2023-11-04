package com.ikkadIT.CurdrpositoryMethods.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
	@Id
	@Column(name="S_ID")
	private int sid;
	@Column(name="S_NAME")
	private String sname;
	@Column(name="S_ADDRESS")
	private String saddress;
	@Column(name="S_SMARKS")
	private int smarks;
	@Column(name="S_SEMAIL")
	private String semail;
	@Column(name="S_SPASS")
	private String spass;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSpass() {
		return spass;
	}
	public void setSpass(String spass) {
		this.spass = spass;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", smarks=" + smarks
				+ ", semail=" + semail + ", spass=" + spass + "]";
	}
	
	

}
