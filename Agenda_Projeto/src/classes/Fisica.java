package classes;

public class Fisica extends Pessoa{
    public Fisica(String nome, Contatos contato, String cpf, int tipo){
        super.nome = nome;
        super.contatos = contato;
        super.code = cpf;
        super.setTipo(tipo);
    }

    public String getCPF(){
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