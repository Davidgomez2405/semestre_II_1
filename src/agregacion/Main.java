package agregacion;

public class Main {

    public static void main(String[] args) {
        Producto pro = new Producto("gafas",30);
        Factura factura = new Factura("10", "11/08/2023", pro);

    }
}
