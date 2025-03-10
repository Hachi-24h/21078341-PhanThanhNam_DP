package entityforObserverPatterns;

import java.util.ArrayList;
import java.util.List;

public class MyTopic   implements Subject {
	private List<Observer> observers; 
	private String message; 
	private boolean changed; 
	private final Object MUTEX= new Object(); 
	public MyTopic(){ 
	this.observers=new ArrayList<>(); 
	}
	@Override
	public void register(java.util.Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer"); 
				synchronized (MUTEX) { 
				if(!observers.contains(obj)) observers.add((Observer) obj); 
				} 
		
	}
	@Override
	public void unregister(java.util.Observer obj) {
		synchronized (MUTEX) { 
			observers.remove(obj); 
		} 
		
	}
	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null; 
		//synchronization is used to make sure any observer registered 
	
		synchronized (MUTEX) { 
		if (!changed) 
		return; 
		observersLocal = new ArrayList<>(this.observers); 
		this.changed=false; 
		} 
	
		for (Observer obj : observersLocal) { 
		obj.update(); 
		} 
		
	}
	@Override
	public Object getUpdate(java.util.Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	} 
	public void postMessage(String msg){ 
		System.out.println("Message Posted to Topic:"+msg); 
		this.message=msg; 
		this.changed=true; 
		notifyObservers(); 
		} 
}
