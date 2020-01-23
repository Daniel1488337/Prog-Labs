import java.io.*;

public class Lab14n1 {

	static String lastShortestString(String filename) throws IOException {
		File file = new File(filename);
		FileReader reader = new FileReader(file);
		BufferedReader read = new BufferedReader(reader);
        String shortestString = read.readLine();
        String currentString = null;
        while ((currentString = read.readLine()) != null) {
            if (shortestString.length() > currentString.length() || currentString.length() == shortestString.length()){
                shortestString = currentString;
            }
        }
        read.close();
        return shortestString;
	}
	
	public static void main(String[] args) throws IOException {
        System.out.println(lastShortestString("E:\\1.txt"));
	}

}
