package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;
    Scanner cin = new Scanner(System.in);

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void add_voo(Rota rota, LocalDateTime datahora, Duration duracao) {
        voos.add(new Voo(rota, datahora, duracao));
    }

    public ArrayList<Voo> get_voos() {
        return voos;
    }

    public Voo search_by_date(LocalDateTime datahora) {
        for (Voo voo : voos) {
            if (voo.getDatahora() == datahora) {
                return voo;
            }
        }
        return null;
    }
}
