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

    public ArrayList<Aeronave> get_airplanes() {
        return aeronaves;
    }

    public Aeronave search_by_code(String codigo) {
        for (Aeronave aeronave : aeronaves) {
            if (aeronave.getCodigo().equalsIgnoreCase(codigo)) {
                return aeronave;
            }
        }
        return null;
    }
}
