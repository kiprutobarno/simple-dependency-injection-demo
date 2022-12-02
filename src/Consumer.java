/*
 * Consumer interface declaring contract for consumer classes
 */
public interface Consumer {
    void processMessages(String message, String recepient);
}
