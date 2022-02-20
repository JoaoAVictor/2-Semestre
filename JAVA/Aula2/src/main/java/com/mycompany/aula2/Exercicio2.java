
package com.mycompany.aula2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Integer vezes = 0;
        Integer soma = 0;
        
        Scanner leitor = new Scanner(System.in);
        do {          
            
            System.out.println("Digite vários números até ler o número 0 e calcule a soma dos números lidos.");
            soma = leitor.nextInt();
            vezes++;
        } while (soma != 0);
        
        System.out.println(String.format(" foram usados %d Numeros para achar o %d", vezes,soma));
                
              
        
    }
    
}
