public class App {
    public static void main(String[] args) throws Exception {
        String message="Hello Maxwel";
        String email="admin@host.com";
        String telephone="0722000000";
        MessageServiceInjector injector=null;
        Consumer app=null;


        /*
         * Send Email
         */
        injector=new EmailServiceInjector();
        app=injector.getConsumer();
        app.processMessages(message, email);


        /*
         * Send SMS
         */
        injector=new SMSServiceInjector();
        app=injector.getConsumer();
        app.processMessages(message, telephone);

    }
}
