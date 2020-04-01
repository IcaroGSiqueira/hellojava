package app;

public class ContaCorrente {
    //private double saldo = 50;
    private double saldo;

    public ContaCorrente(int i){
        this.saldo = i;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    /*
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    */

    public double depositar(final double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
        return saldo;
    }

    public double sacar(final double valor) {
        if(valor <= saldo){
            saldo = saldo - valor;
        }
        return saldo;
    }
}