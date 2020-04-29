package classes;    

public class Cliente{
    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" + "CPF: " + this.cpf + "\n" + "E-mail: " + this.email;
    }
}