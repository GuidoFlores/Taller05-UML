package SistemaClinico_DC;

import java.util.ArrayList;

public class Paciente extends Persona{
    
    protected String email;

    protected ArrayList<Receta> recetas;
    protected ArrayList<HistoriaClinica> historiaClinica;
    protected ArrayList<Cita> cita;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<HistoriaClinica> getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(ArrayList<HistoriaClinica> historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Cita> getCita() {
        return cita;
    }

    public void setCita(ArrayList<Cita> cita) {
        this.cita = cita;
    }

    public Paciente(){
        recetas = new ArrayList<Receta>();
        historiaClinica = new ArrayList<HistoriaClinica>();
    }

    public boolean SolicitarCita(){
        return true;
    }
    

}
