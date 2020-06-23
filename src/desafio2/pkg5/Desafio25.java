package desafio2.pkg5;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio25 {
    public static void main(String[] args) {
        double pi, a, r;
        Scanner ler = new Scanner(System.in);
        
        pi = 3.14;
        System.out.println("Qual o raio da circunferência?");
        r = ler.nextDouble();
        
        a = pi*Math.pow(r,2);
        
        System.out.println("A área da circunferência é:"+a);
    }
    
}
