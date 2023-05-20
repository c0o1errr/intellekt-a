package APM;

public class ReadException extends RuntimeException {
    public ReadException(String message, Exception e) {
        super(message);
    }
}
