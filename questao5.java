import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosBrancos = 0;
        int votosNulos = 0;
        int totalEleitores = 0;

        String[] nomesCandidatos = {
            "Natália Bonavides (PT) - 13", 
            "Carlos Cabeçote (PSD) - 12", 
            "Paulinho Pakita (União) - 44", 
            "Voto em Branco - 1",
            "Voto Nulo - 0",
            "Para encerrar digite: '-1'"
        };

        
        for (String nome : nomesCandidatos) {
            System.out.println(nome);
        }

        while (true) {
            System.out.print("Digite o voto: ");
            
            if (scanner.hasNextInt()) {
                int voto = scanner.nextInt();

                if (voto == -1) {
                    break;
                }

                totalEleitores++;

                switch (voto) {
                    case 13:
                        votosCandidato1++;
                        break;
                    case 12:
                        votosCandidato2++;
                        break;
                    case 44:
                        votosCandidato3++;
                        break;
                    case 1:
                        votosBrancos++;
                        break;
                    case 0:
                        votosNulos++;
                        break;
                    default:
                        System.out.println("Voto inválido.");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); 
            }
        }

        scanner.close();


        int maiorVotos = Math.max(votosCandidato1, Math.max(votosCandidato2, votosCandidato3));
        int numeroCandidatosVencedores = 0;
        String candidatosSegundoTurno = "";

        if (votosCandidato1 == maiorVotos) {
            numeroCandidatosVencedores++;
            candidatosSegundoTurno += "Natália Bonavides (PT) - 13 ";
        }
        if (votosCandidato2 == maiorVotos) {
            numeroCandidatosVencedores++;
            candidatosSegundoTurno += "Carlos Cabeçote (PSD) - 12 ";
        }
        if (votosCandidato3 == maiorVotos) {
            numeroCandidatosVencedores++;
            candidatosSegundoTurno += "Paulinho Pakita (União) - 44 ";
        }

        if (numeroCandidatosVencedores > 1) {
            System.out.println("A eleição terá segundo turno entre: " + candidatosSegundoTurno.trim());
        } else {
            int candidatoVencedor = (votosCandidato1 == maiorVotos) ? 1 :
                                    (votosCandidato2 == maiorVotos) ? 2 : 3;
            System.out.println("O número do candidato vencedor: " + candidatoVencedor + " (" + nomesCandidatos[candidatoVencedor - 1] + ")");
        }

        System.out.println("O número de votos em branco: " + votosBrancos);
        System.out.println("O número de votos nulos: " + votosNulos);
        System.out.println("O número de eleitores que votaram: " + totalEleitores);
    }
}
