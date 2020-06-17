package classes;

/**
 *
 * @author icaro
 */
public class Contatos implements Contato{

    protected int fone;

    protected String email;

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

    @Override
    public String toString() {
        return "Email: " + this.email + "\n" + "Fone: " + this.fone + "\n";
    }
}