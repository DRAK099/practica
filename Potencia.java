
package recursividad;
import java.util.Scanner;
public class Potencia {
        private static Scanner sc=new Scanner(System.in);
        public static void main(String []args){
            
            System.out.println("DIGITE NUMERO BASE: ");
            int base=sc.nextInt();
            System.out.println("\n DIGITE NUMERO EXPONENTE: ");
            int exponente=sc.nextInt();
            
            System.out.println("EL RESULTADO ES: "+Potencia(base, exponente));
        
        }
        public static int Potencia(int base, int exponente){
            if(exponente==0){
                return 1;
            } else {
                return base * Potencia(base, exponente -1);
            }
        }
}
