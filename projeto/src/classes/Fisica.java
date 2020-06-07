package classes;

public class Fisica extends Contatos{
    public Fisica(String nome, Contatos contato, String cpf, int tipo){
        super.nome = nome;
        super.contatos = contato;
        super.code = cpf;
        super.setTipo(tipo);
    }

    public String getCPF(){
        return super.code;
    }
}