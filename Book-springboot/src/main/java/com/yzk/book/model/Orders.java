package com.yzk.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	private int id;
	private String uname;
	private String bname;
	private String btime;
	private String ftime;
	private String state;
	public Orders(int id, String uname, String bname, String btime, String ftime, String state) {
		super();
		this.id = id;
		this.uname = uname;
		this.bname = bname;
		this.btime = btime;
		this.ftime = ftime;
		this.state = state;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", uname=" + uname + ", bname=" + bname + ", btime=" + btime + ", ftime=" + ftime
				+ ", state=" + state + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
