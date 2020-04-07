package app;

public class ContaCorrente {
    //private double saldo = 50;
    private double saldo;

    public ContaCorrente(){
        this.saldo = 0;
    }

    public ContaCorrente(double valor){
        this.saldo = valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    /*
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    */

    public double depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
        return saldo;
    }

    public double sacar(double valor) {
        if(valor <= saldo){
            saldo = saldo - valor;
        }
        return saldo;
    }
}