package com.ouni.bitcoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouni.bitcoin.entities.Owners;
import com.ouni.bitcoin.repos.OwnersRepository;

@Service
public class OwnersServiceImp implements OwnersService {

	@Autowired
	OwnersRepository ownerRepos;

	@Override
	public Owners saveOwner(Owners o) {
		return ownerRepos.save(o);
	}

	@Override
	public Owners updateOwner(Owners o) {
		return ownerRepos.save(o);
	}

	@Override
	public void deleteOwner(Owners o) {
		ownerRepos.delete(o);
	}

	@Override
	public void deleteOwnerById(Long id) {
		ownerRepos.deleteById(id);
	}

	@Override
	public Owners getOwnerById(Long id) {
		return ownerRepos.findById(id).get();
	}

	@Override
	public List<Owners> getAllOwners() {
		return ownerRepos.findAll();
	}

	@Override
	public List<Owners> findByBitcoin(String bitcoin) {
		// TODO Auto-generated method stub
		return ownerRepos.findByBitcoin(bitcoin);
	}
}
