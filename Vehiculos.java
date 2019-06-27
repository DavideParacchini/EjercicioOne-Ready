package v1;

public abstract class Vehiculos {

    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculos(String marca, String modelo, double precio) {

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
