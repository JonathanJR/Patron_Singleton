package practica1singleton_avion;

import javax.swing.JOptionPane;

public final class Avion {

    private static int n_asientos;
    private static Avion avion = new Avion();

    private Avion() {
        n_asientos = 180;
    }

    public static Avion get_Avion() {
        return avion;
    }

    public void VendeBillete(int billetes) {
        if (n_asientos > billetes) {
            n_asientos = n_asientos - billetes;
        } else {
            JOptionPane.showMessageDialog(null, "No quedan la cantidad de billetes solicitada");
        }
    }

    public void DevuelveBilletes(int billetes) {
        n_asientos = n_asientos + billetes;
    }

    public int CuantosAsientosQuedan() {
        return n_asientos;
    }
}
