package apadrinhamento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class apadrinhamento {
    public static Scanner sc = new Scanner(System.in);
    // Mapa com chave: nome do padrinho, valor: [nome do animal, valor doado]
    public static Map<String, String[]> apadrinhamentos = new HashMap<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nSISTEMA DE APADRINHAMENTO");
            System.out.println("1 - Cadastrar apadrinhamento");
            System.out.println("2 - Excluir apadrinhamento");
            System.out.println("3 - Listar apadrinhamentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    cadastrarApadrinhamento();
                    break;
                case 2:
                    excluirApadrinhamento();
                    break;
                case 3:
                    listarApadrinhamentos();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void cadastrarApadrinhamento() {
        System.out.print("Nome do padrinho: ");
        String padrinho = sc.nextLine();

        if (apadrinhamentos.containsKey(padrinho)) {
            System.out.println("Padrinho já possui apadrinhamento cadastrado!");
            return;
        }

        System.out.print("Nome do animal apadrinhado: ");
        String animal = sc.nextLine();

        System.out.print("Valor doado: ");
        String valor = sc.nextLine();

        apadrinhamentos.put(padrinho, new String[] {animal, valor});
        System.out.println("Apadrinhamento cadastrado com sucesso!");
    }

    public static void excluirApadrinhamento() {
        System.out.print("Nome do padrinho que deseja excluir: ");
        String padrinho = sc.nextLine();

        if (apadrinhamentos.remove(padrinho) != null) {
            System.out.println("Apadrinhamento excluído com sucesso!");
        } else {
            System.out.println("Padrinho não encontrado.");
        }
    }

    public static void listarApadrinhamentos() {
        if (apadrinhamentos.isEmpty()) {
            System.out.println("Nenhum apadrinhamento cadastrado.");
            return;
        }

        System.out.println("Lista de apadrinhamentos:");
        for (Map.Entry<String, String[]> entry : apadrinhamentos.entrySet()) {
            String padrinho = entry.getKey();
            String[] dados = entry.getValue();
            System.out.println("- Padrinho: " + padrinho + " | Animal: " + dados[0] + " | Valor doado: " + dados[1]);
        }
    }
}
