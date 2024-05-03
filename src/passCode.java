import java.util.*;
public class passCode{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bienvenido al programa de contraseñas.");

            System.out.println("Crea aqui tu contraseña nueva: ");
            String contraseña = scanner.nextLine();

            String contraseñasIntentos;
            int numero = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingresa tu contraseña: ");
                contraseñasIntentos = scanner.nextLine();

                if (contraseñasIntentos.equals(contraseña))  {
                    numero += 1;
                }
            }

            if (numero >= 1) {
                System.out.println("Ingresaste la contraseña correcta " + numero + " vez/veces.");
            }
            else {
                System.out.println("Ninguna es la contraseña correcta.");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Hubo un error.");
        }
        finally {
            System.out.println("Adios.");
        }
    }
}




