import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    static void main() {
        int numeroAleatorio = new Random().nextInt(101); // para gerar um num aleatorio
        Scanner leitor = new Scanner(System.in);
        int tentativas = 0;
        int numeroDigitado = -1;

        while (numeroDigitado != numeroAleatorio) {
            System.out.println("Digite um número aleatório de 0 a 100:");
            numeroDigitado = leitor.nextInt();
            tentativas ++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.printf(
                        "Parabéns, você acertou o número em %d, %s%n",
                        tentativas,
                        tentativas == 1 ? "tentativa" : "tentativas");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número aleatório é maior.");
            } else {
                System.out.println("O número aleatório é menor.");
            }



        }



    }
}
