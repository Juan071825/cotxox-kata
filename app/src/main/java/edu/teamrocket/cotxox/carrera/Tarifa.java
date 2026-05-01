package edu.teamrocket.cotxox.carrera;

public class Tarifa {


    private static Tarifa instancia;

    private final double COSTE_MILLA = 15;
    private final double COSTE_MINUTO = 1.6;
    private final double COSTE_MINIMO = 1.2;


    private Tarifa(){};


    public static Tarifa getInstancia(){

        if (instancia == null){
            instancia = new Tarifa();
        }
        return instancia;
    }



    public double getCosteDistancia(double distancia){
        return COSTE_MILLA * distancia;
    }


    public double getCosteTiempo(int tiempo){
        return COSTE_MINUTO * tiempo;
    }


    public double CosteTotalEsperado(Carrera carrera){
        return COSTE_MINIMO 
             + getCosteDistancia(carrera.getDistancia())
             + getCosteTiempo(carrera.getTiempoCarrera());
    }
}
