import java.util.*;

public class bucles02 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota=0;
        double prom=0;
        double contador=0;

        //WHILE

        System.out.println("Escribe la pelicula que deseas: ");
        String pelicula=teclado.nextLine();

        while(nota!=-1){
            System.out.println("Evalua tu pelicula");
            nota= teclado.nextDouble();

            //Se utilizo el if, porque en el promedio final, tambien incluia el (-1). Entonces el if, solo asegura que los valores positivos sean considerados en el promedio.

            if (nota!=1){
                prom=prom+nota;
                contador++;
            }
           }
        System.out.println("La pelicula"+pelicula+ "tiene un promedio de aceptacion de: " + prom/contador);
    }
}