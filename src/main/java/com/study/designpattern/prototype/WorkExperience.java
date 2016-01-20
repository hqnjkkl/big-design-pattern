package com.study.designpattern.prototype;

/**
 * @author huqiaonan
 * @date 2016年1月20日 上午10:24:48
 */
public class WorkExperience implements Cloneable{
	Integer workTime;
	String workCompany;
	
	public WorkExperience() {
		
	}

	public WorkExperience(Integer wt,String wc)
	{
		this.workTime = wt;
		this.workCompany = wc;
	}
	
	public Integer getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}

	public String getWorkCompany() {
		return workCompany;
	}

	public void setWorkCompany(String workCompany) {
		this.workCompany = workCompany;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
