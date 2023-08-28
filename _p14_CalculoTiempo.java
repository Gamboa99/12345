// Dada una cantidad en horas, calcular su equivalente en dias, minutos y segundos considerando que 
// 1 dia tiene 24 horas
//1 hora tiene 60 minutos 
//1 minuto tiene 60 segundos 
<<<<<<< HEAD
import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner hor = new Scanner (System.in);

        System.out.print("Dame la cantidad de horas : ");
        horas = hor.nextFloat();

        dias = (horas / 24);
        minutos = (horas * 60);
        segundos = horas * (60 * 60);

        System.out.println("En dias es " + dias + ", en minutos "+ minutos + ", en segundos "+ segundos);
    }    
=======
public class _p14_CalculoTiempo {
    
>>>>>>> b38242aebcbe2f154d81569cc61820d9e0fb78f7
}
