package it.prova.triage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.prova.triage.model.Paziente;

public interface PazienteRepository extends CrudRepository<Paziente, Long> {

	List<Paziente> findByCodiceFiscale(String codiceFiscaleInput);

	@Query("select p from Paziente p where p.codiceDottore=?1")
	List<Paziente> findPazienteByCodiceDottore(String codiceDottoreInput);

}
