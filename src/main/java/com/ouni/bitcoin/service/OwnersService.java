package com.ouni.bitcoin.service;

import java.util.List;

import com.ouni.bitcoin.entities.Owners;

public interface OwnersService {
	Owners saveOwner(Owners o);
	Owners updateOwner(Owners o);
	void deleteOwner(Owners o);
	void deleteOwnerById(Long id);
	Owners getOwnerById(Long id);
	List<Owners> getAllOwners();
	List<Owners> findByBitcoin(String bitcoin);
}
