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
public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe o valor do produto");
        Integer valorProd = leitor.nextInt();
        
        System.out.println("Informe a quantidade de produtos vendidos");
        Integer qtdprod = leitor.nextInt();
        
        System.out.println("Informe o valor que pagou");
        Integer valpago = leitor.nextInt();
        
        Integer totalprod_qtd = (valorProd*qtdprod);
        Integer sobra = (valpago - totalprod_qtd);
       
        
        System.out.println(String.format("Seu troco será de R$ %d", sobra));
    
    }
}
