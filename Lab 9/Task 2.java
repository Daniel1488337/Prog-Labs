
public class Lab9n2 {

	static int numsInStringCount (String s) {
		String[] results = s.split(" [0-9] ");
		return results.length;
	}
	
	public static void main(String[] args) {
		String s = "My name is John, I'm 303434 years old. 5 years ago I was in London. koala321";
		System.out.println(numsInStringCount(s));
	}

}
