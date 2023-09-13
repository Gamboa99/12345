// Calcular la temperatura  convertida de grados centigrados a farenheit

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int ini, fin, c;
        float tm=32.0f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime una tabla de conversion de centigrados a farenheit");
            do{
                System.out.print("Inicio : "); ini = obj.nextInt();
                System.out.print("Fin : "); fin = obj.nextInt();
            } while(fin < ini );
            c=ini;
            System.out.println("Centigrados\tFarenheit");
            while( c<=fin ){
                System.out.printf("%d\t%.2f\n",c,(c * 1.8)+tm);
                c++;
            }
            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
    
}
