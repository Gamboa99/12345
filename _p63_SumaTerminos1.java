// Imprime una secuencia de terminos de numeros armonicos el numero de renglones que el usuario desee

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int i,j,n;
        float f, r;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            r=0;
            System.out.print("Cuantos terminos ?"); n = obj.nextInt();
            for(i=1; i<=n; i++){
                f=1;
                for(j=1; j<=i; j++){
                    f += j;
                }
                System.out.printf("1/ %,.2f +",f);
                r += (1 / f);
            }
            System.out.printf("\nSuma %,.2f",r);
            System.out.print("\nDeseas contunuar (S/N) ?");
            resp=Character.toUpperCase(obj.next().charAt(0));
        }while(resp!='N');
        System.out.println("\nProceso terminado ...");
    }
    
}
