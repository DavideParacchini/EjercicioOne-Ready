import v1.Auto;
import v1.Moto;
import v1.Vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        getLista();

    }

    public static void getLista() {

        List<Vehiculos> vehiculos = new ArrayList<Vehiculos>();
        vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
        vehiculos.add(new Moto("Honda", "Titan", "125c", 60000));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
        vehiculos.add(new Moto("Yamaha", "YBR", "160c", 80500.50));

        for (Vehiculos vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println("==============================");

        Vehiculos auxMaxVehiculo = null;
        boolean auxMax = true;
        for (Vehiculos vehiculo : vehiculos) {
            if (auxMax == true) {
                auxMaxVehiculo = vehiculo;
                auxMax = false;
            } else if (auxMaxVehiculo.getPrecio() < vehiculo.getPrecio()) {
                auxMaxVehiculo = vehiculo;
                System.out.println("Vehiculo más caro: " + auxMaxVehiculo.getMarca() + " " + auxMaxVehiculo.getModelo());
            }
        }
        Vehiculos auxMinVehiculo = null;
        boolean auxMin = true;
        for (Vehiculos vehiculo : vehiculos) {
            if (auxMin == true) {
                auxMinVehiculo = vehiculo;
                auxMin = false;
            } else if (auxMinVehiculo.getPrecio() > vehiculo.getPrecio()) {
                auxMinVehiculo = vehiculo;
                System.out.println("Vehiculo más barato: " + auxMinVehiculo.getMarca() + " " + auxMinVehiculo.getModelo());
            }
        }
        Vehiculos auxYVehiculo = null;
        boolean auxY = true;
        for (Vehiculos vehiculo : vehiculos) {
            if (auxY == true) {
                auxYVehiculo = vehiculo;
                auxY = false;
            } else if (auxYVehiculo.getModelo().contains("Y") != (vehiculo.getModelo().contains("Y"))) {
                auxYVehiculo = vehiculo;
                System.out.println("Vehiculo que contiene en el modelo la letra 'Y': " + auxYVehiculo.getMarca() + " " + auxYVehiculo.getPrecio());
            }
        }
    }
}


