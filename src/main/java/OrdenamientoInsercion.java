//Clase para el Ordenamiento por Inserción

public class OrdenamientoInsercion {

    // Declaracíon de los Atributos
    private String[] arregloInicial;

    // Declaración de los metodos Constructores
    public OrdenamientoInsercion(String[] arregloInicial) {
        setArreglo(arregloInicial);
    }

    // Declaración de los Metodos
    public String[] Ordenador() {
        String[] arreglo = new String[arregloInicial.length];

        for (int i = (arregloInicial.length - 1); i >= 0; i--) {
            arreglo[arregloInicial.length - i - 1] = arregloInicial[i];
        }

        return arreglo;
    }

    // Declaración de los metodos Getter y Setter
    public void setArreglo(String[] arregloInicial) {
        this.arregloInicial = arregloInicial;
    }

    public String[] getArreglo() {
        return arregloInicial;
    }

}