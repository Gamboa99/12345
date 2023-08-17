// Manda un saludo a la pantalla 

public class _p01_HolaMundo{
 public static void main(String[] args) {
    String amigo = "Rosa";
    String hermano = "Ricardo";
    String mensaje = String.format("Tanto %s como %s desean aprender java",amigo,hermano);

    System.out.println("Hola Mundo desde el lenguaje java");
    System.out.println("\nHola amiga " + amigo + " bienvenida a java");
    System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
    System.out.println(mensaje);
 }
}