package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import com.apple.laf.resources.aqua;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
    Scanner cin = new Scanner(System.in);

    public GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }

    public void add_airplane(String codigo, String descricao, int capacidade) {
        aeronaves.add(new Aeronave(codigo, descricao, capacidade));
    }

    public void get_airplanes() {
        for (Aeronave aeronave : aeronaves) {
            System.out.println(aeronave.getCodigo());
            System.out.println(aeronave.getDescricao());
            System.out.println(aeronave.getCapacidade());
        }
    }

    public void search_by_code() {
        System.out.println("Insira o código: ");
        String codigo = cin.nextLine();
        for (Aeronave aeronave : aeronaves) {
            if (aeronave.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Aeronave encontrada: " + aeronave.getDescricao());
            } else {
                System.out.println("Erro, nenhuma aeronave encontrada");
            }
        }
    }
}
