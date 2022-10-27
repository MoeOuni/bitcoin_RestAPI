package com.ouni.bitcoin.service;

import java.util.List;

import com.ouni.bitcoin.entities.Bitcoin;
import com.ouni.bitcoin.entities.Owners;

public interface BitcoinService {
	Bitcoin saveBitcoin(Bitcoin b);

	Bitcoin getBitcoinById(long id);

	void deleteBitcoinById(long id);

	Bitcoin updateBitcoin(Bitcoin b);

	List<Bitcoin> findAll();

	List<Bitcoin> findByBitcoinName(String name);

	List<Bitcoin> findByBitcoinNameContains(String name);

	// List<Bitcoin> findByNomPrix(String nom, Double prix);

	List<Owners> findByOwners(Owners owner);

	List<Bitcoin> findByOwnersIdOwner(Long id);

	// List<Bitcoin> findByOrderByBitcoinNameAsc();

	List<Bitcoin> trierBitcoinNamePrice();
}