package com.restful.webservices.restfulwebservices.exceptions;

import java.util.Date;

public class ExceptionResponse {
	private String errorMessage;
	private int errorCode;
	private Date timestamp;
	private String helpUrl;
	
	public ExceptionResponse(String errorMessage, int errorCode, Date timestamp, String helpUrl) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.timestamp = timestamp;
		this.helpUrl = helpUrl;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getHelpUrl() {
		return helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}
	
}
