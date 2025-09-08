package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		GerenciadorCias gCias = new GerenciadorCias();
		gCias.addCia("8J2", "JOAOAIRLINES");
		gCias.get_cias();
		gCias.search_by_code();
		gCias.serach_by_name();
	}
}
