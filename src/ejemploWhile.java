import java.util.*;
public class ejemploWhile {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numUsuario=0;
        int acumulado=0;

        //WHILE

        while(numUsuario>0){
            System.out.println("Ingresa los numeros que deseas sumar:");
            numUsuario= teclado.nextInt();
            acumulado=acumulado + numUsuario;
            System.out.println("El resultado de la suma es: " + acumulado);
        }

        System.out.println("Numero no valido.");

    }
}