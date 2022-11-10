package SistemaClinico_DC;

import java.util.ArrayList;

public class Administrador extends Persona{

    protected ArrayList<Persona> registrados;

    public ArrayList<Persona> getRegistrados() {
        return registrados;
    }

    public void setRegistrados(ArrayList<Persona> registrados) {
        this.registrados = registrados;
    }

    public Administrador(){
        
    }

    public void RegistrarUsuario(){
        //Registra a la persona
    }

    public void AsignarRol(Persona p){

    }

    
}