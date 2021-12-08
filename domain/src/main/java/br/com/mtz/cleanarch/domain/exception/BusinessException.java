package br.com.mtz.cleanarch.domain.exception;

@SuppressWarnings("serial")
public class BusinessException extends RuntimeException {

    private String message;

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
