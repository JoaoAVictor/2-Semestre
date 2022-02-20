
package com.mycompany.aula2;

import java.util.Scanner;


public class Exercicio6 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        Integer n1 = leitor.nextInt();
        
        System.out.println("Informe outro numero");
        Integer n2 = leitor.nextInt();
        
            Integer resultado =1;
//            resultado inicia em um por ser *, so inicia em 0 ser foir + ou -
//                o expoente vai na linha do for, a base vai dentro do laço (resultado*=base)
            for (int i = 0; i < n2; i++) {
            resultado*=n1;
        }
        
        System.out.println(resultado);

    }
    
}
