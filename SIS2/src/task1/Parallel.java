package task1;
 
public class Parallel extends Circuit {
	private Circuit r1;
	private Circuit r2;
	
	public Parallel(Circuit r1, Circuit r2) {
		this.r1=r1;
		this.r2=r2;
			}
	
	 public double getResistance() {
		 return (this.r1.getResistance() * this.r2.getResistance())/(this.r1.getResistance() + this.r2.getResistance());
	 }
	 
	 public double getPotentialDiff() {
		 return this.r1.getPotentialDiff();
	 }
	 
	 public void applyPotentialDiff(double V) {
		 this.r1.applyPotentialDiff(V);
		 this.r2.applyPotentialDiff(V);
	 }
}