package dk.jakobgaard.ETO;

public class NoAvailableDateException extends InvalidBookingException {
    public NoAvailableDateException(String message) {
        super(message);
    }
}
