package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario , int subordinados , int proyectos){
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    public int getSubordinados(){
        return Subordinados;
    }
    public int setSubordinados(int subordinados){
        Subordinados = subordinados;
    }
    
}
