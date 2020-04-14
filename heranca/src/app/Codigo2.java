package app;
import classes.*;

public class Codigo2 {
    public static void main(String[] args) throws Exception {
        
        Carro camaro = new Carro("Chevrolet");
        Carro fusca = new Carro("Volkswagen");
        Carro uno = new Carro("Fiat");
        Moto cg = new Moto("Honda");

        cg.ligar();
        fusca.ligar();
        uno.ligar();
        camaro.ligar();

        camaro.arCondicionado();
        fusca.bancoCouro();
        uno.tamanhoPortaMalas(30);

        camaro.marchaRe();
        
    }
}