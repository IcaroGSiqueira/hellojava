package classes;

import java.util.ArrayList;

public class Agenda extends Pessoa{

    protected ArrayList<Pessoa> lista = new ArrayList<>();

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
        return lista.toString();
    }
}