package app;
import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Codigo3 {
    public static void main(String[] args) throws Exception{ 
/*
        String nome0 = JOptionPane.showInputDialog("Digite o nome: ");
        Pessoa h0 = new Pessoa(nome0);
        //System.out.println(h0.getNome());
        System.out.println(h0.toString());

 

        String nome1 = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf1 = JOptionPane.showInputDialog("Digite o cpf: ");
        PessoaFisica h1 = new PessoaFisica(nome1, cpf1);
        System.out.println(h1.getNome());
        System.out.println(h1.getCpf());

        ArrayList<PessoaFisica> cadastro = new ArrayList<>();
        for(int i=0;i<5;i++){
            String nome2 = JOptionPane.showInputDialog("Digite o nome: ");
            String cpf2 = JOptionPane.showInputDialog("Digite o cpf: ");
            PessoaFisica h2 = new PessoaFisica(nome2, cpf2);
            cadastro.add(h2);
        }
        String inicial = JOptionPane.showInputDialog("Digite uma inicial para pesquisa: ");
        for(PessoaFisica h : cadastro){
            if(h.getNome().startsWith(inicial)){
                System.out.println(h.toString());
            }
        }
        


        String nome3 = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf3 = JOptionPane.showInputDialog("Digite o cpf: ");
        Estudante estudante0 = new Estudante(nome3, cpf3);
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        estudante0.setMedia(estudante0.calcMedia(p1, p2));
        System.out.println(estudante0.toString());
*/
        ArrayList<Estudante> matricula = new ArrayList<>();
        for(int i=0;i<1;i++){//////////////////////////////////////////////////////////////////////
            String nome4 = JOptionPane.showInputDialog("Digite o nome: ");
            String cpf4 = JOptionPane.showInputDialog("Digite o cpf: ");
            Estudante estudante1 = new Estudante(nome4, cpf4);
            double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
            estudante1.setMedia(estudante1.calcMedia(p3, p4));
            matricula.add(estudante1);
        }
        double media = Double.parseDouble(JOptionPane.showInputDialog("Digite uma média para pesquisa: "));
        for(Estudante st : matricula){
            if(st.getMedia() > media){
                System.out.println(st.toString());
            }
        }

        Boolean teste = true;
        ArrayList<Estudante> matricula2 = new ArrayList<>();
        while(teste){
            String nome5 = JOptionPane.showInputDialog("Digite o nome: ");
            String cpf5 = JOptionPane.showInputDialog("Digite o cpf: ");
            Estudante estudante2 = new Estudante(nome5, cpf5);  
            double p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            double p6 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
            estudante2.setMedia(estudante2.calcMedia(p5, p6));
            matricula2.add(estudante2);
            if(nome5 == "Fim" || nome5 == "FIM" || nome5 == "fim"){
                teste = false;
            }
        }
        ArrayList<Estudante> aprovados = new ArrayList<>();
        for(Estudante estudAp  : matricula2){
            if(estudAp.getMedia() > media){
                aprovados.add(estudAp);   
            }
        }
        System.out.println(aprovados.toString());
    }
}