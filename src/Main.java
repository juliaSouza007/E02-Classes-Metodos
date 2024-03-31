import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.agencia = "222-3";
        minhaConta.numero = 1234;
        minhaConta.saldo = 15000;
        minhaConta.limite = 25000;
        
        int executar;
        
        Scanner input = new Scanner(System.in);

        System.out.println("SITE OFICIAL BANCO JMS\n Cadastrar Cliente:");
        minhaConta.donoConta.cadastrarCliente();
        
        do {
            System.out.println("\n\nSITE OFICIAL BANCO JMS\n O que deseja fazer?");
            System.out.println("[1] Deposito\n[2] Saque\n[3] Imprimir Infos\n[0] Sair");
            
            executar = input.nextInt();
            
            switch (executar) {
                case 1:
                    int valorDep;
                    
                    System.out.println("\nQual o valor do deposito?");
                    valorDep = input.nextInt();
                    
                    boolean depositoRealizado = minhaConta.depositar(valorDep);
            
                    if (depositoRealizado) {
                        System.out.println("Deposito realizado com sucesso!");
                        System.out.println("Saldo atual: " +minhaConta.saldo);
                    } else {
                        System.out.println("Erro ao depositar...");
                    }
                break;
                
                case 2:
                    int valorSaq;
                    
                    System.out.println("\nQual o valor do saque?");
                    valorSaq = input.nextInt();
                    
                    boolean saqueRealizado = minhaConta.sacar(valorSaq);
            
                    if (saqueRealizado) {
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo atual: " +minhaConta.saldo);
                    } else {
                        System.out.println("Erro ao sacar...");
                    }
                break;
                
                case 3:
                
                    System.out.println("\nImprimindo informacoes:");
                    minhaConta.imprimir();
                    break;
                
                case 0:
                break;
            }
        } while (executar!=0);
    }
}
