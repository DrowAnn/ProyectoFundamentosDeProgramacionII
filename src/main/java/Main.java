/*En la fila de un banco hay 25 personas ubicadas de manera aleatoria. Ordenar la fila teniendo en cuenta el nombre de las personas en orden alfabético.

- Se desarrolla una función que toma 25 nombres y los agregua a un arreglo en el orden en que se capturan.
- Se utiliza el algoritmo de ordenamiento por inserción para ordenar los nombres en orden alfabético.
- Se desarrolla una función que imprime los nombres por pantalla, una vez ordenados.*/

public class Main {

    public static void main(String[] args) {

        String arreglo[] = { "casa", "perro", "robert", "elton" };
        OrdenamientoInsercion arregloOrdenado = new OrdenamientoInsercion(arreglo);
        arregloOrdenado.Ordenador();

    }

}