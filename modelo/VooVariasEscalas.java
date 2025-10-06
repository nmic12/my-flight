import java.util.ArrayList;
import java.util.List;

import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.Rota;

public class VooVariasEscalas extends Voo {

    List Rotas = new ArrayList<Rota>();
    Geo geo = new Geo();
    public VooVariasEscalas(Rota rotas) {
        super(datahora, status);
        this.Rotas = rotas;

    }

    public void addEscala(Rota rota) {
        Rotas.add(rota);
    }

    public void remUltimaEscala() {
        Rotas.removeLast();
    }

    public double duracaoTotal() {
        return geo.get_distance(rota[0].getOrigem().getLocal(), rota[Rotas.size()].getDestino().getLocal()) / 805;
    }
}
