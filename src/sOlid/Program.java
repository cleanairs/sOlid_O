package sOlid;

import java.lang.reflect.Array;

public class Program {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(3);
		
		Rectangle r1 = new Rectangle(10, 11);
		Rectangle r2 = new Rectangle(4, 4);
		Rectangle r3 = new Rectangle(10, 11);
		
		Shape[] objects = new Shape[] {c1, r1, r2, r3};
		
		System.out.println(AreaCalculator.calculateArea(objects));

	}

}
