import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name of Facture");
        String nameFact= scanner.nextLine();
        
        System.out.println("Insert price 1 of Facture");
        Double price1= scanner.nextDouble();
        
        System.out.println("Insert price 2 of Facture");
        Double price2= scanner.nextDouble();

        Double bruto = (price1 + price2);
        Double impuesto = bruto*0.19;

        System.out.println("La factura producto de oficina tiene un total bruto de " + bruto
        +", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + (bruto + impuesto)
        );


    }
}
