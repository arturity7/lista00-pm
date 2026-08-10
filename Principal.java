import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner inteiro = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = inteiro.nextInt();

        if (x < 0) {
            System.out.println("Fatorial não existe para número negativo.");
        } else {
            long fatorial = 1;
            for (int i = 2; i <= x; i++) {
                fatorial *= i;
            }
            System.out.println(x + "! = " + fatorial);
        }

        inteiro.close();
    }
}