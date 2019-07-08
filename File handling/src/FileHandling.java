import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {

 
		File dr = new File("java\\studyeasy");
		dr.mkdirs();
		File file = new File("java\\studyeasy\\studyeasy.txt");
		file.createNewFile();
		System.out.println("File created");
		
		
		
		BufferedWriter bw= new BufferedWriter(new FileWriter(file));
		bw.write("anu\n");
		bw.write("karthu");
		bw.close();
		
				
		BufferedReader br = new BufferedReader(new FileReader("java\\studyeasy\\studyeasy.txt"));
		String line ;
		while((line = br.readLine())!= null) {
			System.out.println(line);
			
		}
		br.close();

	}

}
