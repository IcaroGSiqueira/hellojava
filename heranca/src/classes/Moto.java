package classes;

public class Moto extends Veiculo{
    private boolean travada;

    public Moto(String marca) {
        super(marca);
    }

    public void maneabilidade(String maneabilidade) {
    }

    public void exigeCapacete() {
    }

    public void travar(){
        this.travada = true;
    }
    
    public void destravar(){
        this.travada = false;
    }

    @Override
    public String toString(){
        return "Marca: " + "a" + "Está travada: " + this.travada;
    }

}