package com.jbs.firstdemo.modal;

// POJO - Plain Old Java Object
public class Book {
	private long id;
	private String bname;
	private String label;
	public Book() {
		super();
	}
	public Book(long id, String bname, String label) {
		super();
		this.id = id;
		this.bname = bname;
		this.label = label;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", label=" + label + "]";
	}
	
}
