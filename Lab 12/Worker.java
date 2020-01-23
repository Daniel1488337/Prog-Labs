
public class Worker {
	public String name;
	public String surname;
	public double salary;
	
	public Worker (String name, String surname, double salary) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	public double getSalary () {
		return salary;
	}
}
