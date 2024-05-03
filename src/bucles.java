import java.util.*;

public class bucles {
    public static void main(String[] args) {
        //FOR
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double prom = 0;

        System.out.println("Escribe el nombre de la pelicula: ");
        String pelicula= teclado.nextLine();

        for(int i=0;i<4;i++){
            System.out.println("Escribe la calificacion de la pelicula:");
            nota=teclado.nextDouble();
            prom=prom+nota;
        }
        System.out.println("La pelicula" +pelicula+ "tiene una media de: " +prom/4);
    }
}

