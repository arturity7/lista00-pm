import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] meses = { "janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };

        double[] ano = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite a temperatura media de " + meses[i] + ": ");
            ano[i] = input.nextDouble();
        }

        double maior = ano[0];
        int mesMaior = 0;
        double menor = ano[0];
        int mesMenor = 0;

        for (int i = 1; i < 12; i++) {
            if (ano[i] > maior) {
                maior = ano[i];
                mesMaior = i;
            }

            if (ano[i] < menor) {
                menor = ano[i];
                mesMenor = i;
            }
        }

        System.out.println("Maior temperatura: " + maior + " - mes: " + meses[mesMaior]);
        System.out.println("Menor temperatura: " + menor + " - mes: " + meses[mesMenor]);

        input.close();
    }
}
