package edu.teamrocket.cotxox.conductores;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;;

public class PoolConductores {

    private List<Conductor> conductores;
    
    public PoolConductores (List<Conductor> conductores){

        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores(){
        return this.conductores;
    }


    public Conductor asignarConductor(){
        List<Conductor> conductoresLibres = getPoolConductores();
        conductoresLibres.removeIf(conductor -> conductor.isOcupado() == true);
        
        if(conductoresLibres.size() == 0){
             return null;
         }     

        int indexConductor = ThreadLocalRandom.current().nextInt(0, conductoresLibres.size());
        return conductoresLibres.get(indexConductor);
    }
}
