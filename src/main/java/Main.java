/** Votre premier programme Java */
class Main {
    public static void main (String[] args) {
        Client client = new Client();
        client.run();

        String helloWorld ;

        Server server = new Server();
        server.run();

        helloWorld=server.getValue();
    }
}