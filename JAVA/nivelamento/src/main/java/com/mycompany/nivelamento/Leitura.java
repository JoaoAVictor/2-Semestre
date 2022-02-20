
package com.mycompany.nivelamento;

import java.util.Scanner;


public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("olá," + nomeDigitado);
        
        System.out.println("Digite sua idade");
        Integer idadeDigitada = leitorNumero.nextInt();
        
        System.out.println(idadeDigitada + "Anos");
        
        System.out.println("Digite sua altura");
        Double altura = leitorNumero.nextDouble();
        
        System.out.println("a altura digitada foi " + altura);
        
        
        System.out.println("Digite um numero");
        Integer numero = leitorNumero.nextInt();
        
        System.out.println("o numero digitado foi" + numero);
        
        System.out.println("Digite uma palavra");
        String palavra = leitor.nextLine();
        
        System.out.println("A palavra digitada foi " + palavra);
    }
}
