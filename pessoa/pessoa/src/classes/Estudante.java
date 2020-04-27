package classes;    

public class Estudante extends PessoaFisica{
    private Double media;

    public Estudante(String nome, String cpf, double media){
        super(nome);
        super(cpf);
        this.media = media;
    }

    public String toString(){
        return "Nome: " + super.nome + "\n" + "CPF: " + super.cpf + "\n" + "Média: " + this.media;
    }
}