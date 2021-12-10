package com.spacecats.AuctionHouse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spacecats.AuctionHouse.Daos.UserRepository;
import com.spacecats.AuctionHouse.Exceptions.UNFException;
import com.spacecats.AuctionHouse.Models.User;

@Service
public class UserService {
	
	private UserRepository ur;
	
	@Autowired
	public UserService(UserRepository ur) {
		this.ur = ur;
	}

	public List<User> getAllUsers(){
		return ur.findAll();
	}
	
	public User getUserById(int id) {
		return ur.findById(id).orElseThrow(UNFException::new);
	}
	
	public User login(User u1) {
		List<User> users = ur.findByUname(u1.getUname());
		for(User u2 : users) {
			if(u1.getPw().equals(u2.getPw())) {
				return u2;
			}
		}
		return null;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public String createUser(User u) {
		u.setRoleid(2);
		User result = ur.save(u);
		int id = result.getId();
		int roleid = result.getRoleid();
		return id + ":" + roleid;
	}
	
	public List<User> getUserByRoleid(int roleid){
		return ur.findUsersByRoleid(roleid);
	}
}