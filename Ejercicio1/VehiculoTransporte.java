public abstract class VehiculoTransporte{

    public int capacidad;
    public double velocidadMaxima;

    public VehiculoTransporte(int capacidad, double velocidadMaxima){
        this.capacidad = capacidad;
        this.velocidadMaxima = velocidadMaxima;
    }
    public abstract void mover();

    public void parar(){
        System.out.println("El vehículo se ha detenido.");
    }

    public String detallesSistema(){
        return "La capacidad máxima es de "+ capacidad + " y "+ "la velocidad máxima es de " + velocidadMaxima;
    }
}
