package app;
import classes.*;

import javax.swing.*;
import java.awt.*;

public class AgendaMain {
    static JTextField textfield1, textfield2, textfield3;
    public static void main(String[] args) throws Exception {

        int tipo = 1;
        String nome = "0";
        int fone = 0;
        String email = "0";
        String cpf = "0";
        String cnpj = "0";

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("main");
        //String nome = JOptionPane.showInputDialog("Digite o Nome: ");
        frame.setTitle("Agenda");
        frame.setSize(960,600);

        frame.getContentPane().setLayout(new FlowLayout());
        textfield1 = new JTextField("Text field 1",10);
        textfield2 = new JTextField("Text field 2",10);
        textfield3 = new JTextField("Text field 3",10);
        frame.getContentPane().add(textfield1);
        frame.getContentPane().add(textfield2);
        frame.getContentPane().add(textfield3);
       
        frame.pack();
        
        frame.setVisible(true);

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
    }
}