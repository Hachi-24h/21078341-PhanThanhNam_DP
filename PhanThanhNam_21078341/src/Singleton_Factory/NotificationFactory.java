package Singleton_Factory;



//Factory để tạo Notification
public class NotificationFactory {
 public static Notification createNotification(String type) {
     switch (type.toLowerCase()) {
         case "email":
             return new EmailNotification();
         case "sms":
             return new SMSNotification();
         default:
             throw new IllegalArgumentException("❌ Unknown notification type: " + type);
     }
 }
}
