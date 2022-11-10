package SistemaClinico_DC;

public class PagoPaypal implements Pago{
    
    protected float monto;
    protected String email;

    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public PagoPaypal(){}
    public boolean RealizarPago(float monto){
        return true;
    }
}
