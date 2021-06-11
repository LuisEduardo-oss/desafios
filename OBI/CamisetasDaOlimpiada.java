import java.util.Scanner;

// https://olimpiada.ic.unicamp.br/pratique/p2/2020/f1/camisetas/
public class CamisetasDaOlimpiada {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int[] tamanhos_preferidos = new int[N];
        
        int qtd_p = 0, qtd_m = 0;
        for (int i = 0; i < N; i++){
            tamanhos_preferidos[i] = teclado.nextInt();
            if (tamanhos_preferidos[i] == 1){
                qtd_p++;
            }else{
                qtd_m++;
            }
        }
        
        int P = teclado.nextInt();
        int M = teclado.nextInt();
        
        if (P == qtd_p && M == qtd_m){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
        
    }
    
}
