package _p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripcion;
    private double Salario;

    public Jugador(String nombre,char sexo,  String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public char setSexo(){
        return Sexo;
    }
    public void setSexo(char sexo){
        Sexo = sexo;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public void setdescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public abstract double getBono();

    
}
