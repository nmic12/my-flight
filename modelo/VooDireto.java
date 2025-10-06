import java.time.Duration;
import java.time.LocalDateTime;

import pucrs.myflight.modelo.Rota;

public class VooDireto extends Voo{
    public VooDireto(LocalDateTime datahora, Rota rota) {
        super(datahora, rota);
    }

    @Override
    public Duration getDuracao() {
        return super.getDuracao();
    }

    public Rota getRota() {
        return super.getRota();
    }
}
