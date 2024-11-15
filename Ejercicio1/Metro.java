public class Metro extends VehiculoTransporte{
    public Metro(int capacidad, double velocidadMaxima) {
        super(capacidad, velocidadMaxima);
    }
    public void mover() {
        System.out.println("El metro está en movimiento");
    }
}
