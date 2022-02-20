
package com.mycompany.aula2;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Exercicio7 {
    
    public static void main(String[] args) {
        
        Integer n1;
        Integer aleatorio;
        Integer sorte =0;
        Integer pares =0;
        Integer inpares=0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um numero de 0 a 100");
        n1 = leitor.nextInt();
        
        aleatorio = ThreadLocalRandom.current().nextInt(0, 101);
        
        while (!Objects.equals(aleatorio, n1)) {     
        aleatorio = ThreadLocalRandom.current().nextInt(0, 101);
        sorte++;
        if (aleatorio %2==0) {
                pares++;
            } else if (aleatorio %2==1) {
                inpares++;
            }

        
        }
        
        System.out.println(String.format("Na %d rodada seu numero foi sorteado", sorte));
        System.out.println(String.format("pares %d", pares));
        System.out.println(String.format("impares %d", inpares));
        
        
       
        
        
    }
    
}
