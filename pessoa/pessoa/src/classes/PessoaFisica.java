package classes;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + super.nome + "\n" + "CPF: " + this.cpf;
    }

}