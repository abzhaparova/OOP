package task1;

public class Resistor extends Circuit {
	private double V; 
	private double R; 
	
	public Resistor(double R) {
		this.R = R;
	}
	
	public double getResistance() {
		return this.R;	 
	}
	 
	public double getPotentialDiff() {
	    return this.V;	 
	 }
	 
	public void applyPotentialDiff(double V) {
	    this.V=V;
	 }
	 
}
