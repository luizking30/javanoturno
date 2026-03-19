package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        String result;
        int idade;

        //instaciar a classe scanner
        Scanner sc = new Scanner(System.in);

        //edtrada de dados
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        //processamento de dados
        result = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        //saida de dados
        System.out.println("Olá " + nome + ", você é " + result + ".");


        sc.close();


    }
}
