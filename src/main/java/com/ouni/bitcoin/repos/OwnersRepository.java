package com.ouni.bitcoin.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.ouni.bitcoin.entities.Owners;


public interface OwnersRepository extends JpaRepository<Owners, Long> {

	
	@Query("select o from Owners o, Bitcoin b where o.bitcoin.idBitcoin = b.idBitcoin and b.bitcoinName like %:nomBitcoin%")
	List<Owners> findByBitcoin(@Param("nomBitcoin") String bitcoin);
}
