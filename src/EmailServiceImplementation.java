/*
 * Email class that inmplements the Message service interface
 */
public class EmailServiceImplementation implements MessageService {

    @Override
    public void sendMessage(String message, String recepient) {
        System.out.println("Email sent to " + recepient + " with message " + message);
    }

}
