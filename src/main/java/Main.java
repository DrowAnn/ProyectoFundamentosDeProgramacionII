/*En la fila de un banco hay 25 personas ubicadas de manera aleatoria. Ordenar la fila teniendo en cuenta el nombre de las personas en orden alfabético.

- Se desarrolla una clase que toma 25 nombres por defecto o la cantidad que desee el usuario y los agregua a un arreglo en el orden en que se capturan.
- Se desarrolla una clase que toma el arreglo previamente llenado y utiliza el algoritmo de ordenamiento por inserción para ordenar los nombres en orden alfabético.
- Se desarrolla una clase que imprime los nombres por pantalla.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String[] arreglo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de personas en la fila:");
        Integer longitud = scanner.nextInt();
        System.out.println();

        EscritorArreglo escritor = new EscritorArreglo(longitud);
        arreglo = escritor.escribirArreglo();

        OrdenamientoInsercion arregloOrdenado = new OrdenamientoInsercion(arreglo);
        arreglo = arregloOrdenado.Ordenador();

        ImprimirArreglos impresion = new ImprimirArreglos(arreglo);
        impresion.impresionArreglo();

        scanner.close();
    }

}