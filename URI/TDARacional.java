import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import static java.lang.Math.abs;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1022
public class TDARacional {

    public static int mdc(int a, int b){
        int resto;

        while (b != 0){
            resto = a%b;
            a = b;
            b = resto;
        }
        
        return a;
    }
    
    public static Scanner input;

    public static void main(String[] args) throws IOException {
        
        /*
        1 / 2 + 3 / 4 -> (1*4+3*2)/(2*4) = 10/8
        */
        
        Locale.setDefault(Locale.US);
        input = new Scanner(System.in);
        
        int N = input.nextInt();
        int n1, d1, n2, d2, sim;
        char op;
            
        for (int i = 0; i < N; i++){
            
            n1 = input.nextInt();
            input.next();
            d1 = input.nextInt();
            op = input.next().charAt(0);
            n2 = input.nextInt();
            input.next();
            d2 = input.nextInt();
            
            int n = 1, d = 1;
            switch (op){
                case '+':
                    n = n1*d2+n2*d1;
                    d = d1*d2;
                    
                    sim = mdc(n, d);
                    sim = abs(sim);
                    System.out.println(n+"/"+d + " = " + (n/sim) + "/" + (d/sim));
                    break;
                case '-':
                    n = n1*d2-n2*d1;
                    d = d1*d2;
                    
                    sim = mdc(n, d);
                    sim = abs(sim);
                    System.out.println(n+"/"+d + " = " + (n/sim) + "/" + (d/sim));                   
                    break;
                case '*':
                    n = n1*n2;
                    d = d1*d2;
                    
                    sim = mdc(n, d);
                    sim = abs(sim);
                    System.out.println(n+"/"+d + " = " + (n/sim) + "/" + (d/sim));
                    break;
                case '/':
                    n = n1*d2;
                    d = n2*d1;
                    
                    sim = mdc(n, d);
                    sim = abs(sim);
                    System.out.println(n+"/"+d + " = " + (n/sim) + "/" + (d/sim));
                    break;
            }
            
        }
        
        
        input.close();
        
    }

}