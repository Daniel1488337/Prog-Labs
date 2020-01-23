import java.util.*;

public class Company {
	String name = "Greatest Company";
	String owner = "Tallest Guy";
	ArrayList<Department> departments = new ArrayList<Department>();
	
	Department d1;
	Department d2;
	
	public Company () {
	Worker w1 = new Worker("John", "Bowl", 1500);
	Worker w2 = new Worker("James", "Bond", 2500);
	Worker w3 = new Worker("Bill", "Kill", 1000);
	Worker w4 = new Worker("Britney", "Johns", 3500);
	
	Department d1 = new Department("First", "Leo", 5000);
	d1.addWorkers(w1, w2);
	this.d1 = d1;
	
	Department d2 = new Department("Second", "Rafael", 3000);
	d2.addWorkers(w3, w4);
	this.d2 = d2;
	}
}
