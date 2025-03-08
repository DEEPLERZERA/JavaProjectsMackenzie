import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");

        int quantidade = input.nextInt();

        double [] notas = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = input.nextDouble();
        }

        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.printf("Soma: %.2f\n", soma);
        media = (double) soma / quantidade;
        System.out.printf("Média: %.2f\n", media);

        System.out.println("Digite a posição: ");
        int pos = input.nextInt();
        System.out.println("Digite o valor: ");
        notas[pos] = input.nextDouble();

        System.out.printf("Valor novo: %.2f\n", notas[pos]);
    }
}
