package br.com.studies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.studies.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	
	Cambio findByFromAndTo(String from, String 	to);

}
