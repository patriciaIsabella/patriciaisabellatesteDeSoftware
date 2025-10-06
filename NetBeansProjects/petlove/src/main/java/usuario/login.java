package usuario;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class login {
    public static void realizarLogin(Map<String, String[]> usuarios, Scanner sc) {
        System.out.println("\nLOGIN");

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        String[] dados = usuarios.get(email);
        if (dados != null && dados[1].equals(senha)) {
            System.out.println("Login realizado. Bem-vindo, " + dados[0] + "!");
            System.out.println("Dados: Idade: " + dados[2] + ", Telefone: " + dados[3] + ", Endereço: " + dados[4]);
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }
} 

