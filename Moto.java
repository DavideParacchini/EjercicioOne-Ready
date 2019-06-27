package v1;

public class Moto extends Vehiculos {

    protected String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: "+ super.marca + "// Modelo: " + super.modelo + "// Cilindrada: " + this.cilindrada + "// Precio: " + super.precio;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}