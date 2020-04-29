package classes;
import java.util.ArrayList;

public class Banco{
    private String banco;
    ArrayList<ContaCorrente> contas = new ArrayList<>();

    public Banco(String banco){
        this.banco = banco;
    }

    public String getBanco(){
        return this.banco;
    }

    public void addConta(ContaCorrente conta){
        contas.add(conta);
    }

    public void delConta(int conta){
        contas.remove(conta);
    }

    public void depositar(int cc, double valor) {
       contas.get(cc).depositar(valor);
    }

    public void sacar(int cc, double valor) {
        contas.get(cc).sacar(valor);
    }

    public int totConta() {
        int num = 0;
        for(ContaCorrente cont : contas){
            num ++;
        }
        return num;
    }
    
    @Override
    public String toString(){
        return "Banco: " + "\n" + this.banco + "\n" + contas.toString() + "\n\n";
    }
}