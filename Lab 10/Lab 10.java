import java.util.*;

public class Lab10 {

		static double maxSalary () { //task1
		Company c = new Company();
		Iterator<Worker> iter = c.d1.workers.iterator();
		while (iter.hasNext()) {
			c.d1.salary.add(iter.next().getSalary());
		}
		double max = 0;
		Iterator n = c.d1.salary.iterator();
		while (n.hasNext()) {
			double current = (double) n.next();
			if (max < current) {
				max = current;
			}
		}
		return max;
	}
		
		static void task2 () {
			Company c = new Company();
			for (Worker w : c.d1.workers) {
				if (w.getSalary() > c.d1.directorSalary) {
					System.out.println("In " + c.d1.name + " department worker " + w.name + " " + w.surname + " has salary bigger than department's director.");
				}
			}
			
			for (Worker w : c.d2.workers) {
				if (w.getSalary() > c.d2.directorSalary) {
					System.out.println("In " + c.d2.name + " department worker " + w.name + " " + w.surname + " has salary bigger than department's director.");
				}
			}
		}
		
		static void task3 () {
			Company c = new Company();
			System.out.println("Director - " + c.owner + "\n" + c.d1.name + " department director is " + c.d1.director + "\n" + c.d2.name + " department director is " + c.d2.director + "\nWorkers:");
			Iterator<Worker> workers = c.d1.workers.iterator();
			while (workers.hasNext()) {
				Worker w = workers.next();
				System.out.println(w.name + " " + w.surname);
			}
			Iterator<Worker> workers2 = c.d2.workers.iterator();
			while (workers2.hasNext()) {
				Worker w = workers2.next();
				System.out.println(w.name + " " + w.surname);
			}
		}
	
	public static void main(String[] args) {
		System.out.println("Max worker salary is - " + maxSalary());
		task2();
		task3();
	}

}
