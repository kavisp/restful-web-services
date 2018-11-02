package com.restful.webservices.restfulwebservices.exceptions;

import java.util.Date;

public class ExceptionResponse {
	private String errorMessage;
	private String details;
	private Date timestamp;
	private String helpUrl;
	
	public ExceptionResponse(String errorMessage, String details, Date timestamp, String helpUrl) {
		super();
		this.errorMessage = errorMessage;
		this.details = details;
		this.timestamp = timestamp;
		this.helpUrl = helpUrl;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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
