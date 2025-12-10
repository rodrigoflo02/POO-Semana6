package model;

public class PlantaProceso extends UnidadOperativa{
    private double capacidadproceso;
    private int numerolineas;

    public PlantaProceso(String nombre, String comuna, double capacidadproceso, int numerolineas) {
        super(nombre, comuna);
        this.capacidadproceso = capacidadproceso;
        this.numerolineas = numerolineas;
    }

    public double getCapacidadproceso() {
        return capacidadproceso;
    }
    public int getNumerolineas() {
        return numerolineas;
    }

    @Override
    public String toString() {
        return "Planta: " + getNombre() + ", Comuna: " + getComuna() + ", Capacidad de proceso: " + capacidadproceso + ", Numero de lineas: " + numerolineas;
    }
}
