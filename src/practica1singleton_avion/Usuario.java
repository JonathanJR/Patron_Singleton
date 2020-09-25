package practica1singleton_avion;

import java.util.ArrayList;

public class Usuario {

    private Avion avion = Avion.get_Avion();
    private String nombre, apellidos;
    private String dni;
    private ArrayList<String> billetes;

    public Usuario(String nombre, String apellidos, String dni, ArrayList<String> billetes) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.billetes = billetes;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<String> getBilletes() {
        return billetes;
    }

    public void setBilletes(ArrayList<String> billetes) {
        for (String b : billetes) {
            this.billetes.add(b);
        }
    }

    public ArrayList<String> devolverBilletes(int[] billetes) {
        ArrayList<String> aux = new ArrayList<>();
        int contador = 0;
        for (int i = 0; i < billetes.length; i++) {
            aux.add(this.getBilletes().get(billetes[i] - contador));
            this.getBilletes().remove(billetes[i] - contador);
            contador++;
        }
        return aux;
    }

    public void QuieroComprarBilletes(int billetes) {
        avion.VendeBillete(billetes);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", billetes=" + billetes + '}';
    }

}
