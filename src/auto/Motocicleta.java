package auto;

import java.time.LocalDate;

public class Motocicleta extends VehiculosMotorizados{
    public String tipoDeMotocicleta;

    public Motocicleta(String marca, String modelo, LocalDate yyyy, String tipodecombustible, String tipoDeMotocicleta) {
        super(marca, modelo, yyyy, tipodecombustible);
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    public Motocicleta(String tipodecombustible, String tipoDeMotocicleta) {
        super(tipodecombustible);
        this.tipoDeMotocicleta = tipoDeMotocicleta;
    }

    public void Mostrardetalle() {
        String Date;

        System.out.println("marca: " + marca+ " modelo " + modelo + "data"+ yyyy+ "usa el combustible"+tipodecombustible);
    }
}
