package classes;

public class Pessoa{
    public Pessoa(String nome) {
    }

    public void locomover(Veiculo veiculo){ 
        if(veiculo instanceof Carro){
            System.out.println("Estou me locomovendo de Carro");
        }
        else if(veiculo instanceof Moto){
            System.out.println("Estou me locomovendo de Moto");
        }
        else
            System.out.println("Estou me locomovendo");
    }

}