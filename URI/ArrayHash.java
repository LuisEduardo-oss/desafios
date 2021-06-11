import java.util.HashMap;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1257
public class ArrayHash { 
    public static void main(String [] args) { 
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        HashMap<Character, Integer> hashMap = new HashMap();
        hashMap.put('A', 0);
        hashMap.put('B', 1);
        hashMap.put('C', 2);
        hashMap.put('D', 3);
        hashMap.put('E', 4);
        hashMap.put('F', 5);
        hashMap.put('G', 6);
        hashMap.put('H', 7);
        hashMap.put('I', 8);
        hashMap.put('J', 9);
        hashMap.put('K', 10);
        hashMap.put('L', 11);
        hashMap.put('M', 12);
        hashMap.put('N', 13);
        hashMap.put('O', 14);
        hashMap.put('P', 15);
        hashMap.put('Q', 16);
        hashMap.put('R', 17);
        hashMap.put('S', 18);
        hashMap.put('T', 19);
        hashMap.put('U', 20);
        hashMap.put('V', 21);
        hashMap.put('W', 22);
        hashMap.put('X', 23);
        hashMap.put('Y', 24);
        hashMap.put('Z', 25);
        
        for (int i = 0; i < N; i++){
            int L = teclado.nextInt();
            String[] strings = new String[L];
            int hash = 0;
            for (int j = 0; j < L; j++){
                strings[j] = teclado.next();
                char[] caracteres = strings[j].toCharArray();
                for (int n = 0; n < caracteres.length; n++){
                    hash += hashMap.get(caracteres[n])+j+n;
                }
            }
            System.out.println(hash);
        }
        
    }
}