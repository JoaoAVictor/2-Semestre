
package com.mycompany.aula2;

import java.util.Scanner;


public class NovaCondicao {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero");
        Integer n1 = leitor.nextInt();
        
        System.out.println(n1);
        
//        switch = usar somante numero inteiro, texto não usar (com texto ele faz distinção de maiuscula e minuscula)
        switch (n1) {
            case 1:
                System.out.println("Domingo...");
                break;
            case 2:
                System.out.println("Segunda...");
                break;
            case 3:
                System.out.println("Terça...");
                break;
            case 4:
                System.out.println("Quarta...");
                break;
            case 5:
                System.out.println("Quinta...");
                break;
            case 6:
                System.out.println("Sexta...");
                break;
            case 7:
                System.out.println("Sabado...");
                break;
            default:
                System.out.println("Numero invalido ! Digite um numero de 1 a 7");
                break;
        }
        
        System.out.println("Digite o Ranking");
        Integer ranking = leitor.nextInt();
        
        switch (ranking) {
            case 1:
                System.out.println("Ganhou game");
                break;
            case 2:
                System.out.println("Ganhou jogo");
                break;
            case 3:
                System.out.println("Ganhou in");
                break;
            default:
                throw new AssertionError();
        }
 
        }
    }

