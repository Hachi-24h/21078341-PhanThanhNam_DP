package main;

import java.util.Observer;

import entityforCompositePatterns.Circle;
import entityforCompositePatterns.Drawing;
import entityforCompositePatterns.Shape;
import entityforCompositePatterns.Triangle;
import entityforDecoratorPatterns.BasicCar;
import entityforDecoratorPatterns.Car;
import entityforDecoratorPatterns.LuxuryCar;
import entityforDecoratorPatterns.SportsCar;
import entityforObserverPatterns.MyTopic;
import entityforObserverPatterns.MyTopicSubscriber;
import patterns.EagerInitializedSingleton;

public class Main {
	public static void main(String[] args) {
		// Singleton
		
//		EagerInitializedSingleton instance01 = EagerInitializedSingleton.getInstance();
//		EagerInitializedSingleton instance02= EagerInitializedSingleton.getInstance();
//		System.out.println(instance01.hashCode());
//		System.out.println(instance02.hashCode());
		
		
		// Decorator Pattern
		
//		Car sportsCar = new SportsCar(new BasicCar()); 
//		sportsCar.assemble(); 
//		System.out.println("\n*****"); 
//		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new 
//		BasicCar())); 
//		sportsLuxuryCar.assemble(); 
		
		
		// composite 
//		
//		Shape tri = new Triangle(); 
//		Shape tri1 = new Triangle(); 
//		Shape cir = new Circle(); 
//		Drawing drawing = new Drawing(); 
//		drawing.add(tri1); 
//		drawing.add(tri1); 
//		drawing.add(cir); 
//		drawing.draw("Red"); 
//		drawing.clear(); 
//		drawing.add(tri); 
//		drawing.add(cir); 
//		drawing.draw("Green"); 

		
		
		
	}
	
}