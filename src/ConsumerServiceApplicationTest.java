import org.junit.*;

public class ConsumerServiceApplicationTest {
    private MessageServiceInjector injector;

    @Before
    public void setUp() {

        /*
         * Mock the injector with an anonymous class
         */
        injector = new MessageServiceInjector() {

            @Override
            public Consumer getConsumer() {
                return new ConsumerServiceImplementation(new MessageService() {

                    @Override
                    public void sendMessage(String message, String recepient) {
                        System.out.println("Mock Message Service Implementation");

                    }

                });
            }

        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Barno!", "admin@host.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}
