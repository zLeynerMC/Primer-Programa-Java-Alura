import java.util.Random;
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "";
        String presentacion = "";
        float saldo = 0;
        float saldo2 = 0;
        float opcion = 0;
        Random random = new Random();
        float inversion = 0;
        float montoInvertir;
        float resultadoInversion;


        System.out.println("Bienvenido a DysBank, Por Favor Ingrese Su Nombre:");
        usuario = scanner.nextLine();
        System.out.println("Sea Bienvenido(a) Mr(s)" + usuario + ", Como Regalo Le Obsequeamos 500 USD");
        saldo += 500;

        System.out.println( """
                
                Bienvenido(a) Al Menu De Usuario De Usuario DysBank
                """);


       while (true){
           presentacion = """
                   
                   """ +
                   "Usuario: " + usuario + """
                
                Tipo De Cuenta: Corriente
                Estado De Cuenta: Activo
                
                Que Desea Hacer En Su Cuenta:
                1. Consultar Saldo
                2. Retirar
                3. Depositar
                4. Invertir
                0. Salir
                
                Por Favor Elija Una Opcion:""";

           System.out.println(presentacion);
           opcion = scanner.nextFloat();

           if (opcion == 1){
               System.out.println("Su Saldo Actual Es De: " + saldo + " USD");
           }
           if (opcion == 2){
               System.out.println("Ingrese La Cantidad De Dinero a Retirar:");
               saldo2 = scanner.nextFloat();
               saldo -= saldo2;
               System.out.println("Se Han Retirado " + saldo2 + " USD De Su Cuenta" + """
                       
                       Su Saldo Actual Es De:
                       """ + saldo);
           }

           if (opcion == 3){
               System.out.println("Por Favor Ingrese La Cantidad a Depositar:");
               saldo2 = scanner.nextFloat();
               saldo += saldo2;
               System.out.println("Se Han Agregado " + saldo2 + " USD a su cuenta" + """
                       
                       Su Saldo Actual Es De:
                       """ + saldo);
           }

           if (opcion == 4){
               System.out.println("Ingrese La Cantidad De Dinero a Invertir:");
               montoInvertir = scanner.nextFloat();
               saldo -= montoInvertir;

               resultadoInversion = random.nextFloat() * (500 - 100);

               saldo += resultadoInversion;

               if (resultadoInversion > montoInvertir){
                   System.out.println("Gracias a Tu Inversion Ganaste: " + resultadoInversion + " USD");
               } else if (resultadoInversion < montoInvertir) {
                   System.out.println("Gracias a Tu Inversion Perdiste: " + resultadoInversion + " USD");
               }
               else {
                   System.out.println("Tu Inversion Quedo Igual");
               }

           }

           if (opcion == 0){
               System.out.println("Esperamos Que Regrese Pronto, Hasta Luego");
               break;
           }


        }
    }
}