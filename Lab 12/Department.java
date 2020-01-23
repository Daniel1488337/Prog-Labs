import java.util.*;

public class Department {
	String name;
	String director;
	double directorSalary;
	HashSet<Worker> workers = new HashSet<Worker>();
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
	HashSet<Double> salary = new HashSet<Double>();
}
