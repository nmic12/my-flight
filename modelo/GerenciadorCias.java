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

	public ArrayList<CiaAerea> get_cias() {
		return empresas;
	}

	public CiaAerea search_by_code(String codigo) {
		for (CiaAerea empresa : empresas) {
			if (empresa.getCodigo().equalsIgnoreCase(codigo)) {
				return empresa;
			}
		}
		return null;

	}

	public CiaAerea serach_by_name(String name) {
		for (CiaAerea empresa : empresas) {
			if (empresa.getNome().equalsIgnoreCase(name)) {
				return empresa;
			}
		}
		return null;
	}

}
