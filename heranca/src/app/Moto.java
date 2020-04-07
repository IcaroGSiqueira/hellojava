package app;

public class Moto extends Veiculo{
    private boolean exigeCapacete;
     private String maneabilidade;
     private boolean travada;
    
     public void travar () {
         travada = true;
     }
    
     public void destravar () {
         travada = false;
     }

}