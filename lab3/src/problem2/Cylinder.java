package problem2;

public class Cylinder extends dShapes{
		public double radius;
		public double height;

public Cylinder(double radius, double height){	
		this.radius = radius;
		this.height = height;
		}
		
public double Volume(){
		return 2.0 * Math.PI  * radius * radius * height;
		}

public double SurfaceArea(){
		return 2.0 * Math.PI * radius * radius;
		}

public double TopArea(){
			return Math.PI  * radius * radius;
		}


		
		
	}
