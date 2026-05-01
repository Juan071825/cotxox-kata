package edu.teamrocket.cotxox.carrera;

import edu.teamrocket.cotxox.conductores.Conductor;
import edu.teamrocket.cotxox.conductores.PoolConductores;

public class Carrera {
    
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;
    private Conductor conductor;


    public Carrera(String tarjetaCredito){

        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }


    public double getCosteTotal() {
        return getCosteEsperado() + getPropina();
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    
    public double getCosteEsperado(){
        return Tarifa.getInstancia().CosteTotalEsperado(this);
    }


    public void asignarConductor(PoolConductores conductores){
       this.conductor = conductores.asignarConductor();
    };


    public Conductor getConductor() {
        return this.conductor;
    }


    public void realizarPago(double costeTotal){

    };

    public void recibirPropina(int propina){
        this.propina = propina;
    };

    public int getPropina(){
        return this.propina;
    }

    public void liberarConductor(){
        getConductor().setOcupado(false);
    }


}
