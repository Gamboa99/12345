//Examen

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        String Nombre;
        int Edad,Edadtotal,Alumnos,Totala, Docentes, Totaldocentes,Trabajadores,Totaltrabajadores,Femenino,Totalmujeres,Masculino,Totalhombres,PagoAlumnos,Totalpagar,PagoDocentes,PagoTrabajadores;
        char op, resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Nombre : "); Nombre = obj.nextLine();
            System.out.print("Edad : "); Edad = obj.nextInt();
            System.out.println("Cual es tu Sexo ? ");
            System.out.println("[F]emenino");
            System.out.println("[M]asculino");
            op = Character.toUpperCase(obj.next().charAt(0));
            if(op =='F'){
                Femenino=0;
                Totalmujeres =(Femenino + 1);
            } else if(op == 'M')
                Masculino=0;
                Totalhombres =(Masculino +1);
            
            
            if (Edad > 18){
                Edad=0;
                Edadtotal= (Edad+1);
                
                System.out.println("Eres mayor de edad, continuemos");
                System.out.println("Eres un [A]Alumno, [D]Docente o [T]rabajador:");
                op = Character.toUpperCase(obj.next().charAt(0));
                if (op == 'A'){
                    Alumnos=0;
                    Totala=0;
                    Totala=(Alumnos+1);
                    PagoAlumnos =(Alumnos * 50);
                
                if (op == 'D')
                    Docentes=0;
                    Totaldocentes=0;
                    Totaldocentes =(Docentes+1);
                    PagoDocentes =(Docentes * 80);
                
                else if(op == 'T')
                    Trabajadores = 0;
                    Totaltrabajadores=0;
                    Totaltrabajadores =(Trabajadores+1);
                    PagoTrabajadores =(Trabajadores * 60);
                }
                Totalpagar=PagoAlumnos+PagoDocentes+PagoTrabajadores;
                System.out.printf("\nTotal de alumnos %d",Totala);
                System.out.printf("\nTotal Docentes %d",Totaldocentes);
                System.out.printf("\nTotal de trabajadores %d", Totaltrabajadores);
                System.out.printf("\nTotal Hombres %d",Totalhombres);
                System.out.printf("\nTotal Mujeres %d", Totalmujeres);
                System.out.printf("\nTotal de participantes %d",Edadtotal);
                System.out.printf("\nTotal recaudado de alumnos %d",PagoAlumnos);
                System.out.printf("\nTotal recaudado docentes %d",PagoDocentes);
                System.out.printf("\nTotal recaudado trabajadores %d",PagoTrabajadores);
                System.out.printf("\nTotal Dinero %d ", Totalpagar);
                
            }else 
            System.out.println("Solo aceptamos estudiantes mayores de edad");
            System.out.print("\nDeseas continuar (S/N) ? "); resp =Character.toUpperCase(obj.next().charAt(0));

        } while(resp != 'N');
        System.out.println("\nGracias por utilizar este programa");
        
    
        
    }
    

}
