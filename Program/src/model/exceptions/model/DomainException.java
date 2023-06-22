package model.exceptions.model;

public class DomainException extends Throwable {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
