package classes;

public class Veiculo{
    private String marca;
    private String nome;
    private double valor;
    private double consumo;
    private boolean ligado;

    public void ligar(){
        this.ligado = true;
    }
    
    public void desligar(){
        this.ligado = false;
    }
}