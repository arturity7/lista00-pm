import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] vendas = new int[12][4];
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite as vendas da semana " + (j + 1) + " do mês de " + meses[i] + ": ");
                vendas[i][j] = input.nextInt();
            }
        }

        int[] total_mes = new int[12];
        int[] total_semana = new int[4];
        int total_ano = 0;

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 4; j++){
                total_mes[i] += vendas[i][j];
                total_semana[j] += vendas[i][j];
                total_ano += vendas[i][j];
            }
        }

        System.out.println("Relatório: ");

        for(int i = 0; i < 12; i++){
            System.out.println("Total de vendas de " + meses[i] + " = " + total_mes[i]);
        }

        for(int j = 0; j < 4; j++){
            System.out.println("Total vendido na semana " + (j + 1) + " durante todo o ano = " + total_semana[j]);
        }

        System.out.println("Total de vendas do ano = " + total_ano);

        input.close();
    }
}
