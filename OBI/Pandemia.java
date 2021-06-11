import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// https://olimpiada.ic.unicamp.br/pratique/p2/2020/f1/pandemia/
public class Pandemia {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int M = teclado.nextInt(); 
        
        int I = teclado.nextInt(); 
        int R = teclado.nextInt(); 
        
        ArrayList<ArrayList<Integer>> participantes_reunioes = new ArrayList(); 
        ArrayList<Integer> infectados = new ArrayList();
        for (int i = 1; i <= M; i++){
            int A = teclado.nextInt();
            ArrayList<Integer> participantes_reunioes_j = new ArrayList();
            for (int j = 1; j <= A; j++){
                int amigo = teclado.nextInt();
                participantes_reunioes_j.add(amigo);
            }
            participantes_reunioes.add(participantes_reunioes_j);
            
            if (i == R){
                infectados = participantes_reunioes.get(R-1);
            }
        }
        
        
        for (int i = R; i <= M; i++){
            ArrayList<Integer> participantes_reunioes_i = participantes_reunioes.get(i-1);
            for (int j = 1; j <= participantes_reunioes.get(i-1).size(); j++){
                if (infectados.contains(participantes_reunioes.get(i-1).get(j-1))){
                    infectados.addAll(participantes_reunioes.get(i-1));
                    break;
                }
            }
        }
         
        Set<Integer> cada_infectado = new HashSet(infectados);
        System.out.println(cada_infectado.size());
    }
    
}
