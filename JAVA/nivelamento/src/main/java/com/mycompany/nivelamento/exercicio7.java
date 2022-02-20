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
public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o peso limite do elevador");
        Double pesomax = leitor.nextDouble();
        
        System.out.println("Informe o numero maximo de pessoas que podem entrar");
        Integer maxpessoas = leitor.nextInt();
        
        System.out.println("Informe o peso 1ºpessoa que entrou no elevador");
        Double pessoa1 = leitor.nextDouble();
        
        System.out.println("Informe o peso 2ºpessoa que entrou no elevador");
        Double pessoa2 = leitor.nextDouble();
        
        System.out.println("Informe o peso 3ºpessoa que entrou no elevador");
        Double pessoa3 = leitor.nextDouble();
        
       Double pesoTotal = pessoa1 + pessoa2 + pessoa3;
       
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
"O peso total no elevador é de %.2f, sendo que ele suporta %.2f", maxpessoas,pesoTotal,pesomax));
    }
}
