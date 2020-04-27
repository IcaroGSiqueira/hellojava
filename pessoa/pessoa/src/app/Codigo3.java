package app;
import classes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Codigo3 {
    public static void main(String[] args) throws Exception{ 
        Scanner read = new Scanner(System.in);

/*
        System.out.println("Digite o nome: ");
        String nome0 = read.nextLine();
        Pessoa h0 = new Pessoa(nome0);
        //System.out.println(h0.getNome());
        System.out.println(h0.toString());

 

        System.out.println("Digite o nome: ");
        String nome1 = read.nextLine();
        System.out.println("Digite o cpf: ");
        String cpf1 = read.nextLine();
        PessoaFisica h1 = new PessoaFisica(nome1, cpf1);
        System.out.println(h1.getNome());
        System.out.println(h1.getCpf());

        ArrayList<PessoaFisica> cadastro = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Digite o nome: ");
            String nome2 = read.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf2 = read.nextLine();
            PessoaFisica h2 = new PessoaFisica(nome2, cpf2);
            cadastro.add(h2);
        }
        System.out.println("Digite uma inicial para pesquisa: ");
        String inicial = read.nextLine();
        for(PessoaFisica h : cadastro){
            if(h.getNome().startsWith(inicial)){
                System.out.println(h.toString());
            }
        }
        


        System.out.println("Digite o nome: ");
        String nome3 = read.nextLine();
        System.out.println("Digite o cpf: ");     
        String cpf3 = read.nextLine();
        Estudante estudante0 = new Estudante(nome3, cpf3);
        System.out.println("Digite as notas: ");
        double p1 = read.nextDouble();
        double p2 = read.nextDouble();
        estudante0.setMedia(estudante0.calcMedia(p1, p2));
        System.out.println(estudante0.toString());

        ArrayList<Estudante> matricula = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Digite o nome: "); 
            String nome4 = read.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf4 = read.nextLine();
            Estudante estudante1 = new Estudante(nome4, cpf4);     
            System.out.println("Digite as notas: "); 
            double p3 = read.nextDouble();
            double p4 = read.nextDouble();
            estudante1.setMedia(estudante1.calcMedia(p3, p4));
            matricula.add(estudante1);
        }
        System.out.println("Digite uma média para pesquisa: "); 
        double media = read.nextDouble();
        for(Estudante st : matricula){
            if(st.getMedia() > media){
                System.out.println(st.toString());
            }
        }
        */

        Boolean teste = true;
        ArrayList<Estudante> matricula2 = new ArrayList<>();
        while(teste){
            read.nextLine();
            System.out.println("Digite o nome: ");
            String nome5 = read.nextLine();
            System.out.println("Digite o cpf: ");
            String cpf5 = read.nextLine();
            Estudante estudante2 = new Estudante(nome5, cpf5);  
            System.out.println("Digite as notas: "); 
            double p5 = read.nextDouble();
            double p6 = read.nextDouble();
            estudante2.setMedia(estudante2.calcMedia(p5, p6));
            matricula2.add(estudante2);
            if(nome5 == "Fim" || nome5 == "FIM" || nome5 == "fim"){
                teste = false;
            }
        }
        ArrayList<Estudante> aprovados = new ArrayList<>();
        for(Estudante estud  : matricula2){
            if(estud.getMedia() > 7){
                aprovados.add(estud);   
            }
        }
        System.out.println(aprovados.toString()); // Inicio do exercicio 04 - Fim de lista 007 */
    }
}