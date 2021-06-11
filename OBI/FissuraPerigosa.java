
import java.util.Scanner;

// https://olimpiada.ic.unicamp.br/pratique/p2/2020/f1/fissura/
public class FissuraPerigosa {
    
    public static String mapa[][];
    public static int N;
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();
        int F = teclado.nextInt();
        
        mapa = new String[N][N];
        for (int i = 0; i < N; i++){
            char[] linha = teclado.next().toCharArray();
            insereCharNoVetor(linha, i);
        }
        
        if (Integer.parseInt(mapa[0][0]) <= F){
            mapa[0][0] = "*";
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    if (i != 0 && j != 0 && Integer.parseInt(mapa[i][j]) <= F){
                        if (mapa[i-1][j-1].equals("*")){
                            mapa[i][j] = "*";
                        }
                    }
                    
                    if (i == 0){
                        if (j == 0 && Integer.parseInt(mapa[i][j+1]) <= F){
                            mapa[i][j+1] = "*";
                        }else{
                            if (j != 0 && mapa[i][j-1].equals("*") && Integer.parseInt(mapa[i][j]) <= F){
                                mapa[i][j] = "*";
                            }
                        }
                    }else{
                        if (j == 0 && mapa[i-1][j].equals("*") && Integer.parseInt(mapa[i][j]) <= F){
                            mapa[i][j] = "*";
                        }else{
                            if ((mapa[i][j-1].equals("*") && !mapa[i][j].equals("*") && Integer.parseInt(mapa[i][j]) <= F)
                                    || (mapa[i-1][j].equals("*") && !mapa[i][j].equals("*") && Integer.parseInt(mapa[i][j]) <= F)){
                                mapa[i][j] = "*";
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void insereCharNoVetor(char[] caracteres, int linha){
        for (int i = 0; i < N; i++){
            mapa[linha][i] = caracteres[i]+"";
        }
    }
    
}
