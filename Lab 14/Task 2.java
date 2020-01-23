import java.io.*;

public class Lab14n2 {

	static void cypher(String filename, String destination, byte key) throws IOException {
		File file = new File(filename);
		FileInputStream input = new FileInputStream(file);
		byte[] arr = input.readAllBytes();
		for (int i = 0; i < arr.length; i++) 
	    { 
			if (arr[i] != 10) {
	        arr[i] = (byte)(arr[i] ^ key); 
			}
	    }
		input.close();
		FileOutputStream output = new FileOutputStream(destination);
		output.write(arr);
		output.close();
}
	
	public static void main(String[] args) throws IOException {
		cypher("E:\\1.txt", "E:\\2.txt", (byte)5);
		System.out.println("Success");
	}

}
