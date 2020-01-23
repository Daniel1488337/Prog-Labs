import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker> {
	@Override
	public int compare(Worker w1, Worker w2) {
        if (w1.getSalary() == w2.getSalary()) {
            return 0;
        }
        if (w1.getSalary() < w2.getSalary()) {
            return 1;
        }
        else {
            return -1;
        }
    }
	
}
