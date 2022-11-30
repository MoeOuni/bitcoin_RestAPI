package com.ouni.bitcoin.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ouni.bitcoin.entities.Bitcoin;
import com.ouni.bitcoin.entities.Owners;
import com.ouni.bitcoin.service.BitcoinService;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BitcoinRESTController {
	
	@Autowired
	BitcoinService bitcoinService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Bitcoin> getAllBitcoins() {
		return bitcoinService.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Bitcoin getProduitById(@PathVariable("id") Long id) {
		return bitcoinService.getBitcoinById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Bitcoin createProduit(@RequestBody Bitcoin bitcoin) {
			return bitcoinService.saveBitcoin(bitcoin);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Bitcoin updateProduit(@RequestBody Bitcoin bitcoin) {
		return bitcoinService.updateBitcoin(bitcoin);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		bitcoinService.deleteBitcoinById(id);
	}
	
	@RequestMapping(value="/owner/{idOwner}",method = RequestMethod.GET)
	public List<Bitcoin> getProduitsByCatId(@PathVariable("idOwner") Long idOwner) {
		return bitcoinService.findByOwnersIdOwner(idOwner);
	}
	
}
