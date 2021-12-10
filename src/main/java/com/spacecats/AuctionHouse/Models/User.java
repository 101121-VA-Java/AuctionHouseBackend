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
	private int roleid;
	private String fname;
	private String lname;
	private String uname;
	private String pw;

	@Override
	public int hashCode() {
		return Objects.hash(fname, id, lname, pw, roleid, uname);
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
				&& Objects.equals(pw, other.pw) && roleid == other.roleid
				&& Objects.equals(uname, other.uname);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", uname=" + uname
				+ ", pw=" + pw + ", roleid=" + roleid + "]";
	}
}
