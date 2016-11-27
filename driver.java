import shapes.*;
import utils.Math;

public class Driver {

	public static void main(String[] args) {
		Square sqr = new Square(100);
		System.out.println("the area of your square is " + sqr.getArea());

		Rectangle rct = new Rectangle(50, 80);
		System.out.println("the area of your rectangle is " + rct.getArea());
		double number = 15.6;
		System.out.println(Math.factorial((int) number));
		System.out.println(Math.factorialLooped((int) number));
	}
}
