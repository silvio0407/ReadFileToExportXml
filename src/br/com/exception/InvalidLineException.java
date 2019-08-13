package br.com.exception;

public class InvalidLineException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidLineException(String message) {
    	super(message);
    }

}
