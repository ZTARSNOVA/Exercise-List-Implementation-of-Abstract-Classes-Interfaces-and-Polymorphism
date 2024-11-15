public class Main {
    public static void main(String[] args) {
        EmpleadoHospital[] empleados = {
                new Medico("Dr. Rodriguez", "M001", 5000),
                new Enfermero("Enf. Torres", "E001", 3000),
                new PersonalLimpieza("Sánchez", "L001", 1500)
        };

        for (EmpleadoHospital empleado : empleados) {
            empleado.trabajar();
            //empleado.tomarDescanso();

            if (empleado instanceof Certificacion) {
                Certificacion certificado = (Certificacion) empleado;
                certificado.obtenerCertificacion();
                certificado.renovarCertificacion();
            }

            System.out.println();
        }
    }
}
