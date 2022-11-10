package SistemaClinico_DC;

import java.util.Date;


public class Cita {
    public Cita(){}

    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;

    protected Doctor doctor;
    protected Paciente paciente; 

    public void RealizarPago(Pago p){
        //Realiza un pago
    }
}
