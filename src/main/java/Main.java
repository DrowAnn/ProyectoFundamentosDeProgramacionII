/*En la fila de un banco hay 25 personas ubicadas de manera aleatoria. Ordenar la fila teniendo en cuenta el nombre de las personas en orden alfabético.

- Se desarrolla una función que toma 25 nombres y los agregua a un arreglo en el orden en que se capturan.
- Se utiliza el algoritmo de ordenamiento por inserción para ordenar los nombres en orden alfabético.
- Se desarrolla una función que imprime los nombres por pantalla, una vez ordenados.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arreglo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de personas en la fila:");
        Integer longitud = scanner.nextInt();

        EscritorArreglo escritor = new EscritorArreglo(longitud);
        arreglo = escritor.escribirArreglo();

        OrdenamientoInsercion arregloOrdenado = new OrdenamientoInsercion(arreglo);
        arreglo = arregloOrdenado.Ordenador();

        ImprimirArreglos impresion = new ImprimirArreglos(arreglo);
        impresion.impresionArreglo();
        
    }

}