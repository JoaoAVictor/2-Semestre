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
public class Exercicio1 {
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Quantos anos filhos de 0 a 3 anos você tem");
        Integer idade0a3 = leitor.nextInt();
        
        System.out.println("Quantos filhos vc tem de 4 a 16 anos");
        Integer idade4a16 = leitor.nextInt();
        
        System.out.println("Qunatos filhos vc tem de 17 a 18 anos");
        Integer idade17a18 = leitor.nextInt();
        

        Double valorfilhos1 = (25.12 * idade0a3 + 15.88 * idade4a16 
                + 12.44 * idade17a18);
        
        Integer totalFilhos = (idade0a3 + idade4a16 + idade17a18); 
        
        System.out.println(String.format("total de filhos é %d e vai receber %.2f "
                , totalFilhos, valorfilhos1));
        
        
        
        
       
    }
}
