package entityforDecoratorPatterns;

public class CarDecorator implements Car {
	protected Car car; 
	public CarDecorator(Car c){ 
	this.car=c; 
	} 
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		this.car.assemble();
	}

}
