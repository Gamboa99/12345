package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;
    public Equipo() {
        Jugadores = new ArrayList<>();
    }
    public Equipo(String nombre, String liga) {
        this(); 
        Nombre = nombre;
        Liga = liga;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getLiga() {
        return Liga;
    }
    public void setLiga(String liga) {
        Liga = liga;
    }
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.Jugadores = jugadores;
    }
    
    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + liga ", Jugadores=" + jugadores + "]";
    }
    
}
