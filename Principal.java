import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[6];
        int[] pares = new int[6];
        int[] posicao_pares = new int[6];
        int contador_pares = 0;
        int[] impares = new int[6];
        int[] posicao_impares = new int[6];
        int contador_impares = 0;
        int soma_pares = 0;
        
        System.out.println("Digite 6 números inteiros: ");
        for(int i = 0; i < 6; i++){
            numeros[i] = input.nextInt();
            
            if(numeros[i] % 2 == 0){
                pares[contador_pares] = numeros[i];
                posicao_pares[contador_pares] = i + 1;
                soma_pares += numeros[i];
                contador_pares++;
            } else{
                impares[contador_impares] = numeros[i];
                posicao_impares[contador_impares] = i + 1;
                contador_impares++;
            }
   
        }

        System.out.println("Relatório: ");
        System.out.println("Os números pares são: ");
        for(int i = 0; i < contador_pares; i++){
            System.out.println("Número " + pares[i] + " na posição " + posicao_pares[i]);
        }
        System.out.println("Soma dos pares = " + soma_pares);
        System.out.println("Os números ímpares são: ");
        for(int i = 0; i < contador_impares; i++){
            System.out.println("Número " + impares[i] + " na posição " + posicao_impares[i]);
        }
        System.out.println("Quantidade de ímpares = " + contador_impares);
        
        input.close();
    }
}
