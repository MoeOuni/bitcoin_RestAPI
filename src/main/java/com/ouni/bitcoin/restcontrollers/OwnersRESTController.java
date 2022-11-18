package com.ouni.bitcoin.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ouni.bitcoin.entities.Owners;
import com.ouni.bitcoin.service.OwnersService;

@RestController
@RequestMapping("/api/owners")
@CrossOrigin
public class OwnersRESTController {

	
	@Autowired
	OwnersService ownerService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Owners>  getAllOwners() {
		return ownerService.getAllOwners();
	}
}
