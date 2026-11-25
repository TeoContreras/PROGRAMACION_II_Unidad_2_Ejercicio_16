import java.util.ArrayList;

public class PlataformaReserva {
    private SalaCine sala;

    public PlataformaReserva(SalaCine sala) { this.sala = sala; }

    public void solicitarReserva(ArrayList<String> codigos) {
        sala.bloquearButacas(codigos);
    }
}
