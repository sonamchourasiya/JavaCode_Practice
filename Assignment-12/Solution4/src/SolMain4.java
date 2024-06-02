import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SolMain4 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("file.txt")) {

			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
