//Clase para el Ordenamiento por Inserción

import java.text.Collator;

public class OrdenamientoInsercion {

    // Declaracíon de los Atributos
    private String[] arreglo;

    // Declaración de los metodos Constructores
    public OrdenamientoInsercion(String[] arreglo) {
        setArreglo(arreglo);
    }

    // Declaración de los Metodos
    public String[] Ordenador() {
        Collator collator = Collator.getInstance();
        String temporal;

        //Se fija el valor PRYMARY para que no distinga entre Mayuscula, minuscula y acentos
        collator.setStrength(Collator.PRIMARY);
        
        for (int i = 1; i < arreglo.length; i++){
            for (int j = i; j > 0; j--){
                if (collator.compare(arreglo[j], arreglo[j - 1]) < 0){
                    temporal = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
        
        return arreglo;
    }

    // Declaración de los metodos Getter y Setter
    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }

    public String[] getArreglo() {
        return arreglo;
    }

}