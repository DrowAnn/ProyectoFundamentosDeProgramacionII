//Algoritmo de Ordenamiento por Inserción

public class OrdenamientoInsercion {

    // Declaracíon de los Atributos
    private String[] arreglo;

    // Declaración de los metodos Constructores
    public OrdenamientoInsercion(String[] arreglo) {
        setArreglo(arreglo);
    }

    // Declaración de los Metodos
    public void Ordenador() {
        String[] arregloReves = new String[arreglo.length];

        for (int i = (arreglo.length - 1); i >= 0; i--) {
            arregloReves[arreglo.length - i - 1] = arreglo[i];
        }

        ImprimirArreglos impresion = new ImprimirArreglos(arregloReves);
        impresion.impresionArreglo();
    }

    // Declaración de los metodos Getter y Setter
    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }

    public String[] getArreglo() {
        return arreglo;
    }

}