package com.ouni.bitcoin.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.ouni.bitcoin.entities.Bitcoin;
import com.ouni.bitcoin.entities.Owners;

@RepositoryRestResource(path = "rest")
public interface BitcoinRepository extends JpaRepository<Bitcoin, Long> {

	List<Bitcoin> findByBitcoinName(String name);

	List<Bitcoin> findByBitcoinNameContains(String name);

	/*
	 * @Query("select b from Bitcoin b where b.BitcoinName like %:nom and b.BitcoinPrice > :prix"
	 * ) List<Bitcoin> findByNomPrix(@Param("N") String nom, @Param("prix") Double
	 * prix);
	 */

	@Query("select b from Bitcoin b where b.owners= ?1")
	List<Owners> findByOwners(Owners owner);

	List<Bitcoin> findByOwnersIdOwner(Long id);

	// List<Bitcoin> findByOrderByBitcoinNameAsc();

	@Query("select b from Bitcoin b order by b.bitcoinName ASC, b.bitcoinPrice DESC")
	List<Bitcoin> trierBitcoinNamePrice();
}
