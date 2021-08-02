public class App {
    public static void main(String[] args) throws Exception {

            Tortas[] Tortas1 = new Tortas[5];
            Tortas1[0] = new Tortas("chispas","media_libra",22000.0);
            Tortas1[1] = new Crema("naranja","una_libra",25000.0, true);
            Tortas1[2] = new Fondant("relleno_arequipe","una_libra",18000.0, "figura2D");
            Tortas1[3] = new Fondant("vainilla","media_libra",25000.0, "figura3D");
            Tortas1[4] = new Tortas();
            ValorTotal respuesta1 = new ValorTotal(Tortas1);
            respuesta1.mostrarTotales();
            System.out.println();


            Tortas[] Tortas2 = new Tortas[4];
            Tortas2[0] = new Tortas();
            Tortas2[1] = new Tortas("naranja","una_libra",23000.0);
            Tortas2[2] = new Crema("vainilla","media_libra",25000.0, false);
            Tortas2[3] = new Fondant("chispas","una_libra",23000.0, "figura3D");
            ValorTotal respuesta2 = new ValorTotal(Tortas2);
            respuesta2.mostrarTotales();
            System.out.println();

    }
}
