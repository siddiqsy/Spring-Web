package com.webapp.models;

public class Results {

	private long sNo;
	private String packages;
	private String name;
	private String time;
	private String status;
	private String error;
	
	public Results() {
	}

	public Results(long sNo, String packages, String name, String time, String status, String error) {
		this.sNo = sNo;
		this.packages = packages;
		this.name = name;
		this.time = time;
		this.status = status;
		this.error = error;
	}

	public long getsNo() {
		return sNo;
	}

	public void setsNo(long sNo) {
		this.sNo = sNo;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "Results [sNo=" + sNo + ", packages=" + packages + ", name=" + name + ", time=" + time + ", status="
				+ status + ", error=" + error + "]";
	}
	
}
