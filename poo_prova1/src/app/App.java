package app;
import classes.*;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception{

        Banco banco = new Banco("BancoX");

        Boolean teste = true;
        while (teste) {

            System.out.println("\nDigite 1 para Adicionar Conta Corrente");
            System.out.println("Digite 2 para Remover Conta Corrente");
            System.out.println("Digite 3 para Depositar");
            System.out.println("Digite 4 para Sacar");
            System.out.println("Digite 5 para Imprimir Contas Correntes");
            System.out.println("Digite 0 para Encerrar\n");

            int opt = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: "));
            switch(opt){

                case 1: 

                    String nome = JOptionPane.showInputDialog("Digite o Nome: ");
                    String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
                    String email = JOptionPane.showInputDialog("Digite o E-mail: ");
                    String n_agencia = JOptionPane.showInputDialog("Digite o N° da Agência: ");
                    String n_conta = JOptionPane.showInputDialog("Digite o N° da Conta: ");
                    Cliente cliente = new Cliente(nome, email);
                    cliente.setCpf(cpf);
                    ContaCorrente conta = new ContaCorrente(n_agencia, n_conta, cliente);
                    banco.addConta(conta);
                    break;

                case 2: 

                    int del_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o index da conta a ser removida: "));
                    banco.delConta(del_num);
                    break;

                case 3: 

                    int dep_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o index da conta a depositar: "));
                    double valor_dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a depositar: "));
                    banco.depositar(dep_num, valor_dep);
                    break;

                case 4: 

                    int sac_num = Integer.parseInt(JOptionPane.showInputDialog("Digite o index da conta a sacar: "));
                    double valor_sac = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar: "));
                    banco.sacar(sac_num, valor_sac);
                    break;

                case 5: 

                    System.out.println(banco.toString());
                    break;

                case 0:

                    teste = false;

            }
        }
    }
}