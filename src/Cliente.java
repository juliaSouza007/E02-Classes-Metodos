import java.util.Scanner;

public class Cliente {
    
    String nome;
    String cpf;
    String endereco;
    int idade;
    char sexo;
    
    Scanner input = new Scanner(System.in);
    
    void cadastrarCliente(){
        System.out.print("Nome: ");
        nome = input.nextLine();
        
        System.out.print("CPF: ");
        cpf = input.nextLine();
        
        System.out.print("Endereco: ");
        endereco = input.nextLine();
        
        System.out.print("Idade: ");
        idade = input.nextInt();
        
        System.out.print("Sexo(m ou f): ");
        sexo = input.next().charAt(0);
    }
    
    void imprimirDados(){
        System.out.println("Nome: " +nome);
        System.out.println("CPF: " +cpf);
        System.out.println("Endereco: " +endereco);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo+ "\n");
    }
}
