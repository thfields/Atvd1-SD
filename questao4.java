import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade < 18) {
            System.out.println("Menor");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Maior");
        } else {
            System.out.println("Idoso");
        }
        
        scanner.close();
    }
}
