import java.io.FileWriter;
import java.io.IOException;

public class UserFileManager {

    public void saveToFile(final User user) {
        try (var writer = new FileWriter(user.getName() + ".txt")) {
            writer
                    .append("Name: " + user.getName() + "\n")
                    .append("Email: " + user.getEmail());

            System.out.println("Arquivo salvo");
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

}
