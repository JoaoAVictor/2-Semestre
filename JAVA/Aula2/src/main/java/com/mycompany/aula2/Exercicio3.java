
package com.mycompany.aula2;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
       
//        Integer cont3;
        String loginCerto = "admin";
        String senhaCerta = "bandtec";
        
        
        Scanner leitor = new Scanner(System.in);
        
      System.out.println("Digite o Login");
      String login = leitor.nextLine();

        System.out.println("Digite o Senha");
     String senha = leitor.nextLine();
        
      
    

      while (!"admin".equals(login) && senha != "bandtec") {            
            System.out.println("Errou! tente novamente");
           System.out.println("Digite o Login");
            login = leitor.nextLine();
            System.out.println("Digite o Senha");
            senha = leitor.nextLine();
        }
        
            System.out.println("Bem vindo");
    }
}
