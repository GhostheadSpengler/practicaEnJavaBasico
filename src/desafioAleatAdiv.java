import java.util.*;

public class desafioAleatAdiv {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int aleatorio=new Random().nextInt(100);

        int num=0;
        int contador=0;

        System.out.println("Adivina el numero.");


        //FOR, IF, WHILE....

        while(contador<5) {
            System.out.println("Introduce el numero que piensas es el que tengo guardado:");
            num= teclado.nextInt();
            contador++; //Puse aqui el incremento porque este debe aumentar al primer instante en que se ponga la cifra, y no cuando ya se este ejecutando el bucle if. Es mas bien una condicion del while.Al final del while, igual se condiciona el incremento a un cierre despues de llegar a CINCO intentos.

            if (num == aleatorio) {
                System.out.println("Has acertado!");
                break;
            }
                else if(num <aleatorio){
                System.out.println("El numero es mayor");

                } else if (num>aleatorio) {
                System.out.println("El numero es menor");

            }
        }
        if(contador==5){
            System.out.println("Haz alcanzado el numero maximo de intentos. Looser.");
        }
        }
    }
