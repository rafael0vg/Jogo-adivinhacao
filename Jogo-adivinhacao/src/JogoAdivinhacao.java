import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // O computador escolhe um número entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int contadorTentativas = 0;

        System.out.println("========================================");
        System.out.println("🎯 BEM-VINDO AO JOGO DE ADIVINHAÇÃO! 🎯");
        System.out.println("Eu pensei em um número entre 1 e 100.");
        System.out.println("Tente adivinhar qual é!");
        System.out.println("========================================");

        // O laço continua até o usuário acertar o número
        while (tentativa != numeroSecreto) {
            System.out.print("Digite o seu palpite: ");
            tentativa = scanner.nextInt();
            contadorTentativas++; // Soma 1 ao total de tentativas

            if (tentativa < numeroSecreto) {
                System.out.println("❌ Errou! O número secreto é MAIOR.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("❌ Errou! O número secreto é MENOR.");
            } else {
                System.out.println("\n🎉 PARABÉNS! Você acertou!");
                System.out.println("O número secreto era: " + numeroSecreto);
                System.out.println("Você precisou de " + contadorTentativas + " tentativas para vencer.");
            }
            System.out.println("----------------------------------------");
        }

        scanner.close();
    }
}