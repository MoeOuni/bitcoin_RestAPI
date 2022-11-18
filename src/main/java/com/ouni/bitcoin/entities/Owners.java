package com.ouni.bitcoin.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Owners {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOwner;

	private String nomOwner;

	private float coinsOwned;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")

	private Date purchaseDate;

	@ManyToOne
	private Bitcoin bitcoin;

	public Owners() {
		super();
	}

	public Owners(String nomOwner, long coinsOwned, Date purchaseDate) {
		super();
		this.nomOwner = nomOwner;
		this.purchaseDate = purchaseDate;
		this.coinsOwned = coinsOwned;
	}

	public float getCoinsOwned() {
		return coinsOwned;
	}

	public void setCoinsOwned(long coinsOwned) {
		this.coinsOwned = coinsOwned;
	}

	public Bitcoin getBitcoin() {
		return bitcoin;
	}

	public void setBitcoin(Bitcoin bitcoin) {
		this.bitcoin = bitcoin;
	}

	public long getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(long idOwner) {
		this.idOwner = idOwner;
	}

	public String getNomOwner() {
		return nomOwner;
	}

	public void setNomOwner(String nomOwner) {
		this.nomOwner = nomOwner;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Owners [idOwner=" + idOwner + ", nomOwner=" + nomOwner + ", purchaseDate=" + purchaseDate + "]";
	}
}