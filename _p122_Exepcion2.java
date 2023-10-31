import java.util.Scanner;
public class _p122_Exepcion2 {
    public static void main(String[] args) {
        try {
            System.out.print("Dame un valor : ");
            int val = new Scanner(System.in).nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es " + val);
        } catch(Exception e) {
            System.out.println ("Debes introducir un numero ");
        }
    }
    
}
