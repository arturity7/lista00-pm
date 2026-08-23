import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char[] equipes = new char[16];

        for(int i = 0; i < 16; i++){
            equipes[i] = (char)('A' + i);
        }

        int jogo = 1;

        while(equipes.length > 1){
            char[] vencedores = new char[equipes.length / 2];

            for(int i = 0; i < vencedores.length; i++){
                char esquerda = equipes[i * 2];
                char direita = equipes[i * 2 + 1];

                int gols_esquerda;
                int gols_direita;

                do {
                    System.out.println("Jogo " + jogo + " - gols da equipe " + esquerda + ": ");
                    gols_esquerda = input.nextInt();

                    System.out.println("Jogo " + jogo + " - gols da equipe " + direita + ": ");
                    gols_direita = input.nextInt();

                    if(gols_esquerda < 0 || gols_esquerda > 20 || gols_direita < 0 || gols_direita > 20){
                        System.out.println("O número de gols deve estar entre 0 e 20. Digite novamente.");
                    } else if(gols_esquerda == gols_direita){
                        System.out.println("Não pode haver empate. Digite novamente.");
                    }
                } while(gols_esquerda < 0 || gols_esquerda > 20 || gols_direita < 0 || gols_direita > 20 || gols_esquerda == gols_direita);

                if(gols_esquerda > gols_direita){
                    vencedores[i] = esquerda;
                } else {
                    vencedores[i] = direita;
                }

                jogo++;
            }

            equipes = vencedores;
        }

        System.out.println(equipes[0]);

        input.close();
    }
}
