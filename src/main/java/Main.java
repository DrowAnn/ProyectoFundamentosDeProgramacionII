/*En la fila de un banco hay 25 personas ubicadas de manera aleatoria. Ordenar la fila teniendo en cuenta el nombre de las personas en orden alfabético.

- Se desarrolla una clase que toma 25 nombres por defecto o la cantidad que desee el usuario y los agregua a un arreglo en el orden en que se capturan.
- Se desarrolla una clase que toma el arreglo previamente llenado y utiliza el algoritmo de ordenamiento por inserción para ordenar los nombres en orden alfabético. Este se realizo de dos formas, con uso de la libreria java.text.Collator y por comparacion letra a letra, programado manualmente.
- Se desarrolla una clase que imprime los nombres por pantalla.

NOTA: Si se va a usar la opcion de arreglo por codigo, colocar el arreglo que se desea ordenar en la declaracion del String[] "arreglo" (Señalado en el texto con un comentario "Poner aqui el arreglo interno") para inicializar el arreglo antes de ejecutar el codigo y además, en el primer menu escoger la opción "Arreglo Interno"
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arreglo = {}; // Poner aqui el arreglo interno
        String[] arregloM = {};
        Integer repetidor;
        Integer opcion;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Desea utilizar el arreglo inicializado en el codigo o solicitar por pantalla uno a uno los nombres?");
        do { // Selección del tipo de arreglo
            System.out.println();
            System.out.println("1. Arreglo interno");
            System.out.println("2. Capturar valores");
            System.out.println();
            opcion = scanner.nextInt();
            repetidor = 0;
            if (opcion == 1) {
                arregloM = arreglo;
            } else if (opcion == 2) {
                System.out.println();
                System.out.println(
                        "Desea digitar una cantidad de persona o usar la predeterminada (25)?. Digite el numero de la opción que corresponda a continuación:");
                do { // Seleccion del tamaño del arreglo de ingreso manual
                    System.out.println();
                    System.out.println("1. Digitar cantidad");
                    System.out.println("2. Cantidad predeterminada (25)");
                    System.out.println();
                    opcion = scanner.nextInt();
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
            } else {
                System.out.println("Opcion incorrecta");
                repetidor = 1;
            }
        } while (repetidor != 0);

        OrdenamientoInsercion arregloOrdenadoC = new OrdenamientoInsercion(arreglo);
        arreglo = arregloOrdenadoC.OrdenadorCollator();

        OrdenamientoInsercion arregloOrdenadoM = new OrdenamientoInsercion(arregloM);
        arregloM = arregloOrdenadoM.OrdenadorManual();

        System.out.println();
        System.out.println("Comparación Collator");
        ImprimirArreglos impresion = new ImprimirArreglos(arreglo);
        impresion.impresionArreglo();

        System.out.println();
        System.out.println("Comparación Manual");
        ImprimirArreglos impresionM = new ImprimirArreglos(arregloM);
        impresionM.impresionArreglo();

        scanner.close();
    }

}