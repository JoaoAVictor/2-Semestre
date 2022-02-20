
package com.mycompany.aula2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroqueijos = 0;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe sua pizza favorita");
            Integer voto = leitor.nextInt();
            
            switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroqueijos++;
                    break;
            }
 
        }
        
        System.out.println(String.format("A mussarela receber %d", mussarela));
        System.out.println(String.format("A calabresa recebeu %d", calabresa));
        System.out.println(String.format("O quatro queijos recebeu %d", quatroqueijos));
        
        if (mussarela > calabresa && mussarela > quatroqueijos) {
            System.out.println("Mussarela é o sabor favorito da galera");
        } else if (calabresa > mussarela && calabresa > quatroqueijos) {
            System.out.println("Calabresa é o sabor favorito da galera");
        } else {
            System.out.println("Quatro queijo é o favorito é o sabor favorito da galera");
    }
}
}
