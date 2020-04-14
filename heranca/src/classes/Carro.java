package classes;    

public class Carro extends Veiculo{
    private boolean arCondicionado;
    private boolean bancoCouro;
    private int tamanhoPortaMalas;

    public Carro(String marca){
        super(marca);
    }
    
    public void arCondicionado(){
        this.arCondicionado = true;
    }

    public void bancoCouro(){
        this.bancoCouro = true;
    }

    public void tamanhoPortaMalas(int tamanho){
        this.tamanhoPortaMalas = tamanho;
    }

    public void marchaRe(){
        System.out.println("O carro está andando de ré.");
    }
}