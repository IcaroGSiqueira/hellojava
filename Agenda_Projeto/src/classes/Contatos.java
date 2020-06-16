package classes;

/**
 *
 * @author icaro
 */
public class Contatos implements Contato{

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

    public String toString() {
        return "Email: " + this.email + "\n" + "Fone: " + this.fone + "\n";
    }
}