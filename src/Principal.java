import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el límite de la tarjeta: ");
        double limite = lectura.nextDouble();
        CreditCard card = new CreditCard(limite);

        int salir = 1;
        while (salir != 0){
            System.out.println("Escriba la descripción de la compra: ");
            String description = lectura.next();

            System.out.println("Escriba el valor de la compra: ");
            double valor = Double.valueOf(lectura.next());

            Compra compra = new Compra(valor, description);
            boolean compraRealizada = card.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("¡Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = lectura.nextInt();
            }
            else {
                System.out.println("¡Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("******************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(card.getListaDeCompras());
        for (Compra compra : card.getListaDeCompras()) {
            System.out.println(compra.getDescription() + " - " +compra.getValue());
        }
        System.out.println("\n******************************");
        System.out.println("\nSaldo de la tarjeta: " + card.getSaldo());
    }
}
