package com.spacecats.AuctionHouse.Daos;

import java.util.List;

import com.spacecats.AuctionHouse.Models.Role;
import com.spacecats.AuctionHouse.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUsersByRole(Role role);
}