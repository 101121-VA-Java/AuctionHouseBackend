package com.spacecats.AuctionHouse.Models;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Art {
	private int a_id;              // | Primary Key |                                   \\
	private String a_url;         // | varchar(100) |                                    \\
	private int a_chbid;         //current_highest_bid | integer |                        \\
	private int a_ownerid;      //| owner_id | int references user_id as foreign key |     \\
	private String a_artist;   //| Artist_name | varchar(100) |                             \\
	private String a_artname; //| Name of piece | varchar(100) |                             \\
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_url() {
		return a_url;
	}
	public void setA_url(String a_url) {
		this.a_url = a_url;
	}
	public int getA_chbid() {
		return a_chbid;
	}
	public void setA_chbid(int a_chbid) {
		this.a_chbid = a_chbid;
	}
	public int getA_ownerid() {
		return a_ownerid;
	}
	public void setA_ownerid(int a_ownerid) {
		this.a_ownerid = a_ownerid;
	}
	public String getA_artist() {
		return a_artist;
	}
	public void setA_artist(String a_artist) {
		this.a_artist = a_artist;
	}
	public String getA_artname() {
		return a_artname;
	}
	public void setA_artname(String a_artname) {
		this.a_artname = a_artname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(a_artist, a_artname, a_chbid, a_id, a_ownerid, a_url);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Art other = (Art) obj;
		return Objects.equals(a_artist, other.a_artist) && Objects.equals(a_artname, other.a_artname)
				&& a_chbid == other.a_chbid && a_id == other.a_id && a_ownerid == other.a_ownerid
				&& Objects.equals(a_url, other.a_url);
	}
	@Override
	public String toString() {
		return "Art [a_id=" + a_id + ", a_url=" + a_url + ", a_chbid=" + a_chbid + ", a_ownerid=" + a_ownerid
				+ ", a_artist=" + a_artist + ", a_artname=" + a_artname + "]";
	}
	
}
