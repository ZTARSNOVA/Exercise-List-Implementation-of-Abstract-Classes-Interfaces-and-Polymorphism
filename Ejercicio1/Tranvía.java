public class Tranvía extends VehiculoTransporte{
    public Tranvía(int capacidad, double velocidadMaxima) {
        super(capacidad, velocidadMaxima);
    }

    public void mover() {
        System.out.println("El tranvía está en movimiento");
    }
}
