
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
            System.out.println("1 - Cadastrar novo ANIMAL");
            System.out.println("2 - Exclui animal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
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