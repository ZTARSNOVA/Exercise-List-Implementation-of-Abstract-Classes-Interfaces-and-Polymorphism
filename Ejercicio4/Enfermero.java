public class Enfermero extends EmpleadoHospital implements Certificacion {

    public Enfermero(String nombre, String identificacion, double salarioBase) {
        super(nombre, identificacion, salarioBase);
    }
    public void trabajar() {
        System.out.println("Enfermero Disponible: " + nombre);
    }
    public void obtenerCertificacion() {
        System.out.println("Enfermero certificado: " + nombre);
    }
    public void renovarCertificacion() {
        System.out.println("Certificacion renovada: " + nombre);
    }
}
