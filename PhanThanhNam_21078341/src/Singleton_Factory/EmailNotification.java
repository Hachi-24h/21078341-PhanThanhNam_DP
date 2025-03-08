package Singleton_Factory;

public class EmailNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}