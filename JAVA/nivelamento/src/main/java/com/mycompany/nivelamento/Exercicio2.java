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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu E-mail: ");
        String login = leitor.nextLine();

        System.out.println("Informe sua senha: ");
        String senha = leitor.nextLine();

        System.out.println("Informe a quantidade de tentativas permitidas: ");
        Integer qtd = leitor.nextInt();

        System.out.println(String.format("Seu login é %s e sua senha é %s. Você "
                + "tem %d tentativas antes de ser bloqueado", login, senha, qtd));

    }
}
