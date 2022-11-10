package SistemaClinico_DC;

import java.util.Date;


public class PagoTarjeta implements Pago{
    
    protected String numero;
    protected String propietario;
    protected String banco;
    protected float monto;
    protected Date expira;

    public PagoTarjeta(){}
    public boolean RealizarPago(float monto){
        return true;
    }
}
