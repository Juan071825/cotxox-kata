package edu.teamrocket.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones;


    public Conductor(){};

    public Conductor(String nombre){
        this.nombre = nombre;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setValoracion(byte valoracion){
        valoraciones.add(valoracion);
    }

    public int getNumeroValoraciones(){
        return valoraciones.size();
    }

    public ArrayList<Byte> getValoraciones() {
        return this.valoraciones;
    }

    private double calcularValoracionMedia(){
        return valoraciones.stream().mapToInt(Byte::intValue).sum() 
             / getNumeroValoraciones();
    }

    public void setValoracion() {
        this.valoracionMedia = calcularValoracionMedia();
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public void setOcupado(boolean estado) {
        this.ocupado = estado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

}
