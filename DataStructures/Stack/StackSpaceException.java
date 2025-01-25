package DataStructures.Stack;

public class StackSpaceException extends RuntimeException {
    public StackSpaceException() {
        super();
    }

    public StackSpaceException(String message) {
        super(message);
    }

    public StackSpaceException(Throwable cause) {
        super(cause);
    }
}
