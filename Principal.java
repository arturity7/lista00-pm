import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] valor_objetos = new double[10];
        int[] quantidade_objetos = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor do objeto " + i + ": ");
            valor_objetos[i] = input.nextDouble();

            System.out.println("Digite a quantidade do objeto " + i + ": ");
            quantidade_objetos[i] = input.nextInt();
        }

        double valor_final = 0;
        int mais_vendido = quantidade_objetos[0];
        int posicao_mais_vendido = 0;

        for (int i = 0; i < 10; i++) {
            double total_objeto = valor_objetos[i] * quantidade_objetos[i];
            valor_final += total_objeto;

            System.out.println("Objeto " + i + ":");
            System.out.println("  Quantidade vendida: " + quantidade_objetos[i]);
            System.out.println("  Valor unitario: R$ " + valor_objetos[i]);
            System.out.println("  Valor total: R$ " + total_objeto);

            if (quantidade_objetos[i] > mais_vendido) {
                mais_vendido = quantidade_objetos[i];
                posicao_mais_vendido = i;
            }
        }

        System.out.println("Valor geral das vendas: R$ " + valor_final);
        System.out.println("Comissao do vendedor: R$ " + (valor_final * 0.05));
        System.out.println("Salario total: R$ " + (545 + valor_final * 0.05));

        System.out.println("Valor do objeto mais vendido: R$ " + valor_objetos[posicao_mais_vendido]);
        System.out.println("Posicao no vetor: " + posicao_mais_vendido);

        input.close();
    }
}
