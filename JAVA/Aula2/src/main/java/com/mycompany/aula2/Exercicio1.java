
package com.mycompany.aula2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Integer vezes = 0;
        Integer random;
        Integer n1;
        
        Scanner leitor = new Scanner(System.in);
        

            do {        
                random = ThreadLocalRandom.current().nextInt(0, 11);
                System.out.println("Informe um numero de 0 a 10");
                n1 = leitor.nextInt();
                vezes++;
        } while (random != n1);
            
            if (vezes < 4) {
            System.out.println("VC é muito sortudo");
        } else if (vezes < 10) {
            System.out.println("VC é sortudo");
        } else {
            System.out.println("Melhor ir trabalhar");
        }
         
    }
    
}
