package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	Scanner cin = new Scanner(System.in);

	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void addCia(String codigo, String nome) {
		empresas.add(new CiaAerea(codigo, nome));
	}

	public void get_cias() {
		for (CiaAerea empresa : empresas) {
			System.out.println(empresa.getNome());
			System.out.println(empresa.getCodigo());
		}
	}

	public void search_by_code() {
		System.out.println("Insira o código: ");
		String codigo = cin.nextLine();
		for (CiaAerea empresa : empresas) {
			if (empresa.getCodigo().equalsIgnoreCase(codigo)) {
				System.out.println("Empresa Encontrada: " + empresa.getNome());
			} else {
				System.out.println("Erro, nenhuma empresa foi encontrada.");
			}
		}

	}

	public void serach_by_name() {
		System.out.println("Insira o nome: ");
		String nome = cin.nextLine();
		for (CiaAerea empresa : empresas) {
			if (empresa.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Empresa Encontrada: " + empresa.getCodigo());
			} else {
				System.out.println("Erro, nenhuma empresa foi encontrada.");
			}
		}
	}

}
