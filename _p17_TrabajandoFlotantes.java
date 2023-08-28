//Trabajando con numeros flotantes 

public class _p17_TrabajandoFlotantes {
    public static void main(String[] args) {
        float num1=423.45f;
        float num2=123f;
        float num3=1.94e-8f;
        double num4=12332123.434398d;
        double num5=.3456;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nUso de String.format para formateo de numeros flotantes");
        System.out.println("String.format("num1 y num2 en formato flotble  : %f %f",num1, num2));
        System.out.println(String.format("num1 y num2 en formato flotantes con decimales  : %.2f %.2f", num1,num2));
        System.out.println(String.format("num1 en formato flotante alineado : %10.2f",num1));
        System.out.println(String.format("num2 en formato flotante alineado  : %10.2f",num2));
        

    }
    
}
