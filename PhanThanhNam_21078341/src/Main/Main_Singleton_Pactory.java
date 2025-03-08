package Main;

import Singleton_Factory.NotificationFactory;
import Singleton_Factory.NotificationManager;

public class Main_Singleton_Pactory {
	 public static void main(String[] args) {
		 
	        // Lấy instance Singleton của NotificationManager
	        NotificationManager manager = NotificationManager.getInstance();

	        // Tạo Email Notification
	        System.out.println("\n--- Sending Email Notification ---");
	        manager.setNotification(new NotificationFactory(), "email");
	        manager.send("Your order has been shipped!");

	        // Tạo SMS Notification
	        System.out.println("\n--- Sending SMS Notification ---");
	        manager.setNotification(new NotificationFactory(), "sms");
	        manager.send("Your OTP is 123456.");
	    }
}
