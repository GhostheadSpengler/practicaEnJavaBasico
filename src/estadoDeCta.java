import java.util.*;

public class estadoDeCta {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre= "Mishi Rodriguez";
        int cta= 73532;
        double saldo= 3500;
        int menu=0;
        double operaciones= 0;

        String info ="""
                    ***Escriba el numero de la opcion deseada:
                    
                    1. Consultar Saldo.
                    
                    2. Retirar
                    
                    3. Depositar
                    
                    9. Salir
                    """;

        System.out.println(info);

        //MENU

        while(menu!=9){
            System.out.println("Bienvenido: " + nombre );
            System.out.println("Que accion accion deseas realizar?");
            double opcion=teclado.nextDouble();



//*******************************************   CONSULTA SALDO *****************************************************/

            if(opcion==1){
                System.out.println("Tu saldo actual es de: $" + saldo );
            }
//*******************************************   RETIRO  *****************************************************/

            if(opcion==2){
                System.out.println("Introduce la cantidad que deseas retirar:");
                operaciones= teclado.nextDouble();
                saldo=saldo-operaciones;
                if(saldo>operaciones){
                    System.out.println("Tu saldo actual es de:" + saldo);
                    break;
                } else {
                    System.out.println("Saldo insuficiente");
                }


//*******************************************   DEPOSITO  *****************************************************/

            } else if (opcion==3) {
                System.out.println("Ingresa el monto que deseas transferir a la cta:" + cta);
                operaciones= teclado.nextDouble();
                saldo=saldo+operaciones;
                System.out.println("Transferencia exitosa. Tu saldo actual es de:" + saldo);
                break;


                //SALIR
            }else{
                System.out.println("Operacion finalizada.");            }

        }
    }
}

// ****************************  FALTA MARCAR EL SALDO INSUFICIENTE