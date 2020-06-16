package classes;

import java.util.ArrayList;

/**
 *
 * @author icaro
 */
public class Contatos extends Pessoa{

    /**
     *
     */
    protected int fone;

    /**
     *
     */
    protected String email;

    /**
     *
     */
    protected ArrayList<Pessoa> lista = new ArrayList<>();

    /**
     *
     * @param fone
     */
    @Override
    public void setContact(int fone) {
        this.fone = fone;
    }

    /**
     *
     * @param email
     */
    @Override
    public void setContact(String email) {
        this.email = email;
    }

    /**
     *
     * @param fone
     * @param email
     */
    @Override
    public void setContact(int fone, String email) {
        this.email = email;
        this.fone = fone;
    }

    /**
     *
     * @return
     */
    public int getFone() {
        return this.fone;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * @return
     */
    public String getContact() {
        return this.email + ";" + this.fone;
    }

    /**
     *
     * @param contato
     */
    @Override
    public void addContato(Pessoa contato) {
        lista.add(contato);
    }

    /**
     *
     * @param contato
     */
    @Override
    public void rmvContato(Pessoa contato) {
        lista.remove(contato);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return this.lista.toString() + "\n";
    }
}