package SistemaClinico_DC;

import java.util.ArrayList;

public class HistoriaClinica {
    
    protected int nro;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;


    public int getNro() {
        return nro;
    }


    public void setNro(int nro) {
        this.nro = nro;
    }


    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }


    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }


    public ArrayList<String> getAlergias() {
        return alergias;
    }


    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }


    public ArrayList<String> getOtros() {
        return otros;
    }


    public void setOtros(ArrayList<String> otros) {
        this.otros = otros;
    }


    public HistoriaClinica(){

    }
}
