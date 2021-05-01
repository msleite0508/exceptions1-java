package model.exception;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	//permitir que eu possa insta minha excessao personalizada passando uma msg para ela
	public DomainException(String msg) {
		super(msg);
	}
}
