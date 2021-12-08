package com.spacecats.AuctionHouse.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spacecats.AuctionHouse.Exceptions.UNFException;
import com.spacecats.AuctionHouse.Models.User;


@Service
public class UserService {
	private List<User> users = new ArrayList<>(); //TODO Replace with DAO layer
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUserById(int id) {
		for(User u : users) {
			if(u.getU_id() == id) {
				return u;
			}
		}
		throw new UNFException();
	}
}
