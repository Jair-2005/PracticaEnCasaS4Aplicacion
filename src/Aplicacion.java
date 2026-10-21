public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    public void iniciar() {
        if (ejecutando) {
            System.out.println(nombre + " ya está en ejecución.");
        } else {
            ejecutando = true;
            System.out.println(nombre + " iniciada.");
        }
    }

    public void cerrar() {
        if (!ejecutando) {
            System.out.println(nombre + " ya está cerrada.");
        } else {
            ejecutando = false;
            System.out.println(nombre + " cerrada.");
        }
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    public void mostrarInfo() {
        System.out.println("ID " + id + " | " + nombre + " v" + version
                + " | " + (ejecutando ? "ejecutando" : "detenida"));
    }
}
