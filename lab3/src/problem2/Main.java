package problem2;

public class Main {

	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(3, 5);
		Sphere sphere = new Sphere(4, 5);
		Cube cube = new Cube(5);

		System.out.println(cylinder.Volume());
		System.out.println(cylinder.SurfaceArea());
		System.out.println(cylinder.TopArea());

		
		System.out.println("----------------------");


		System.out.println(sphere.Volume());
		System.out.println(sphere.SurfaceArea());

		System.out.println("----------------------");


		System.out.println(cube.Volume());
		System.out.println(cube.SurfaceArea());
		System.out.println(cube.TopArea());

	}
}