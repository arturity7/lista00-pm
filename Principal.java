import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] gabarito = new String[8];

        System.out.println("Digite o gabarito da prova (8 respostas): ");
        for (int i = 0; i < 8; i++) {
            System.out.println("Resposta da questao " + (i + 1) + ": ");
            gabarito[i] = input.next();
        }

        int aprovados = 0;

        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.println("Digite o numero do aluno: ");
            int numero = input.nextInt();

            int nota = 0;

            for (int i = 0; i < 8; i++) {
                System.out.println("Resposta do aluno para a questao " + (i + 1) + ": ");
                String resposta = input.next();

                if (resposta.equalsIgnoreCase(gabarito[i])) {
                    nota++;
                }
            }

            if (nota >= 6) {
                aprovados++;
            }

            System.out.println("Aluno: " + numero + " - Nota: " + nota);
        }

        double porcentagem = (aprovados * 100.0) / 10;

        System.out.println("Porcentagem de aprovacao: " + porcentagem + "%");

        input.close();
    }
}
