package SistemaClinico_DC;

import java.util.Date;


public class PagoTarjeta implements Pago{
    
    protected String numero;
    protected String propietario;
    protected String banco;
    protected float monto;
    protected Date expira;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public Date getExpira() {
        return expira;
    }
    public void setExpira(Date expira) {
        this.expira = expira;
    }
    public PagoTarjeta(){}
    public boolean RealizarPago(float monto){
        return true;
    }
}
