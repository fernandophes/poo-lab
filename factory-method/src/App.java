import utils.DetailedUtilsKit;
import utils.SimpleUtilsKit;

public class App {
    public static void main(String[] args) throws Exception {
        final var simpleKit = new SimpleUtilsKit();
        final var detailedKit = new DetailedUtilsKit();

        final var simple1 = simpleKit.createLogger("Simple Logger 1");
        final var detailed1 = detailedKit.createLogger("Detailed Logger 1");

        final var simple2 = simpleKit.createLogger(App.class);
        final var detailed2 = detailedKit.createLogger(App.class);

        System.out.println();

        simple1.info("Hello, World!");
        detailed1.info("Hello, World!");

        simple2.info("Hello, World!");
        detailed2.info("Hello, World!");
    }

}
