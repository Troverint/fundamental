package stack;

public class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super("List " + message + " kosong!");
    }
}