package v1;

public class Auto extends Vehiculos {

    protected int puertas;

    public Auto(String marca, String modelo, int puertas, double precio){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String toString(){
        return "Marca: "+ super.marca + "// Modelo: " + super.modelo + "// Puertas: " + this.puertas + "// Precio: " + super.precio;

    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}
