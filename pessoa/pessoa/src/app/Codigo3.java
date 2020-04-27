package app;
import classes.*;

public class Codigo3 {
    public static void main(String[] args) throws Exception {
        
        Pessoa primeiro005 = new Pessoa("Primeiro5");
        Pessoa segundo005 = new Pessoa("Segundo5");
        Pessoa terceiro005 = new Pessoa("Terceiro5");

        PessoaFisica primeiro006 = new PessoaFisica("Primeiro6","123456");
        PessoaFisica segundo006 = new PessoaFisica("Segundo6","023456");
        PessoaFisica terceiro006 = new PessoaFisica("Terdeiro6","003456");
        
        Estudante primeiro007 = new Estudante("Primeiro7","234567",7.3);
        Estudante segundo007 = new Estudante("Segundo7","034567",8.3);
        Estudante terceiro007 = new Estudante("Terceiro7","004567",7.9);
    }
}