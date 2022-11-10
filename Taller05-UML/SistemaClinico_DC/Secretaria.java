package SistemaClinico_DC;

import java.util.ArrayList;

public class Secretaria extends Persona{
    
    protected ArrayList<Cita> cita;

    public ArrayList<Cita> getCita() {
        return cita;
    }

    public void setCita(ArrayList<Cita> cita) {
        this.cita = cita;
    }

    public Secretaria(){

    }

    public void VerificarCita(){

    }

    public void AgendarCita(){
        
    }
}
