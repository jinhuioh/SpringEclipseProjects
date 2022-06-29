package com.hi.mvcProject;

public class Servicecenter2VO {
	
	public int getServiceIdx() {
		return serviceIdx;
	}
	public void setServiceIdx(int serviceIdx) {
		this.serviceIdx = serviceIdx;
	}
	public String getServiceWriter() {
		return serviceWriter;
	}
	public void setServiceWriter(String serviceWriter) {
		this.serviceWriter = serviceWriter;
	}
	public String getServiceTitle() {
		return serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}
	public String getServiceQuestion() {
		return serviceQuestion;
	}
	public void setServiceQuestion(String serviceQuestion) {
		this.serviceQuestion = serviceQuestion;
	}
	public String getServiceRgstday() {
		return serviceRgstday;
	}
	public void setServiceRgstday(String serviceRgstday) {
		this.serviceRgstday = serviceRgstday;
	}
	

	@Override
	public String toString() {
		return "Servicecenter2VO [serviceIdx=" + serviceIdx + ", serviceIdxRe=" + serviceIdxRe + ", serviceIdOrigin="
				+ serviceIdOrigin + ", serviceWriter=" + serviceWriter + ", serviceTitle=" + serviceTitle
				+ ", serviceQuestion=" + serviceQuestion + ", serviceRgstday=" + serviceRgstday + "]";
	}


	private int serviceIdx;
	public int getServiceIdxRe() {
		return serviceIdxRe;
	}
	public void setServiceIdxRe(int serviceIdxRe) {
		this.serviceIdxRe = serviceIdxRe;
	}
	public int getServiceIdOrigin() {
		return serviceIdOrigin;
	}
	public void setServiceIdOrigin(int serviceIdOrigin) {
		this.serviceIdOrigin = serviceIdOrigin;
	}

	private int serviceIdxRe;
	private int serviceIdOrigin;
	private String serviceWriter;
	private String serviceTitle;
	private String serviceQuestion;
	private String serviceRgstday;

}
