/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betess;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sérgio
 */
public class Input {

 public static String lerString() {
        Scanner ler = new Scanner(System.in);

        System.out.print("> ");

        return ler.nextLine();
    }

 
   public static int lerInteiro() {
        Scanner ler = new Scanner(System.in);

        boolean sucesso = true;
        int res = 0;

        do {
            try {
                res = ler.nextInt();
                sucesso = true;
            } catch (InputMismatchException e) {
                System.err.println("ERRO: Introduza um dígito (" + e + ")");
                ler = new Scanner(System.in);
                sucesso = false;
            } catch (Exception e) {
            }

        } while (!sucesso);

        return res;
    }
  
  public static double lerDouble() {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     double d = 0.0; 
     while(!ok) {
//         try {
             d = input.nextDouble();
             ok = true;
/*         }
         catch(InputMismatchException e) 
             { out.println("Valor real Inválido"); 
               out.print("Novo valor: ");
               input.nextLine(); 
             }
*/
        }
     input.close();
     return d;
  }  
  
   public static float lerFloat() {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     float f = 0.0f; 
     while(!ok) {
         try {
             f = input.nextFloat();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println("Valor real Inválido"); 
               out.print("Novo valor: ");
               input.nextLine(); 
             }
     }
     input.close();
     return f;
  }  
  
   public static boolean lerBoolean() {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     boolean b = false; 
     while(!ok) {
         try {
             b = input.nextBoolean();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println("Booleano Inválido"); 
               out.print("Novo valor: ");
               input.nextLine(); 
             }
     }
     input.close();
     return b;
  } 
  
  public static short lerShort() {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     short s = 0; 
     while(!ok) {
         try {
             s = input.nextShort();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println("Short Inválido"); 
               out.print("Novo valor: ");
               input.nextLine(); 
             }
     }
     input.close();
     return s;
  }
  public static char leChar() throws IOException{
      char c = (char) System.in.read();
      return c;
  }
  
  public static int lerInteiroLimite_2(int a, int b) {

        int res;

        do {
            res = lerInteiro();
        } while (!(res >= a && res <= b));

        return res;
    }
  
  
 

}
