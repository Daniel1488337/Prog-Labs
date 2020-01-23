
public class Lab8 {
	
	public static void main(String[] args) {
		Employee employee = new Employee("Andrew", "DevOps");
		Manager manager = new Manager("John", "Social Engineering");
		System.out.println(manager.toString());
		employee.compareWorkersName(employee.getName(), manager.getName());
		employee.setEmployeeParameters("Andrew", "DevOps", 25);
		System.out.println(employee.EmployeeParameters());
	}

}
