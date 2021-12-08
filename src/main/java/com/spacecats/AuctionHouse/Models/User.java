package com.spacecats.AuctionHouse.Models;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int u_id;
	private String u_fname;
	private String u_lname;
	private String u_username;
	private String u_password;
	private Role u_role;
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_fname() {
		return u_fname;
	}
	public void setU_fname(String u_fname) {
		this.u_fname = u_fname;
	}
	public String getU_lname() {
		return u_lname;
	}
	public void setU_lname(String u_lname) {
		this.u_lname = u_lname;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public Role getU_role() {
		return u_role;
	}
	public void setU_role(Role u_role) {
		this.u_role = u_role;
	}
	@Override
	public int hashCode() {
		return Objects.hash(u_fname, u_id, u_lname, u_password, u_role, u_username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(u_fname, other.u_fname) && u_id == other.u_id && Objects.equals(u_lname, other.u_lname)
				&& Objects.equals(u_password, other.u_password) && u_role == other.u_role
				&& Objects.equals(u_username, other.u_username);
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_fname=" + u_fname + ", u_lname=" + u_lname + ", u_username=" + u_username
				+ ", u_password=" + u_password + ", u_role=" + u_role + "]";
	}
	
}
