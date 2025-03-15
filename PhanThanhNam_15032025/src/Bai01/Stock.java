package Bai01;

import java.util.ArrayList;
import java.util.List;

//Subject
public class Stock {

	private List<Investor> observers = new ArrayList<>();
 private double price;

 public void addObserver(Investor investor) {
     observers.add(investor);
 }

 public void removeObserver(Investor investor) {
     observers.remove(investor);
 }

 public void setPrice(double price) {
     this.price = price;
     notifyObservers();
 }

 private void notifyObservers() {
     for (Investor investor : observers) {
         investor.update(price);
     }
 }
}