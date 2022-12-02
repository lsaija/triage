package it.prova.triage.web.api.exception;

public class IdNullUpdateException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IdNullUpdateException(String message) {
		super(message);
	}

}
