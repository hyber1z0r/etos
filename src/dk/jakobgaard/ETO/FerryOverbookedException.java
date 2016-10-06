package dk.jakobgaard.ETO;

public class FerryOverbookedException extends InvalidBookingException {
    public FerryOverbookedException(String message) {
        super(message);
    }
}
