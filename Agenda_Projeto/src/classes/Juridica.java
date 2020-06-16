package classes;    

public class Juridica extends Pessoa{
    public Juridica(String nome, Contatos contato, String cnpj, int tipo){
        super.nome = nome;
        super.contatos = contato;
        super.code = cnpj;
        super.setTipo(tipo);
    }

    public String getCNPJ(){
        return super.code;
    }

    @Override
    void addContato(Pessoa contato) {
        // TODO Auto-generated method stub

    }

    @Override
    void rmvContato(Pessoa contato) {
        // TODO Auto-generated method stub

    }
}