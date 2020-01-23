import java.util.*;

public class Lab13 {

		static double maxSalary () throws MaxStudentsException { //task1
		Company c = new Company();
		if (c.d1.workers.size() > 1 || c.d2.workers.size() > 1) {
			throw new MaxStudentsException ("You've reached maximum amount of students in one department!");
		}
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
		
		static void task2 () throws MaxStudentsException {
			Company c = new Company();
			if (c.d1.workers.size() > 5 || c.d2.workers.size() > 5) {
				throw new MaxStudentsException ("You've reached maximum amount of students in one department!");
			}
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
		
		static void task3 () throws MaxStudentsException {
			Company c = new Company();
			if (c.d1.workers.size() > 5 || c.d2.workers.size() > 5) {
				throw new MaxStudentsException ("You've reached maximum amount of students in one department!");
			}
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
		
		static void nullEx (Integer num) throws NullPointerException {
			num++;
		}
		
		static void divByZero () throws ArithmeticException {
			int i = 1/0;
		}
	
	public static void main(String[] args) {
		try {
		System.out.println("Max worker salary is - " + maxSalary());
		} catch (MaxStudentsException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println ("Finally block works properly");
		}
		try {
			task2();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			task3();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			nullEx(null);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			divByZero();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
