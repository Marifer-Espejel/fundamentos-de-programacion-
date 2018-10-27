import java.util.*;
public class Ejemplo02{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("nota: ");
   int nota = sc.nextInt();
   if(nota >= 7){
     System.out.println("en hora buena");
     System.out.println("haz aprobado");
    }
    else
      System.out.println("lo siento, ha reprobado");
   }
 }