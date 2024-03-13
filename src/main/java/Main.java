/*En la fila de un banco hay 25 personas ubicadas de manera aleatoria. Ordenar la fila teniendo en cuenta el nombre de las personas en orden alfabético.

- Se desarrolla una clase que toma 25 nombres por defecto o la cantidad que desee el usuario y los agregua a un arreglo en el orden en que se capturan.
- Se desarrolla una clase que toma el arreglo previamente llenado y utiliza el algoritmo de ordenamiento por inserción para ordenar los nombres en orden alfabético. Este se realizo de dos formas, con uso de la libreria java.text.Collator y por comparacion letra a letra, programado manualmente.
- Se desarrolla una clase que imprime los nombres por pantalla.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arreglo = {};
        String[] arregloM = {};
        Integer repetidor;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Desea digitar una cantidad de persona o usar la predeterminada (25)?. Digite el numero de la opción que corresponda a continuación:");

        do {
            System.out.println();
            System.out.println("1. Digitar cantidad");
            System.out.println("2. Cantidad predeterminada (25)");
            System.out.println();
            Integer opcion = scanner.nextInt();
            System.out.println();
            repetidor = 0;
            if (opcion == 1) {
                System.out.println("Digite la cantidad de personas en la fila:");
                Integer longitud = scanner.nextInt();
                System.out.println();
                EscritorArreglo escritor = new EscritorArreglo(longitud);
                arreglo = escritor.escribirArreglo();
                arregloM = arreglo;
            } else if (opcion == 2) {
                EscritorArreglo escritor = new EscritorArreglo();
                arreglo = escritor.escribirArreglo();
                arregloM = arreglo;
            } else {
                System.out.println("Opcion incorrecta");
                repetidor = 1;
            }
        } while (repetidor != 0);

        OrdenamientoInsercion arregloOrdenadoC = new OrdenamientoInsercion(arreglo);
        arreglo = arregloOrdenadoC.OrdenadorCollator();

        OrdenamientoInsercion arregloOrdenadoM = new OrdenamientoInsercion(arregloM);
        arregloM = arregloOrdenadoM.OrdenadorManual();

        ImprimirArreglos impresion = new ImprimirArreglos(arreglo);
        impresion.impresionArreglo();

        ImprimirArreglos impresionM = new ImprimirArreglos(arregloM);
        impresionM.impresionArreglo();

        scanner.close();
    }

}