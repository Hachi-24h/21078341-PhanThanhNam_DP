package Singleton_Factory;

public class SMSNotification implements Notification {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}