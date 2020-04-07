package app;

public class Veiculo {
    private String marca;
    private String nome;
    private double valor;
    private double consumo;
    private boolean ligado;
    
    public void ligar () {
        ligado = true;
    }
    
    public void desligar() {
        ligado = false;
    }
}