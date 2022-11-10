package SistemaClinico_DC;

import java.util.ArrayList;

public class Paciente extends Persona{
    
    protected String email;

    protected ArrayList<Receta> recetas;
    protected ArrayList<HistoriaClinica> historiaClinica;
    protected ArrayList<Cita> cita;

    public Paciente(){
        recetas = new ArrayList<Receta>();
        historiaClinica = new ArrayList<HistoriaClinica>();
    }

    public boolean SolicitarCita(){
        return true;
    }
    

}
