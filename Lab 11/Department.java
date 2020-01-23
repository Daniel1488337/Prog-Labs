import java.util.*;

public class Department{
	String name;
	String director;
	double directorSalary;
	TreeSet<Worker> workers = new TreeSet<Worker>();
	Worker w = new Worker("Director", director, directorSalary);
	public Department() {
		
	}
	
	public Department (String name, String director, double directorSalary) {
		this.name = name;
		this.director = director;
		this.directorSalary = directorSalary;
		}
	
	public void addWorkers (Worker w1, Worker w2) {
		workers.add(w1);
		workers.add(w2);
	}
	TreeSet<Double> salary = new TreeSet<Double>();
}
