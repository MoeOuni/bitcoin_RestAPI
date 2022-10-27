package com.ouni.bitcoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouni.bitcoin.entities.Bitcoin;
import com.ouni.bitcoin.entities.Owners;
import com.ouni.bitcoin.repos.BitcoinRepository;

@Service
public class BitcoinServiceImp implements BitcoinService {

	@Autowired
	BitcoinRepository bitRepository;

	@Override
	public List<Bitcoin> findAll() {
		return bitRepository.findAll();
	}

	@Override
	public Bitcoin saveBitcoin(Bitcoin b) {
		return bitRepository.save(b);
	}

	@Override
	public Bitcoin getBitcoinById(long id) {
		return bitRepository.findById(id).get();
	}

	@Override
	public void deleteBitcoinById(long id) {
		bitRepository.deleteById(id);
	}

	@Override
	public Bitcoin updateBitcoin(Bitcoin b) {
		return bitRepository.save(b);
	}

	@Override
	public List<Bitcoin> findByBitcoinName(String name) {
		return bitRepository.findByBitcoinName(name);
	}

	@Override
	public List<Bitcoin> findByBitcoinNameContains(String name) {
		return bitRepository.findByBitcoinNameContains(name);
	}

	/*@Override
	public List<Bitcoin> findByNomPrix(String nom, Double prix) {
		return bitRepository.findByNomPrix(nom, prix);
	} */

	@Override
	public List<Owners> findByOwners(Owners owner) {
		return bitRepository.findByOwners(owner);
	}

	@Override
	public List<Bitcoin> findByOwnersIdOwner(Long id) {
		return bitRepository.findByOwnersIdOwner(id);
	}

	// @Override
	// public List<Bitcoin> findByOrderByBitcoinNameAsc() {
	// return bitRepository.findByOrderByBitcoinNameAsc();
	// }

	@Override
	public List<Bitcoin> trierBitcoinNamePrice() {
		return bitRepository.trierBitcoinNamePrice();
	}

}
