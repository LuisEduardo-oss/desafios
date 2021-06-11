import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1766
public class ElfoDasTrevas{
    
    public static void main(String[] args) throws IOException {
       
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        int T = teclado.nextInt();
        
        for (int i = 0; i < T; i++){
            
            int N = teclado.nextInt(); 
            int M = teclado.nextInt(); 
            
            ArrayList<Rena> renas = new ArrayList();
            for (int j = 0; j < N; j++){
                String nome = teclado.next();
                int peso = teclado.nextInt(), idade = teclado.nextInt();
                double altura = teclado.nextDouble();
                
                renas.add(new Rena(nome, peso, idade, altura));    
            }
            
            ordenaRenas(i+1, M, renas);
        }
        
    }
    
    public static void ordenaRenas(int casoDeTeste, int M, ArrayList<Rena> renas){
        
        for (int i = 0; i < renas.size(); i++){
            for (int j = i+1; j < renas.size(); j++){
                if (renas.get(i).peso < renas.get(j).peso){
                    trocaDados(renas, i, j);
                }else if (renas.get(i).peso == renas.get(j).peso){
                    if (renas.get(i).idade > renas.get(j).idade){ 
                        trocaDados(renas, i, j);
                    }else if (renas.get(i).idade == renas.get(j).idade){
                        if (renas.get(i).altura > renas.get(j).altura){
                            trocaDados(renas, i, j);
                        }else if (renas.get(i).altura == renas.get(j).altura){
                            if (renas.get(i).nome.length() > renas.get(j).nome.length()){
                                trocaDados(renas, i, j);
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println("CENARIO {"+casoDeTeste+"}");
        for (int i = 0; i < M; i++){            
            System.out.println((i+1) + " - " + renas.get(i).nome);
        }
    }
    
    public static void trocaDados(ArrayList<Rena> renas, int i, int j){
        Rena aux = renas.get(i);
        renas.set(i, renas.get(j));
        renas.set(j, aux);
    }
    
    public static class Rena{
        
        String nome;
        int peso, idade;
        double altura;
        
        public Rena(String nome, int peso, int idade, double altura){
            this.nome = nome;
            this.peso = peso;
            this.idade = idade;
            this.altura = altura;
        }
        
    }
    
}