package auto;

import java.time.LocalDate;

public class VehiculosMotorizados extends Vehiculo {
    public String tipodecombustible;


    public VehiculosMotorizados(String marca, String modelo, LocalDate yyyy, String tipodecombustible) {
        super(marca, modelo, yyyy);
        this.tipodecombustible = tipodecombustible;
    }

    public VehiculosMotorizados(String tipodecombustible) {
        this.tipodecombustible = tipodecombustible;
    }

    public void mostrarVehiculosMotorizados() {

        System.out.println("marca: " + marca + " modelo " + modelo + "data" + yyyy);

    }


}


