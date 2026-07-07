import java.util.Scanner;

public class MenuQuadradoOuCirculo {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 1 para calcular área do quadrado ou 2 para calcular área do círculo");
        int opcao = leitor.nextInt();

        switch (opcao){

            case 1:
                System.out.println("##### ÁREA DO QUADRADO #####");
                System.out.println("Digite o tamanho do lado:");
                double ladoQuadrado = leitor.nextDouble();

                double areaQuadrado = ladoQuadrado*ladoQuadrado;
                System.out.println("A área desse quadrado é: " + areaQuadrado);

                break;

            case 2:
                System.out.println("##### ÁREA DO CÍRCULO #####");
                double pi = 3.14;
                System.out.println("Digite o valor do raio: ");
                double raio = leitor.nextDouble();

                double areaCirculo = pi * (raio * raio);
                System.out.println("A área desse circulo é: " + areaCirculo);

                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
