public class PersonalLimpieza extends EmpleadoHospital {
    public PersonalLimpieza(String nombre, String identificacion, double salarioBase) {
        super(nombre, identificacion, salarioBase);
    }
    public void trabajar() {
        System.out.println("Personal de Limpieza Disponible: " + nombre);
    }
}
