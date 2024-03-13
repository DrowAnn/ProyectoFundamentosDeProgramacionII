//Clase para el llenado del arreglo

import java.util.Scanner;

public class EscritorArreglo {

    // Definición de los Atributos
    private Integer longitud;

    // Definición de los metodos Constructores
    public EscritorArreglo() {
        setLongitud(25);
    }

    public EscritorArreglo(Integer longitud) {
        setLongitud(longitud);
    }

    // Definición de Metodos
    public String[] escribirArreglo() {
        Scanner scanner = new Scanner(System.in);
        String[] arreglo = new String[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Digite el nombre de la persona en el puesto " + i + ":");
            arreglo[i] = scanner.next();
        }
        return arreglo;
    }

    // Definición de Getter y Setter
    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getLongitud() {
        return longitud;
    }

}