package abrigo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cadastroAbrigo {
    public static Scanner sc = new Scanner(System.in);
    public static Map<String, String[]> abrigos = new HashMap<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nSISTEMA DE CADASTRO DE ABRIGO");
            System.out.println("1 - Cadastrar novo abrigo");
            System.out.println("2 - Excluir abrigo");
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
        } while (opcao != 0);
    }

    public static void cadastrarAbrigo() {
        System.out.print("Digite o nome do abrigo: ");
        String nome = sc.nextLine();

        if (abrigos.containsKey(nome)) {
            System.out.println("Abrigo já cadastrado!");
            return;
        }

        System.out.print("Digite o endereço do abrigo: ");
        String endereco = sc.nextLine();

        System.out.print("Digite o telefone do abrigo: ");
        String telefone = sc.nextLine();

        // Armazenando os dados do abrigo em um array de Strings
        String[] dados = { endereco, telefone };
        abrigos.put(nome, dados);

        System.out.println("Abrigo cadastrado com sucesso!");
    }

    public static void excluirAbrigo() {
        System.out.print("Digite o nome do abrigo que deseja excluir: ");
        String nome = sc.nextLine();

        if (abrigos.remove(nome) != null) {
            System.out.println("Abrigo excluído com sucesso!");
        } else {
            System.out.println("Abrigo não encontrado.");
        }
    }
}