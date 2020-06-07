package classes;

public abstract class Pessoa extends Agenda implements Contato{

    protected String nome;
    protected Contatos contatos;
    protected String code;
    protected String type;

    public String getNome() {
        return this.nome;
    }

    public void setTipo(int tipo){
        if(tipo == 1)
            this.type = "Pessoa Física";
        else
            this.type = "Pessoa Jurídica";
    }

    public String toString(){
        return "\n" + "Tipo:" + this.type + "\n" + "Nome: " + this.nome + "\n" + "CPF/CNPJ: " + this.code + "\n" + "Contato: " + contatos.getContact() + "\n";
    }
} 