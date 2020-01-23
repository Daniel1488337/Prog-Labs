
public class Lab9n1 {

	
	
	static String intToBinaryString (int i) {
		String result = "";
		if (i < 0) {
			throw new IllegalArgumentException("i is less than zero");
		}
		do {
			if (i%2 == 0) {
				result += "0";
				i /= 2;
			}
			else if (i%2 == 1) {
				result += "1";
				i /= 2;
			}
		} while (i >= 1);
		return new StringBuffer(result).reverse().toString();
	}
	
	public static void main(String[] args) {
		try {
		System.out.println(intToBinaryString(21));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
