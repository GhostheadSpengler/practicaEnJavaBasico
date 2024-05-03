import java.util.Scanner;

public class lecturaUsuario {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula:");
        String pelicula=teclado.nextLine();

        System.out.println("Escribe la fecha de lanzamiento:");
        double fecha=teclado.nextDouble();

        System.out.println("Tu pelicula"+ pelicula+ "fue lanzada en " +fecha);

    }

}