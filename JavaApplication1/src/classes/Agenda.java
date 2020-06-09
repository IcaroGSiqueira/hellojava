package classes;

import java.util.ArrayList;

public abstract class Agenda{
    protected ArrayList<Pessoa> lista = new ArrayList<>();
    
    abstract void addContato(Pessoa contato);

    abstract void rmvContato(Pessoa contato);
}