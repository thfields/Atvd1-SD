
import java.text.DecimalFormat;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        System.err.println("Calcular o IMC");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em quilos: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Seu IMC é: " + df.format(imc));
        
        System.err.println("Com base no seu IMC, você está: ");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
