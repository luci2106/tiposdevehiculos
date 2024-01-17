package auto;

import java.time.LocalDate;

public class Automovil extends VehiculosMotorizados {
    public int numerodepuertas;

    public Automovil(String marca, String modelo, LocalDate yyyy, String tipodecombustible, int numerodepuertas) {
        super(marca, modelo, yyyy, tipodecombustible);
        this.numerodepuertas = numerodepuertas;
    }

    public Automovil(String tipodecombustible, int numerodepuertas) {
        super(tipodecombustible);
        this.numerodepuertas = numerodepuertas;
    }





    public void Mostrardetalle() {

        System.out.println("marca: " + marca + " modelo " + modelo + "data" + yyyy + "usa el combustible" + tipodecombustible);
    }
}