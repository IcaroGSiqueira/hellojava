package classes;

public class ContaCorrente{
    private String n_agencia;
    private String n_conta;
    private Cliente cliente;
    private double saldo;

    public ContaCorrente(String n_agencia, String n_conta, Cliente cliente){
        this.n_agencia = n_agencia;
        this.n_conta = n_conta;
        this.cliente = cliente;
        this.saldo = 0;
    }

    protected Boolean sacar(double valor) {
        if(valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        else{
            return false;
        }
    }

    protected Boolean depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        }
        else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
    
    @Override
    public String toString(){
        return "Nome: " + cliente.getNome() + "\n" + "CPF: " + cliente.getCpf() + "\n" + "E-mail: " + cliente.getEmail() + "\n" + "Agência: " + this.n_agencia + "\n" + "Conta: " + this.n_conta + "\n" + "Saldo: " + this.saldo;
    }
}