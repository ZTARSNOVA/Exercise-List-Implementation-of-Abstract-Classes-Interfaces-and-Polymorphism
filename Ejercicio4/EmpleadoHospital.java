public abstract class EmpleadoHospital {
    public String nombre;
    public String identificacion;
    public double salarioBase;

    public EmpleadoHospital(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    public abstract void trabajar();

    public void tomarDescanso() {
        System.out.println("No esta disponible: "+ nombre);
    }
}
