/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

import java.util.Scanner;

/**
 *
 * @author dener.souza
 */
public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Integer cont = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        Integer n1 = leitor.nextInt();
        
        while (cont<10) { 
           cont++;
           Integer res = n1 *(cont+1);
           System.out.println(String.format("%d x %d",n1,cont)); 
        }
        
        
    }
    
}
