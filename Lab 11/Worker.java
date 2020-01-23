
public class Worker implements Comparable<Worker> {
	public String name;
	public String surname;
	private double salary;
	
	public Worker (String name, String surname, double salary) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	public double getSalary () {
		return salary;
	}
	
	@Override
	public int compareTo(Worker w)
    {
        if (this.salary == w.salary) {
            return 0;
        } else if (this.salary < w.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}
