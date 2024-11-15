public class Main {

    public static void main(String[] args){
        Autobus autobus1 = new Autobus(30, 50.0);
        Tranvía tranvia1 = new Tranvía(250,80.0);
        Metro metro1 = new Metro(960,80.0);

        autobus1.mover();
        System.out.println(autobus1.detallesSistema());
        autobus1.parar();

    }
}
