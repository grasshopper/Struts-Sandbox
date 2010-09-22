package com.coolisland.struts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	private static final long serialVersionUID = -4864534403169488543L;
	private String username;
	private String password;

	/**
	 * Authenicates the user name/password
	 * 
	 * @return "success" or "error"
	 */
	@Override
	public String execute() {

		if (this.username.equals("admin") && this.password.equals("admin123")) {
			return "success";
		} else {
			return "error";
		}
	}

	/**
	 * Returns the user name
	 * 
	 * @return user name
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the user name
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * returns the password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
