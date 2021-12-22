package com.spacecats.AuctionHouse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spacecats.AuctionHouse.Daos.BidRepository;
import com.spacecats.AuctionHouse.Exceptions.UNFException;
import com.spacecats.AuctionHouse.Models.Bid;

@Service
public class BidService {
	
	private BidRepository br;
	
	@Autowired
	public BidService(BidRepository br) {
		this.br = br;
	}

	public List<Bid> getAllBids(){
		return br.findAll();
	}
	
	public Bid getBidById(int id) {
		return br.findById(id).orElseThrow(UNFException::new);
	}

	public List<Bid> getBidsByArtId(int id) {
		return br.findBidsByArtid(id);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public Bid createBid(Bid a) {
		return br.save(a);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(int id){
		br.deleteById(id);
	}
	
	public List<Bid> getBidsByBidderid(int ownerid){
		return br.findBidsByBidderid(ownerid);
	}
}