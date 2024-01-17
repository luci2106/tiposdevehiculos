package auto;

import java.time.LocalDate;
import java.util.Date;

public class Vehiculo {
    String marca;
    String modelo;
    LocalDate yyyy;

    public Vehiculo(String marca, String modelo, LocalDate yyyy) {
        this.marca = marca;
        this.modelo = modelo;
        this.yyyy = yyyy;
    }

    public Vehiculo() {

    }

    public void Mostrardetalle() {
        String Date;
        System.out.println("marca: " + marca+ " modelo " + modelo + "data"+ yyyy);
    }
}

