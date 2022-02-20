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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu nome");
        String nome = leitor.nextLine();
        
        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?", nome));
        Integer dataNasc = leitor.nextInt();
        
        Integer conta = 2030 - dataNasc;
        
        System.out.println(String.format("Em 2030 você terá %d anos", conta));
        
        
    }
    
}
