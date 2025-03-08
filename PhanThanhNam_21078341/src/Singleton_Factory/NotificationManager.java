package Singleton_Factory;

// Singleton Class để quản lý gửi thông báo
public class NotificationManager {
    private static NotificationManager instance;
    private Notification notification;

    private NotificationManager() { } // Private Constructor

    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void setNotification(NotificationFactory factory, String type) {
        this.notification = factory.createNotification(type);
    }

    public void send(String message) {
        if (notification != null) {
            notification.sendMessage(message);
        } else {
            System.out.println("⚠ No notification type set!");
        }
    }
}
