package classes;    

public class Juridica extends Contatos{
    public Juridica(String nome, Contatos contato, String cnpj, int tipo){
        super.nome = nome;
        super.contatos = contato;
        super.code = cnpj;
        super.setTipo(tipo);
    }

    public String getCNPJ(){
        return super.code;
    }
}