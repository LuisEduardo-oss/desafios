import java.util.Scanner;

public class DigitoUnico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String string = teclado.next();
        int K = teclado.nextInt();
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            stringBuilder.append(string);
        }
        string = stringBuilder.toString();
        System.out.println(DigitoUnico.digitoUnico(string.toCharArray()));
    }
    
    public static int digitoUnico(char[] sequenciaDigitos){
        if (sequenciaDigitos.length == 1){
            return Character.getNumericValue(sequenciaDigitos[0]);
        }
        int digito = 0;
        for (int i = 0; i < sequenciaDigitos.length; i++){
            digito += Character.getNumericValue(sequenciaDigitos[i]);
        }
        return digito;
    }
    
}