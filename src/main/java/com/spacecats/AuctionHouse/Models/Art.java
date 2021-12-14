package com.spacecats.AuctionHouse.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="art")
@Data
public class Art {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String url;
	private String artistname;
	private String artpiecename;
	private int highestbid;
	private int bidderid;
	private int ownerid;
}
