//Clase para la impresión de Arreglos

public class ImprimirArreglos {

    // Declaración de los Atributos
    private String[] arreglo;

    // Declaración del metodo Constructor
    public ImprimirArreglos(String[] arreglo) {
        setArreglo(arreglo);
    }

    // Declaración del Metodo
    public void impresionArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    // Declaración de Getter y Setter
    public String[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }
}