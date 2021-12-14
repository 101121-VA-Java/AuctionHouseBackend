package com.spacecats.AuctionHouse.Daos;

import java.util.List;

import com.spacecats.AuctionHouse.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUsersByRoleid(int roleid);
    List<User> findByUname(String uname);
}