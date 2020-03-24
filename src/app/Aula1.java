package app;

/*import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
*/

public class Aula1 {
    public static void main(final String[] args) throws Exception {

        final ContaCorrente guilherme = new ContaCorrente();
        //guilherme.saldo = 400;
        System.out.println(guilherme.getSaldo());
        guilherme.depositar(400);
        System.out.println(guilherme.getSaldo());
        guilherme.sacar(500);
        System.out.println(guilherme.getSaldo());

        final ContaCorrente matheus = new ContaCorrente();
        //matheus.saldo = 500;
        System.out.println(matheus.getSaldo());
        matheus.depositar(500);
        System.out.println(matheus.getSaldo());
        matheus.sacar(350);
        System.out.println(matheus.getSaldo());
        
        /*final String teste = new String("Meu Teste de String");

        System.out.println(teste);

        // JFrame frame = new JFrame("InputDialog1");
        // String name = JOptionPane.showInputDialog(frame, "Digite seu nome: ");
        final String name = JOptionPane.showInputDialog("Digite seu nome: ");

        final int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição: "));

        System.out.println(name);

        System.out.println(pos);

        final int leng = name.length();
        System.out.println(leng);

        //System.out.println(name.charAt(pos));

        if((pos-1) < leng){
            final char test = name.charAt((pos-1));
            System.out.println(test);
        } else {
            System.out.println("ERRO!");
        }

        final Integer numero = new Integer(4);
        final Integer n2 = new Integer("5");

        System.out.println(numero);
        System.out.println(n2);*/
    }
}