import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores (n) para o vetor X: ");
        int n = input.nextInt();
        int[] X = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor referente ao X [" + (i) + "]: ");
            X[i] = input.nextInt();
        }

        System.out.println("Digite a quantidade de valores (m) para o vetor Y: ");
        int m = input.nextInt();
        int[] Y = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Digite o valor referente ao Y [" + (i) + "]: ");
            Y[i] = input.nextInt();
        }

        int maior;
        if (n >= m) {
            maior = n;
        } else {
            maior = m;
        }

        int[] Z = new int[n + m];
        int contador = 0;

        for (int i = 0; i < maior; i++) {
            if (i < n) {
                Z[contador] = X[i];
                contador++;
            }
            if (i < m) {
                Z[contador] = Y[i];
                contador++;
            }
        }

        System.out.println("Valores do vetor Z: ");
        for (int i = 0; i < Z.length; i++) {
            System.out.println("Z [" + (i) + "] = " + Z[i]);
        }

        input.close();
    }
}
