package abrigo;
import static animal.cadastroAnimal.sc;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static usuario.cadastroUsuario.cadastrarUsuario;
import static usuario.cadastroUsuario.login;

public class cadastroAbrigo {
     public static Scanner sc = new Scanner(System.in);
     public static Map<String, String[]> animal = new HashMap<>();
     public static void main(String[] args) {
        int opcao;
         do {
            System.out.println("\nSISTEMA DE CADASTRO DE ABRIGO");
            System.out.println("1 - Cadastrar novo abrigo");
            System.out.println("2 - Exclui abrigo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            switch (opcao) {
                case 1:
                    cadastrarAbrigo();
                    break;
                case 2:
                    excluirAbrigo();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
    
}
