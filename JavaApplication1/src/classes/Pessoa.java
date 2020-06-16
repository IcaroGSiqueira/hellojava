package classes;

public abstract class Pessoa implements Contato{

    protected String nome;
    protected Contatos contatos;
    protected String code;
    protected String type;

    public String getNome() {
        return this.nome;
    }

    public void setTipo(int tipo){
        if(tipo == 0)
            this.type = "Pessoa Física";
        else
            this.type = "Pessoa Jurídica";
    }
    
    abstract void addContato(Pessoa contato);

    abstract void rmvContato(Pessoa contato);
    
    @Override
    public String toString(){
        return "\n" + "Tipo:" + this.type + "\n" + "Nome: " + this.nome + "\n" + "CPF/CNPJ: " + this.code + "\n" + "Contato: " + contatos.getContact() + "\n";
    }
} 