package com.websystique.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.websystique.springmvc.exception.BaseException;

/**
 * Represents a controller used to catch all kinds of exceptions
 * @author DAMCO
 *
 */
@ControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler({BaseException.class})
	public ModelAndView handleRuntimeException(final BaseException exception){
		ModelAndView model = new ModelAndView("duplicateUserExp");
		model.addObject("baseException",exception.getExceptionMsg());
		return model;
	}


}
