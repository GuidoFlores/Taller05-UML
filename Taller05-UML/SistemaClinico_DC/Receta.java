package SistemaClinico_DC;

import java.util.ArrayList;
import java.util.Date;

public class Receta {

    protected Date fecha;
    
    protected Doctor doctor;
    protected ArrayList<PlanNutricional> planNut;
    protected ArrayList<Medicamento> medicamentos;
    protected Paciente paciente;
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ArrayList<PlanNutricional> getPlanNut() {
        return planNut;
    }

    public void setPlanNut(ArrayList<PlanNutricional> planNut) {
        this.planNut = planNut;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Receta(){
        planNut = new ArrayList<PlanNutricional>();
        medicamentos = new ArrayList<Medicamento>();
    }
}
