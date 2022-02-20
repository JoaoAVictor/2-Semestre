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
public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe numero com casas decimais");
        Double primeiroNum = leitor.nextDouble();
        
        System.out.println("Informe outro numero com casa decimais");
        Double segundoNum = leitor.nextDouble();
        
        System.out.println(primeiroNum + segundoNum);
        System.out.println(primeiroNum - segundoNum);
        System.out.println(primeiroNum * segundoNum);
        System.out.println(primeiroNum / segundoNum);
        
    }
    
}
