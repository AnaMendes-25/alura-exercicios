import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro entre 1 e 10:");
        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado > 0 && numeroDigitado < 11) {
            for (int i = 1; i < 11; i++) {
                System.out.println(numeroDigitado + " x " + i + " = " + (numeroDigitado * i));
            }
        } else {
            System.out.println("Número inválido.");
        }
    }
}
