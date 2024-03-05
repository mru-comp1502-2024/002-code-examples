package staticExamples;

public class StaticMethods {
	
	double radius = 2.0;

	public static void main(String[] args) {
		double area = circleArea(); // can't. circleArea is not static
	}
	
	public double circleArea() {
		return Math.PI * radius * radius;
	}
}
