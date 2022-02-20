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
public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu salario bruto");
        Double salarioBruto = leitor.nextDouble();
        
        System.out.println("Informe quanto gasta de condução");
        Double conducao = leitor.nextDouble();
        
        Double valconducao = ((conducao * 2) * 22);
        Double total = (salarioBruto - 0.03 - valconducao);
       
           
        System.out.println(String.format("Seu salário bruto é %.2f reais, tem um "
                + "total de %.2f reais em descontos e receberá um líquido de %.2f reais"
                , salarioBruto,valconducao,total));
        
        
        
    }
}
