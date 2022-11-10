package SistemaClinico_DC;

public class PagoEfectivo implements Pago{
    protected float monto;
    
    public PagoEfectivo(){}
    
    public boolean RealizarPago(float monto){
        return true;
    }
}
