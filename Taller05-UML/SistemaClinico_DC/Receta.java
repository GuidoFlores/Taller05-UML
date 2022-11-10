package SistemaClinico_DC;

import java.util.ArrayList;
import java.util.Date;

public class Receta {

    protected Date fecha;
    
    protected Doctor doctor;
    protected ArrayList<PlanNutricional> planNut;
    protected ArrayList<Medicamento> medicamentos;
    protected Paciente paciente;
    
    public Receta(){
        planNut = new ArrayList<PlanNutricional>();
        medicamentos = new ArrayList<Medicamento>();
    }
}
