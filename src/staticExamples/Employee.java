package staticExamples;

public class Employee {
	
	private String companyName;
	
	public Employee() {
		companyName = "Spacely Sprockets";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println(e1.companyName);
		System.out.println(e2.companyName);


	}
}

