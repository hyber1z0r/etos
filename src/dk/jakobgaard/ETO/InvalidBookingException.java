package dk.jakobgaard.ETO;

public abstract class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}
