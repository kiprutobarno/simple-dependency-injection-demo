public class ConsumerServiceImplementation implements Consumer {
    private MessageService service;

    public ConsumerServiceImplementation(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String message, String recepient) {

        this.service.sendMessage(message, recepient);

    }

}
