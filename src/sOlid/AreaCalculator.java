package sOlid;

public class AreaCalculator {

	public static double calculateArea(Shape[] shapes) {
		double area = 0;
		for (Shape shape : shapes) {
			area += shape.area();
		}
		return area;
	}
}
