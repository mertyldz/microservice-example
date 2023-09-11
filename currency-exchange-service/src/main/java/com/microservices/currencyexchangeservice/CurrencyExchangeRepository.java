package com.microservices.currencyexchangeservice;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	
	Optional<CurrencyExchange> findByFromAndTo(String from, String to);

}
