/*
 * SMS class that inmplements the Message service interface
 */
public class SMSServiceImplementation implements MessageService {

    @Override
    public void sendMessage(String message, String recepient) {
        System.out.println("SMS sent to " + recepient + " with message " + message);

    }

}
