package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    Scanner cin = new Scanner(System.in);

    public GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public void add_airport(String codigo, String nome, Geo loc) {
        aeroportos.add(new Aeroporto(codigo, nome, loc));
    }

    public ArrayList<Aeroporto> get_airports() {
        return aeroportos;
    }

    public Aeroporto search_by_code(String codigo, boolean eValido) {
        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getCodigo().equalsIgnoreCase(codigo)) {
                return aeroporto;
            }
        }
        return null;
    }
}
