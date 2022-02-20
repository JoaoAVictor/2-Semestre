/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author dener.souza
 */
public class Randomicos {
    public static void main(String[] args) {
        
//        Gerando numero aleatorio se faz como abaixo. LEMBRETE se quiser 100 coloca 101 se não o 100 não entrara no randomico
//          ThreadLocalRandom possui funçoes auxiliares para geração de numeros aleatorios

           Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
       
//       Double numeroAleatorio = ThreadLocalRandom.current().nextDouble(0, 101);
//       boolean numeroAleatorio = ThreadLocalRandom.current().nextboolean(0, 101);
       
        System.out.println(String.format("Numero gerados %d", numeroAleatorio));
        
      
    }
}
