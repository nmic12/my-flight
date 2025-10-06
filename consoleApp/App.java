package pucrs.myflight.consoleApp;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	// argument example: new File("C:\\Users\\Nicolas\\Desktop\\my-flight\\data\\airlines.dat")
	public static void printFileData(File file) {
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");


		printFileData(new File("C:\\Users\\Nicolas\\Desktop\\my-flight\\data\\routes.dat"));

		GerenciadorCias gCias = new GerenciadorCias();
		GerenciadorAeronaves gAer = new GerenciadorAeronaves();
		gAer.add_airplane("B777", "Boeing-777", 193);
		gAer.add_airplane("asfas", "afsfaf-777", 314);
		gAer.get_airplanes();
	}
}
