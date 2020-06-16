package classes;

/**
 *
 * @author icaro
 */
public abstract class Contatos implements Contato{

    protected int fone;

    protected String email;

    public void setContact(int fone) {
        this.fone = fone;
    }

    public void setContact(String email) {
        this.email = email;
    }

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
}