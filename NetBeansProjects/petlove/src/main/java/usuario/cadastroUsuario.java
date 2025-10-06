package usuario;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class cadastroUsuario {
    public static Scanner sc = new Scanner(System.in);
    // Armazenamento: email como chave, array com dados [nome, senha, idade, telefone, endereco]
   public static Map<String, String[]> usuarios = new HashMap<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nSISTEMA PADRINHOS ONLINE");
            System.out.println("1 - Cadastrar novo usuário");
            System.out.println("2 - Fazer login");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    login();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void cadastrarUsuario() {
        System.out.println("\nCADASTRO DE USUÁRIO");

        System.out.print("Nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        // Verifica email duplicado
        if (usuarios.containsKey(email)) {
            System.out.println("Email já cadastrado. Use outro.");
            return;
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("Idade: ");
        String idadeStr = sc.nextLine();
        int idade = 0;
        try {
            idade = Integer.parseInt(idadeStr);
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida. Deve ser entre 0 e 150.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida. Digite um número inteiro.");
            return;
        }

        System.out.print("Telefone (ex: (11) 99999-9999): ");
        String telefone = sc.nextLine();

        System.out.print("Endereço completo: ");
        String endereco = sc.nextLine();

        // Armazena dados no array e no mapa
        String[] dados = {nome, senha, idadeStr, telefone, endereco};
        usuarios.put(email, dados);
        System.out.println("Usuário cadastrado com sucesso.");
        System.out.println("Resumo: " + nome + " (" + idade + " anos), Email: " + email + 
                           ", Telefone: " + telefone + ", Endereço: " + endereco);
    }

   public static void login() {
    login.realizarLogin(usuarios, sc);
}
}
