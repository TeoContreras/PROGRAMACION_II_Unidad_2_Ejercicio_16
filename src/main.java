import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        SalaCine sala = new SalaCine();
        sala.agregarButaca(new Butaca("A", 1));
        sala.agregarButaca(new Butaca("A", 2));
        sala.agregarButaca(new Butaca("A", 3));

        PlataformaReserva plataforma = new PlataformaReserva(sala);
        ArrayList<String> reserva = new ArrayList<String>();
        reserva.add("A1");
        reserva.add("A2");

        plataforma.solicitarReserva(reserva);
        sala.mostrarEstado();
    }
}
