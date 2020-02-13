package task1;

public class Series extends Circuit {
	private Circuit r1;
	private Circuit r2;
	
	public Series(Circuit r1, Circuit r2) {
		this.r1=r1;
		this.r2=r2;
	}
	
	 public double getResistance() {
		 return this.r1.getResistance() + this.r2.getResistance();
	 }
	 
	 public double getPotentialDiff() {
		return this.r1.getPotentialDiff() + this.r2.getPotentialDiff();
	 }
	 
	 public void applyPotentialDiff(double V) {
		 this.r1.applyPotentialDiff(r1.getCurrent()*r1.getResistance());
		 this.r2.applyPotentialDiff(r2.getCurrent()*r2.getResistance());
	 }
}
