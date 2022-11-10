package SistemaClinico_DC;

public class PagoEfectivo implements Pago{
    protected float monto;
    
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public PagoEfectivo(){}
    
    public boolean RealizarPago(float monto){
        return true;
    }
}
