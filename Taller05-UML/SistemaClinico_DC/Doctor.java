package SistemaClinico_DC;

import java.util.ArrayList;

public class Doctor extends Persona{
    protected int RegDoctor;
    protected String Especialidad;

    
    protected Secretaria secretariaAsignada;
    protected ArrayList<Cita> citasPendientes;
    protected ArrayList<Receta> recetas;

    public int getRegDoctor() {
        return RegDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        RegDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public Secretaria getSecretariaAsignada() {
        return secretariaAsignada;
    }

    public void setSecretariaAsignada(Secretaria secretariaAsignada) {
        this.secretariaAsignada = secretariaAsignada;
    }

    public ArrayList<Cita> getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
        this.citasPendientes = citasPendientes;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public Doctor(){

    }
    
    public void Recetar(){

    } 

    public void AgregarPlanNut(){
        
    } 

    public void ImprimirReceta(){
        
    } 

    public void RegistraSecretaria(){
        
    } 
}
