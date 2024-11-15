public class Medico extends EmpleadoHospital implements Certificacion {
    public Medico(String nombre, String identificacion, double salarioBase) {
        super(nombre, identificacion, salarioBase);
    }
    public void trabajar() {
        System.out.println("Médico Disponible: " + nombre);
    }
    public void obtenerCertificacion() {
        System.out.println("Medico certificado: " + nombre);
    }
    public void renovarCertificacion() {
        System.out.println("Certificacion renovada: " + nombre);
    }
}

