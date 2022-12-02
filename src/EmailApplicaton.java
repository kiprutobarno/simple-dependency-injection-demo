public class EmailApplicaton {
    private EmailService email = new EmailService();

    public void processMessage(String message, String receiver) {
        this.email.sendEmail(message, receiver);
    }
}
