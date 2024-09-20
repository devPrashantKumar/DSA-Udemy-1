package Queue;

public class QueueSpaceException extends RuntimeException{
    public QueueSpaceException(){
        super();
    }

    public QueueSpaceException(String message){
        super(message);
    }

    public QueueSpaceException(Throwable cause){
        super(cause);
    }
}
