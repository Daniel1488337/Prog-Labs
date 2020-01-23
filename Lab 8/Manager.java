
public class Manager extends Employee {
	 String department;
	 
	 public Manager (String name, String departament) {
	 super(name);
	 this.department = departament;
	 }
	 
	 @Override
	 public String toString () {
	 return super.toString() + " is manager of " +
	department;
	 }

}
