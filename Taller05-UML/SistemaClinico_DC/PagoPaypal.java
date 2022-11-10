package SistemaClinico_DC;

public class PagoPaypal implements Pago{
    
    protected float monto;
    protected String email;

    public PagoPaypal(){}
    public boolean RealizarPago(float monto){
        return true;
    }
}
