
package animal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class cadastroAnimal {
    public static Scanner sc = new Scanner(System.in);
     public static Map<String, String[]> animal = new HashMap<>();
     public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nSISTEMA DE CADASTRO DE ANIMAL");
            System.out.println("1 - Cadastrar novo animal");
            System.out.println("2 - Mostrar animal ");
            System.out.println("3 - Exclui animal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    mostrarAnimal();
                    break;
                case 3:
                    excluirAnimal();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            } while (opcao != 0);
    
}
      public static void cadastrarAnimal() {
        System.out.println("\nCADASTRO DE ANIMAL");
        System.out.println("Nome do Animal ");
        String nome = sc.nextLine();
        System.out.println("Idade");
        int idade =sc.nextInt();
        System.out.println("Raça");
        String raca = sc.nextLine();
        System.out.println("Sexo");
        String sexo = sc.nextLine();
        System.out.println("Cor");
        String cor = sc.nextLine();
        System.out.println("Digite id do abrigo:");
        int id =sc.nextInt();
         
      }
      public static void mostrarAnimal(){
            System.out.println("\n=== LISTA DE ANIMAIS CADASTRADOS ===");

        if (animal.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Map.Entry<String, String[]> entry : animal.entrySet()) {
                String nome = entry.getKey();
                String[] dados = entry.getValue();

                System.out.println("\nNome: " + nome);
                System.out.println("Idade: " + dados[0]);
                System.out.println("Raça: " + dados[1]);
                System.out.println("Sexo: " + dados[2]);
                System.out.println("Cor: " + dados[3]);
                System.out.println("ID do abrigo: " + dados[4]);
            }
        }
    }
          

      
      
      public static void excluirAnimal(){
        System.out.println("Nome do animal a ser excluído:\n");
        String nome = sc.nextLine();
        if(animal.containsKey(nome)){
            animal.remove(nome);
         System.out.println("Animal'"+nome+"'removido com sucesso");   
           
        } else {
             System.out.println("Animal não encontrado");
            
        }    
    
} 
}