import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReadWriting {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("/Users/admin/Desktop/test.txt");
//		file.createNewFile();
//		
//		FileWriter fw = new FileWriter("/Users/admin/Desktop/test.txt");
//		BufferedWriter write = new BufferedWriter(fw);
//		
//		write.write("Please write inside this file");
//		write.newLine();
//		write.write("This is my second line");
//		write.flush();
		
		FileReader fr = new FileReader("/Users/admin/Desktop/test.txt");
		BufferedReader freader = new BufferedReader(fr);
		
		String i = "";
		
		while((i = freader.readLine()) != null) {
			
			System.out.println(freader.readLine());
			
		}

	}

}
