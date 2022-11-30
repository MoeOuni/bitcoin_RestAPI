package com.ouni.bitcoin.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ouni.bitcoin.entities.Owners;
import com.ouni.bitcoin.service.OwnersService;

@RestController
@RequestMapping("/api/owners")
@CrossOrigin("*")
public class OwnersRESTController {

	
	@Autowired
	OwnersService ownerService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Owners>  getAllOwners() {
		System.out.println(ownerService.getAllOwners());
		return ownerService.getAllOwners();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public Owners createOwner(@RequestBody Owners owner) {
		return ownerService.saveOwner(owner);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteOwner(@PathVariable("id") Long id)
	{
		ownerService.deleteOwnerById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Owners updateOwners(@RequestBody Owners owner) {
		return ownerService.updateOwner(owner);
	}
}
