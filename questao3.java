import java.text.DecimalFormat;

public class questao3 {
    public static void main(String[] args) {
        
        int[] identificacao = new int[90];
        double[] peso = new double[90];

        for (int i = 0; i < 90; i++) {
            identificacao[i] = i + 1;
            peso[i] = Math.random() * 1000 + 500; // gerar pesos aleatório entre 500 e 1500 kg
        }

        int idMaisGordo = 0;
        int idMaisMagro = 0;
        double pesoMaisGordo = 0;
        double pesoMaisMagro = Double.MAX_VALUE;

        for (int i = 0; i < 90; i++) {
            if (peso[i] > pesoMaisGordo) {
                pesoMaisGordo = peso[i];
                idMaisGordo = identificacao[i];
            }
            if (peso[i] < pesoMaisMagro) {
                pesoMaisMagro = peso[i];
                idMaisMagro = identificacao[i];
            }
        }

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Boi mais gordo:");
        System.out.println("ID: " + idMaisGordo + " Peso: " + df.format(pesoMaisGordo) + " kg");
        System.out.println("Boi mais magro:");
        System.out.println("ID: " + idMaisMagro + " Peso: " + df.format(pesoMaisMagro) + " kg");

    }
}
