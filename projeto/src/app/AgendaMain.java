package app;
import classes.*;
//import javax.swing.JOptionPane;

//import java.awt.GriphicsConfiguration;
//import javax.swing.JFrame;

public class AgendaMain {
    //static GraphicsConfiguration gc;
    public static void main(String[] args) throws Exception {

        int tipo = 1;
        String nome = "uiu";
        int fone = 999;
        String email = "uiu@uou";
        String cpf = "654.654";
        String cnpj = "6455.5644";

        switch(tipo){

            case 1:
                Contatos contatosf = new Contatos();
                contatosf.setContact(fone,email);
                Pessoa pessoaf = new Fisica(nome, contatosf, cpf, tipo);
                contatosf.addContato(pessoaf);
                contatosf.toString();
                break;

            case 2: 
                Contatos contatosj = new Contatos();
                contatosj.setContact(fone);
                Pessoa pessoaj = new Juridica(nome, contatosj, cnpj, tipo);
                contatosj.addContato(pessoaj);
                contatosj.toString();
                break;
        }
        //JFrame.setDefaultLookAndFeelDecorated(true);
        //JFrame frame = new JFrame("main");
        //JFrame frame = new JFrame(gc);
        //frame.setTitle("Agenda");
        //frame.setSize(960,600);
        //frame.setVisible(true);
    }
}