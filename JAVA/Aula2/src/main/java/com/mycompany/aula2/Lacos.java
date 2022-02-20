
package com.mycompany.aula2;

import java.util.Scanner;


public class Lacos {
    public static void main(String[] args) {
        
//        for (int i = 0; i < 10; i++) {
//            System.out.println(String.format("numero gerado %d", i));

Scanner leitor = new Scanner(System.in);
        
                for (int i = 10; i >= 0; i--) {
            System.out.println(String.format("numero gerado %d", i));
            }
        
        System.out.println("Acerte o numero");
        Integer numero = leitor.nextInt();
        
        while (numero != 10) {            
            System.out.println("Errou! tente novamente");
            numero = leitor.nextInt();
        }
        
            System.out.println("PARABENS VC ACERTOU");
     
           Integer cont =0;
            while ( cont <= 10) {            
                System.out.println(String.format("contador %d", cont));
                cont++;
        }
            
            Integer cont2 = 10;
            while (cont2 >= 0) {            
                 System.out.println(String.format("Contador %d", cont2));
                 cont2--;
        }
            
            
            Integer cont3;
            do {            
                System.out.println("Acerte o numero");
            cont3 = leitor.nextInt();
        } while (cont3 != 5);
            System.out.println("acertou");
    }
            

        }

        
    

    

