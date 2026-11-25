import java.util.ArrayList;

public class SalaCine {
    private ArrayList<Butaca> butacas;

    public SalaCine() { butacas = new ArrayList<Butaca>(); }

    public void agregarButaca(Butaca butaca) { butacas.add(butaca); }

    public boolean bloquearButacas(ArrayList<String> codigosButacas) {
        for (String codigo : codigosButacas) {
            boolean encontrada = false;
            for (Butaca butaca : butacas) {
                if (butaca.getCodigo().equalsIgnoreCase(codigo)) {
                    encontrada = true;
                    if (!butaca.estaDisponible()) {
                        System.out.println("La butaca " + codigo + " ya está ocupada.");
                        return false;
                    }
                }
            }
            if (!encontrada) {
                System.out.println("No existe la butaca " + codigo);
                return false;
            }
        }

        for (String codigo : codigosButacas) {
            for (Butaca butaca : butacas) {
                if (butaca.getCodigo().equalsIgnoreCase(codigo)) butaca.bloquear();
            }
        }
        System.out.println("Reserva de butacas confirmada.");
        return true;
    }

    public void mostrarEstado() {
        for (Butaca butaca : butacas)
            System.out.println(butaca.getCodigo() + ": " + (butaca.estaDisponible() ? "Disponible" : "Ocupada"));
    }
}
