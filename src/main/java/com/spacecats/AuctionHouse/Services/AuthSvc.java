package com.spacecats.AuctionHouse.Services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spacecats.AuctionHouse.Models.User;

public class AuthSvc {
	private static Logger log = LogManager.getRootLogger();
	
	public String login(String un, String pw) {
		String token = null;
		User la = new User();
		if (la != null && la.getPw().equals(pw)) { //update getter with new table headers.
			token = la.getId()+":"+la.getFname()+" "+la.getLname()+" Role="+la.getRoleid();
		} else {
			log.error("User "+un+" was unable to login. Please ensure the user exists and the password is correct.");
		}
		return token;
	}
}
