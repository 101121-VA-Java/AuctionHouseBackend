package com.spacecats.AuctionHouse.Daos;

import com.spacecats.AuctionHouse.Models.Art;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "arts")
public interface ArtRepository extends JpaRepository<Art, Integer> {

}