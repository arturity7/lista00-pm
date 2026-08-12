import java.util.Scanner
public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        int maior = 0;
        int [] X = new int[n];
        int [] Y = new int[m];
        int [] Z;

        System.out.println("Digite a quantidade de valores (n) para o veotr X: ");
        for(int i = 0; i < n; i++){
            System.out.println("Digite o valor referente ao X ["+ (i) +"]: ");
            X[i] = input.nextInt();
        }

        System.out.println("Digite a quantidade de valores (m) para o vetor Y: ");
        for(int i = 0; i < m; i++){
            System.out.println("Digite o valor referente ao Z ["+ (i) +"]: ");
            Y[i] = input.nextInt();
        }
        
        if(n >= m){
            maior = n;
        }
        if(m >= n){
            maior = m;
        }



        for(int i = 0; i < maior; i++){
            Z[contador] = X[i];
            contador++;
            Z[contador] = Z[i];
            contador++;
        }

        System.out.println("Valores do velor Z: "+ (Z));
    }
}
