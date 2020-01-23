
public class Employee {
	 private String name;
	 private String department;
	 private int age;
	 
	 public Employee (String name) {
	 this.name = name;
	 }
	 
	 public Employee (String name, String department) {
		 this.name = name;
		 this.department = department;
	 }
	 
	 public String getName () {
		 return this.name;
	 }
	 
	 public void setEmployeeParameters (String name, String department, int age) {
		 this.name = name;
		 this.department = department;
		 this.age = age;
	 }
	 
	 public String EmployeeParameters () {
		 return "Name: " + name + " is worker of " + department + ", is " + age + " y.o.";
	 }
	 
	 public String toString () {
	 return "Name: " + name;
	 }
	 
	 public void compareWorkersName (String name1, String name2) {
		 if (name1.equals(name2)) {
			 System.out.println(name1 + " and " + name2 + " are equal worker names.");
		 }
		 else if (!name1.equals(name2)) {
			 System.out.println(name1 + " and " + name2 + " aren't equal worker names.");
		 }
	 }

}