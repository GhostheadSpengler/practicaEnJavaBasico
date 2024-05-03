import java.util.*;

public class usuario01 {
    public static void main(String[] args) {


        //LLAMAR A SCANNER
        Scanner scaneo=new Scanner(System.in);

        //CREA VARIABLE Y LLAMA AL METODO
        System.out.println("Escribe tu pelicula preferida:");
        String pelicula=scaneo.nextLine();

        System.out.println("Escribe la fecha de lanzamiento:");
        int fecha=scaneo.nextInt();

        System.out.println("Califica con enteros y decimales la pelicula:");
        double califica=scaneo.nextDouble();

        System.out.println(pelicula);
        System.out.println(fecha);
        System.out.println(califica);

    }
}

