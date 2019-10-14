package com.naveen.exceptions;

public class EmployeeEmptyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public EmployeeEmptyException(String msg) {
		super();
		this.msg = msg;
	}

	public EmployeeEmptyException() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "EmployeeEmptyException [msg=" + msg + "]";
	}
	
	
}
