package fr.annette.rescuer.exception;

public class RescuerNotFoundException extends RuntimeException {
    public RescuerNotFoundException(String message) {
        super(message);
    }
}