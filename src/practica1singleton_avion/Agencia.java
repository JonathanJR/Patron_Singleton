package practica1singleton_avion;

public class Agencia {

    private Avion avion = Avion.get_Avion();

    public void QuieroDevolverBilletes(int billetes) {
        avion.DevuelveBilletes(billetes);
    }
}
