package modelo;

public class Motocicleta extends Vehiculo {
    private final double cilindrada;

    public Motocicleta(String marca, String modelo, int anio,
                       double precio, double cilindrada) {
        super(marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    protected String getCaracteristica() {
        return "Cilindrada: " + cilindrada + " cc";
    }
}