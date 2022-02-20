
package com.mycompany.nivelamento;

import java.util.Scanner;

public class Interpolacao {
    public static void main(String[] args) {
//        String nome = "Dener";
//        Integer idade = 24;
//        Double altura = 1.70;
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nomeDigitado = leitor.nextLine();
        
        System.err.println("Digite sua idade");
        Integer idadeDigitada = leitorNumero.nextInt();
        
//        Concatenacao

//        System.out.println("Meu nome é " + nome + " Minha idade é " 
//                            + idade + " e tenho " + altura);
        
//        interpolação

//        System.out.println(String.format("Meu nome é %s, tenho %d anos e %.2f ",
//                nome, idade, altura));
        
//        System.out.println(String.format("Meu nome é %s, tenho %d anos e %.2f ",
//                nome, idade, altura));
    }
    
   
}
