package classes;    

public class Estudante extends PessoaFisica{
    private double media;

    public Estudante(String nome, String cpf){
        super(nome, cpf);
        this.media = -1;
    }

    public Double getMedia(){
        return this.media;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public double calcMedia(double p1, double p2){
        return this.media = (p1 + p2)/2;
    }

    @Override
    public String toString(){
        //return "Nome: " + super.nome + "\n" + "CPF: " + super.cpf + "\n" + "Média: " + this.media;
        return "Média: " + this.media;
    }
}