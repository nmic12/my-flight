package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		GerenciadorCias gCias = new GerenciadorCias();
		GerenciadorAeronaves gAer = new GerenciadorAeronaves();
		gAer.add_airplane("B777", "Boeing-777", 193);
		gAer.add_airplane("asfas", "afsfaf-777", 314);
		gAer.get_airplanes();
	}
}
