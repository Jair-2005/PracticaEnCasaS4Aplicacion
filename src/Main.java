//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("Inventario", "2.3");
        Aplicacion app3 = new Aplicacion("Facturacion", "0.9");

        app1.iniciar();
        app1.iniciar();  // ya estaba en ejecución
        app2.iniciar();
        app2.cerrar();
        app3.cerrar();   // ya estaba cerrada

        app1.mostrarInfo();
        app2.mostrarInfo();
        app3.mostrarInfo();

        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());
    }
}