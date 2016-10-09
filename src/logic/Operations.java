package logic;

public class Operations {
	private int resisor;
	private int capacitor;
	
	public double time(double resistor,double capacitor){
		return (double)1.1 * (double)resistor * (double)capacitor;
	}
	
	public double frecuency(double time){
		return (double)1 /(double)(time);
	}
	
}
