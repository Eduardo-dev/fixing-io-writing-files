package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		// FileWriter e BufferedWriter
		String [] lines = new String[] {"Olá Mundo!", "Você será", "um ótimo programador!"}; 
		
		String path = "C:\\Users\\PC\\Desktop\\Primeiro-Arquivo.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e){
			System.out.println("Output error!");
		}
	}
}
