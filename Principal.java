import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

       
        int[] valores = new int[3];
        System.out.println("Digite 3 números: ");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = number.nextInt();
        }

        int x = valores[0];
        int y = valores[1];
        int z = valores[2];
 
       
        int maior;
        if (x >= y && x >= z) {
            maior = x;
        } else if (y >= x && y >= z) {
            maior = y;
        } else {
            maior = z;
        }

        
        int menor;
        if (x <= y && x <= z) {
            menor = x;
        } else if (y <= x && y <= z) {
            menor = y;
        } else {
            menor = z;
        }

        System.out.println("O maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);

        
        int limiteInferior;
        int limiteSuperior;

        if (y <= z) {
            limiteInferior = y;
            limiteSuperior = z;
        } else {
            limiteInferior = z;
            limiteSuperior = y;
        }

        if (x >= limiteInferior && x <= limiteSuperior) {
            System.out.println("O X está dentro do intervalo [" + y + ", " + z + "]");
        } else {
            System.out.println("O X está fora do intervalo [" + y + ", " + z + "]");
        }

        
        if (y == 0 || z == 0) {
            System.out.println("Não dá para testar divisibilidade: divisão por zero");
        } else if (x % y == 0 && x % z == 0) {
            System.out.println("X é divisível por Y e por Z");
        } else {
            System.out.println("X não é divisível por Y e por Z");
        }

        number.close();
    }
}
