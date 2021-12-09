package com.spacecats.AuctionHouse.Models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String username;
	private String password;
	private Role role;

	@Override
	public int hashCode() {
		return Objects.hash(fname, id, lname, password, role, username);
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
		return Objects.equals(fname, other.fname) && id == other.id && Objects.equals(lname, other.lname)
				&& Objects.equals(password, other.password) && role == other.role
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", username=" + username
				+ ", password=" + password + ", role=" + role + "]";
	}
}
