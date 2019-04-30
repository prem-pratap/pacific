package assignment2;

public class EmployeeDemo {

	public class Employee {
		String name;
		double salary;

		Employee() {
			System.out.println("default");
		}

		Employee(String name, double salary) {
			this.name = name;
			this.salary = salary;
			System.out.println("parameterized");
		}

		void printEmpDetails() {
			System.out.println("Employee: " + name);
			System.out.println("Salary  : " + salary);
		}

		/*
		 * public void main(String[] args) { Employee e = new
		 * Employee("Harry Smith", 10000); e.printEmpDetails(); }
		 */
	}

	public static void main(String[] args) {
		EmployeeDemo ed = new EmployeeDemo();
		Employee e = ed.new Employee("Harry Smith", 10000);
		e.printEmpDetails();
	}

}
