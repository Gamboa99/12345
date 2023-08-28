//Dada una cantidad en pesos y la cotizacion del dolar, se desea obtener el equivalente en dolares 
import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, dolares, precio;
        Scanner peso = new Scanner(System.in);
        Scanner prec = new Scanner(System.in);

        System.out.print("Dime la cantidad de pesos que quieres convertir : ");
        pesos = peso.nextFloat();
        System.out.print("A cuanto esta el dolar? ");
        precio = prec.nextFloat();

        dolares = pesos / precio;

        System.out.println("El equivalente en dolares es "+ dolares);

    }
    
}
