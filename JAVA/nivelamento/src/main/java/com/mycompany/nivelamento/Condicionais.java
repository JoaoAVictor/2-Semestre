
package com.mycompany.nivelamento;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        
         Scanner leitorNumero = new Scanner(System.in);
         
         System.out.println("Digite um numero");
         
         Integer numeroDigitado = leitorNumero.nextInt();

        if(numeroDigitado > 50 ){ 
            System.out.println(numeroDigitado + "é maior que 50!");
        
        }else if (numeroDigitado < 50){
            System.out.println(numeroDigitado + "é menor que 50 !");
        
        }else {
            System.out.println("numero é igual 50");
          }
        
        String nome = "Dener";
        String nome2 = "Diego";
        
        if(nome.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais");
        }else{
            System.out.println("Os nomes são diferentes");
        }
        
        Boolean naoEhligado = false;
        
        if(!naoEhligado){
            System.out.println("Ligado");
        }else{
            System.out.println("Desligado");
    }
    }
}

    

