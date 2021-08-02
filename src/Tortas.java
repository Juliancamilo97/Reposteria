class Tortas {
    // Constantes
    private final static Double PRECIOBASE = 20000.0;
    private final static String SABOR="vainilla";
    private final static String TAMANO="media_libra";
    // Atributos
    private String sabor;
    private String tamano;
    private Double precioBase;
    // Constructores
    public Tortas(String sabor, String tamano, Double precioBase) {
        this.sabor = sabor;
        this.tamano = tamano;
        this.precioBase = precioBase;
    }
    public Tortas(){
        this.sabor= SABOR;
        this.precioBase=PRECIOBASE;
        this.tamano=TAMANO;
    }
    //Métodos
    public double calcularPrecio() {
        Double precioFinal=0.0;
        if (sabor=="vainilla"){
            precioFinal= precioBase*1.1;
        }
        else if(sabor=="naranja"){
            precioFinal=precioBase *1.2;
        }
        else if(sabor=="chispas"){
            precioFinal=precioBase*1.3;
        }else if (sabor=="relleno_arequipe"){
            precioFinal=precioBase*1.4;
        }

        if(tamano=="media_libra"){
            precioFinal=precioFinal+5000.0;
        }else if(tamano=="una_libra"){
            precioFinal=precioFinal+15000.0;
        }

    return precioFinal;
    
    }
   }
   class Crema extends Tortas {
    // Atributos
    private Boolean cremaToppings;
    // Constructores
    public Crema(String sabor, String tamano, Double precioBase, Boolean cremaToppings) {
        super(sabor, tamano, precioBase);
        this.cremaToppings = cremaToppings;
    }
    // Métodos
    public double calcularPrecio() {
        Double precioFinal=super.calcularPrecio();

        if(cremaToppings==true){
            precioFinal=precioFinal+10000;
        }else{
            precioFinal=precioFinal+5000;
        }
   
    return precioFinal;
    }

   }
   class Fondant extends Tortas {
    // Atributos
    private String fondantEstilo;
    // Constructores
    public Fondant(String sabor, String tamano, Double precioBase, String fondantEstilo) {
        super(sabor, tamano, precioBase);
        this.fondantEstilo = fondantEstilo;
    }
    // Métodos
    @Override
    public double calcularPrecio() {
        Double precioFinal=super.calcularPrecio();

        if(fondantEstilo=="figura2D"){
            precioFinal=precioFinal+15000;
        }else{
            precioFinal=precioFinal+30000;
        }
   
    return precioFinal;
    }

    
}
class ValorTotal {
    // Atributos
    private Double valorTotalTortas = 0.00;
    private Double valorTotalTortasCrema = 0.00;
    private Double valorTotalTortasFondant = 0.00;
    private Tortas[] tortas;
    // Constructores
    public ValorTotal(Tortas[] tortas) {
        this.tortas = tortas;
    }
    // Métodos
    public void mostrarTotales() {
    // Cálculo totales
    double totalTortas=0;
    for(int i = 0; i < tortas.length;i++){
        if (tortas[i] instanceof Tortas){
            totalTortas+= tortas[i].calcularPrecio();
        }
        if (tortas[i] instanceof Crema){
            valorTotalTortasCrema+= tortas[i].calcularPrecio();
        }
        if (tortas[i] instanceof Fondant){
            valorTotalTortasFondant+= tortas[i].calcularPrecio();
        }
    }
    valorTotalTortas=totalTortas-valorTotalTortasCrema-valorTotalTortasFondant;
    System.out.println(Math.round(valorTotalTortas));
    System.out.println(Math.round(valorTotalTortasCrema));
    System.out.println(Math.round(valorTotalTortasFondant));
    System.out.println(Math.round(totalTortas));
    }
}