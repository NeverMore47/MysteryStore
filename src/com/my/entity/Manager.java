package com.my.entity;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private Short manId;
	private String manName;
	private String manPwd;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String manName, String manPwd) {
		this.manName = manName;
		this.manPwd = manPwd;
	}

	// Property accessors

	public Short getManId() {
		return this.manId;
	}

	public void setManId(Short manId) {
		this.manId = manId;
	}

	public String getManName() {
		return this.manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getManPwd() {
		return this.manPwd;
	}

	public void setManPwd(String manPwd) {
		this.manPwd = manPwd;
	}

}