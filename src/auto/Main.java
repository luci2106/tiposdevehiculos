package auto;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {
            public static void main(String[] args) {

                VehiculosMotorizados vehiculosMotorizados1 = new VehiculosMotorizados("seat", "c4", LocalDate.now(), "gasolina");
                vehiculosMotorizados1.mostrarVehiculosMotorizados();
                System.out.println(vehiculosMotorizados1);
                auto.Automovil automovil1= new auto.Automovil();
                Automovil1.mostrarAutomovil();
                System.out.println(automovil.toString());
                auto.Motocicleta motocicleta1=new auto.Motocicleta();
                moticicleta1.motocicleta();
                System.out.println(automovil.toString());
                auto.Vehiculo vehiculo1= new auto.Vehiculo();
                System.out.println(vehiculo1.toString());



            }
            }



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.



