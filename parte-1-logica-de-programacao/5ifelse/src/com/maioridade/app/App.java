package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variaveis
        String nome;
        int idade;

        //instanciar a classe scanner
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("informe sua idade: ");
        idade= sc.nextInt();

        //verificar a idade
        if(idade >= 18){System.out.println("Usuario: "+nome+" é maior de idade!");}
        else{System.out.println("Usuario: "+nome+" é menor de idade!");}
        sc.close();
    }
}
