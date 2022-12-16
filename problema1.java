import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problema1 {

    public static int numero(int[] secuencia) {
        int numerofinal = 0;
        int num1 = 0;
        for(int i = 0; i<secuencia.length; i++) {
            num1 = secuencia[i];
            numerofinal = (numerofinal * 10) + num1;
        } 
        return(numerofinal); 

    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un numero con cuatro digitos distintos");
        int numero = lector.nextInt();
        while(numero != 6174) {
            int  resto= 0;
            int[] secuencia = new int[4];
    
            for(int i = 0; i<secuencia.length; i++) {
                resto = numero % 10;
                secuencia[i] = resto;
                numero = numero / 10;
    
            }
    
            Arrays.sort(secuencia);
            int[] descendente = new int[4];
            int o = 0;
            for(int i = 3; i>= 0; i--) {
                descendente[o] = secuencia[i];
                o++;
            }
    
           int ord_asc = numero(secuencia);
           int ord_desc = numero(descendente);
    
           int resta = ord_desc - ord_asc;
    
           System.out.println(ord_desc + " - " + ord_asc + " = " + resta);
           numero = resta;
        }
        }

}
