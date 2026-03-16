package JavaWeb.day02;

public class ClientThread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            ClientRunnable cr=new ClientRunnable(i+1);
            new Thread(cr).start();
        }
    }
}
