public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando...");

        final var user = new User("Fernando", "fernandophes@gmail.com");
        final var fileManager = new UserFileManager();

        fileManager.saveToFile(user);
    }
}
