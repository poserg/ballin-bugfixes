package com.github.poserg.usedbooksshop.server;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author poserg@gmail.com
 *
 */
@WebService
@Stateless
public class Servlet {
	
	@WebMethod
	public Calendar getCurrentTime(String timeZoneId) {
		return GregorianCalendar.getInstance(TimeZone.getTimeZone(timeZoneId));
	}
}
