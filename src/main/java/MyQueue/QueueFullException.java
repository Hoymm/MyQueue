package MyQueue;

public class QueueFullException extends RuntimeException {
    public QueueFullException() {
    }

    public QueueFullException(String message) {
        super(message);
    }

    public QueueFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueFullException(Throwable cause) {
        super(cause);
    }

    public QueueFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
