package problem2;

public class Sphere extends dShapes{

		public double radius;
		public double height;

		public Sphere(double radius, double height){
				this.radius = radius;
				this.height = height;
		}

		public double Volume(){
			return (4.0/3.0) * Math.PI  * this.radius * this.radius * this.radius ;
		}
		public double SurfaceArea(){
			return 4.0 * Math.PI  * this.radius * this.radius;
		}
		
		
	}

