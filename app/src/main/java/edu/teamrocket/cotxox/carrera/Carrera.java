package edu.teamrocket.cotxox.carrera;

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

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    public int getPropina() {
        return this.propina;
    }
    


    public void asignarConductor(PoolConductores conductor){};

    public void realizarPago(double costeTotal){};

    public void recibirPropina(int propina){};

    public void liberarConductor();


}
