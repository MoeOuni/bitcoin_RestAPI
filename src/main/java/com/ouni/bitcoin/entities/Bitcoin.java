package com.ouni.bitcoin.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bitcoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBitcoin;
	private String bitcoinName;
	private Double bitcoinPrice;
	
	@JsonIgnore
	@OneToMany(mappedBy = "bitcoin")
	private List<Owners> owners;

	
	
	
}