public class Conta {
    
    Cliente donoConta = new Cliente();
    
    double saldo;
    double limite;
    int numero;
    String agencia;
    double valor;

    boolean depositar (double valor) {
        if (valor > 0.0 && (saldo+valor) <= limite) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar (double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    void imprimir () {
        System.out.println("Cliente:\n ");
        donoConta.imprimirDados();
        System.out.println("Numero da conta: " +numero);
        System.out.println("Saldo atual: " +saldo);
        System.out.println("Limite: " +limite);
        
        System.out.println();
    }
}
