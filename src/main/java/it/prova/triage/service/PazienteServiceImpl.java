package it.prova.triage.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.prova.triage.model.Paziente;
import it.prova.triage.repository.PazienteRepository;

@Service
@Transactional
public class PazienteServiceImpl implements PazienteService {

	@Autowired
	private PazienteRepository repository;

	@Override
	public List<Paziente> listAllElements() {
		return (List<Paziente>) repository.findAll();
	}

	@Override
	public Paziente caricaSingoloElemento(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Paziente aggiorna(Paziente pazienteInstance) {
		return repository.save(pazienteInstance);
	}

	@Override
	public Paziente inserisciNuovo(Paziente pazienteInstance) {
		pazienteInstance.setDataRegistrazione(LocalDateTime.now());
		return repository.save(pazienteInstance);
	}

	@Override
	public void rimuovi(Long idToRemove) {
		repository.deleteById(idToRemove);
	}

	@Override
	public Paziente findByCodiceFiscale(String codiceFiscaleInstance) {
		return repository.findByCodiceFiscale(codiceFiscaleInstance);
	}

	@Override
	public Paziente findByCodiceDottore(String codiceDottoreInstance) {
		return repository.findPazienteByCodiceDottore(codiceDottoreInstance);

	}

}
