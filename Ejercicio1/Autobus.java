public class Autobus extends VehiculoTransporte{
    public Autobus(int capacidad, double velocidadMaxima) {
        super(capacidad, velocidadMaxima);
    }
    public void mover() {
        System.out.println("El autobús está en movimiento");
    }
}
