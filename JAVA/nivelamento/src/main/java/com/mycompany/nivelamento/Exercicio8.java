/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento;

import java.util.Scanner;

/**
 *
 * @author dener.souza
 */
public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu nome");
        String nome = leitor.nextLine();
        
        System.out.println("Informe uma nota");
        Double nota1 = leitor.nextDouble();
      
        System.out.println("Informe outra nota");
        Double nota2 = leitor.nextDouble();
        
        Double media = ((nota1+nota2)/2);
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", nome,media));
    }
}
