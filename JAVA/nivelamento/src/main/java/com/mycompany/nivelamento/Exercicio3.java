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
public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe quanto tempo voce passou se aquecendo");
        Integer aquecendo = leitor.nextInt();
        
        System.out.println("Informe quanto tempo voce passou fazendo aeróbico");
        Integer aerobico = leitor.nextInt();
        
        System.out.println("informe quanto tempo de musculação voce fez");
        Integer musculacao = leitor.nextInt();
        
        Integer totalcal = (aquecendo*12 + aerobico * 20 + musculacao * 25 );
        Integer totalex = (aquecendo + aerobico + musculacao);
        
        System.out.println(String.format("Olá, Jorge. Você fez um total de "
                + "%d minutos de exercícios e perdeu cerca de %d calorias", totalex,totalcal));
    }
}
