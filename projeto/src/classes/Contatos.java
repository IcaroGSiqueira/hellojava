package classes;

import java.util.ArrayList;

public class Contatos extends Pessoa{
    protected int fone;
    protected String email;

    protected ArrayList<Pessoa> lista = new ArrayList<>();

    @Override
    public void setContact(int fone) {
        this.fone = fone;
    }

    @Override
    public void setContact(String email) {
        this.email = email;
    }

    @Override
    public void setContact(int fone, String email) {
        this.email = email;
        this.fone = fone;
    }

    public int getFone() {
        return this.fone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getContact() {
        return this.email + ";" + this.fone;
    }

    @Override
    public void addContato(Pessoa contato) {
        lista.add(contato);
    }

    @Override
    public void rmvContato(Pessoa contato) {
        lista.remove(contato);
    }

    @Override
    public String toString(){
        return lista.toString() + "\n";
    }
}