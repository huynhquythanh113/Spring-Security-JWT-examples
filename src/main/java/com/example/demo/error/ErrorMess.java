package com.example.demo.error;

public class ErrorMess {
	private String mess;
	private String status;
	private Object data;
	
	public ErrorMess() {
		// TODO Auto-generated constructor stub
	}

	public ErrorMess(String mess, String status, Object data) {
		super();
		this.mess = mess;
		this.status = status;
		this.data = data;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
