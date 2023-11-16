package _p147_TercerExamenParcial;
import java.io.Serializable;

public class Jugador implements Serializable {
    String Nombre;
    int Edad;
    char Sexo;
    String EstadoCivil;
    String Descripcion;
    double Salario;

    public Jugador() {}
    public Jugador(String nombre, int edad, char sexo, String estadocivil, String Descripcion, double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstadoCivil = estadocivil;
        Salario = salario;
    }
    public String getNombre() {
        return  Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public double getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadocivil) {
        EstadoCivil= estadocivil;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descipcion) {
        Descripcion = descipcion;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
}