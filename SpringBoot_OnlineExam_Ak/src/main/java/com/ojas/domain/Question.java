package com.ojas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	private int id;
	private String name;
	private String a;
	private String b;
	private String c;
	private String ans;

	public Question(int id, String name, String a, String b, String c, String ans) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.ans = ans;
	}

	public Question() {
		super();
	}
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
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", a=" + a + ", b=" + b + ", c=" + c + ", ans=" + ans + "]";
	}
	

	

	


	
	
	
}
