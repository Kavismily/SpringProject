package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Certificate {
	private int id;
	private String name;
	private String usingorganization;
	private int localdate;
	private int issuedate;
	private int studentid;
	//constructor
	public Certificate() {
		
	}
	public Certificate(int id, String name, String usingorganization, int localdate, int issuedate, int studentid) {
		super();
		this.id = id;
		this.name = name;
		this.usingorganization = usingorganization;
		this.localdate = localdate;
		this.issuedate = issuedate;
		this.studentid = studentid;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//getter setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsingorganization() {
		return usingorganization;
	}
	public void setUsingorganization(String usingorganization) {
		this.usingorganization = usingorganization;
	}
	public int getLocaldate() {
		return localdate;
	}
	public void setLocaldate(int localdate) {
		this.localdate = localdate;
	}
	public int getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(int issuedate) {
		this.issuedate = issuedate;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	//toString
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", usingorganization=" + usingorganization + ", localdate="
				+ localdate + ", issuedate=" + issuedate + ", studentid=" + studentid + "]";
	}
	
	
	
	

}
