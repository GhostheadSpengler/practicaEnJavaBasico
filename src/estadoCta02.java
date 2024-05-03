import java.util.*;

public class estadoCta02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        String usuario="Mishi Rodriguez";
//        double numCliente=2872624;
        boolean acceso = true;
        int passCode = 0;
        int alamcen = 2357;
        double saldo = 7500;
        double operaciones = 0;
        int opciones = 0;


        String info = """
                                
                1. CONSULTAR SALDO
                                
                2. DEPOSITAR
                                
                3. RETIRAR
                                
                9. SALIR
                """;
        while (acceso == true) {

            //************************ VALIDAR PASSWORD *****************************/
            System.out.println("Bienvenidx, introduce tu PIN");
            passCode = teclado.nextInt();
            while (passCode == alamcen) { //VALIDACION DE NIP

                //*********************** MENU DE BIENVENIDA ****************************/

                System.out.println("*************************");
                System.out.println("\nBIENVENIX A TU APLICACION BANCARIA:");
                System.out.println("Selecciona la accion que deseas realizar");
                System.out.println("\n***************************");
                System.out.println(info);

                //**********************   SELECCION DEL MENU ***********************************/

                while (opciones != 9) {
                    opciones = teclado.nextInt();
                    switch (opciones) {
                        // ************************** CONSULTA
                        case 1:
                            System.out.println("Tu saldo al momento es de:" + saldo);
                            break;
                        //************************* DEPOSITO

                        case 2:
                            System.out.println("Ingresa la cantidad que deseas transferir: ");
                            operaciones = teclado.nextDouble();
                            saldo = saldo + operaciones;
                            System.out.println("Tu saldo actual es de: " + saldo);
                            break;

                        //*************************  RETIRO

                        case 3:
                            System.out.println("Ingresa la cantidad que deseas realizar: ");
                            operaciones = teclado.nextInt();
                            if (saldo < operaciones) {
                                System.out.println("Saldo insuficiente");
                            } else {
                                saldo = saldo - operaciones;
                                System.out.println("Tu saldo actual es de:" + saldo);
                            }
                            break;

                        case 9:
                            System.out.println("Gracias por tu Preferencia, fue un placer atenderte");
                        //************************* SALIDA

                        default:
                            System.out.println("Caracter Incorrecto");


                    }

                }

                break;
            }
            System.out.println("Validacion Incorrecta");
        }


    }
}