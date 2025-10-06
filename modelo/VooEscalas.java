import java.time.LocalDate;
import java.time.LocalDateTime;

import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

public class VooEscalas extends Voo {

    public VooEscalas(Rota r1, Rota r2, LocalDateTime datahora, int duracao) {
        super(r2, datahora, duracao);
    }

    Rota rotaFinal = new Rota(r1.getCia, r1.getOrigem, r2.getDestino, r1.getAeronave);

    public Rota getRotaFinal() {
        return rotaFinal;
    }

    @Override
    public String toString() {
       return super.toString() + " -> " + rotaFinal;
    }
}
