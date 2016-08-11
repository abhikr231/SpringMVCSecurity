package com.websystique.springmvc.exception;

/**
 * 
 * @author DAMCO
 *
 */
public class BaseException extends RuntimeException{
	private String exceptionMsg;

	
	public BaseException(String exceptionMsg){
		this.exceptionMsg = exceptionMsg;
	}
	
	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

}
