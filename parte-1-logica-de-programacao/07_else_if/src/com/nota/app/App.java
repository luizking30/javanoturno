package com.nota.app;


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variaveis
        String nome;
        double nota;

        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("informe o nome do aluno.");
        nome = sc.nextLine();
        System.out.println("informe a nota entre 0 e 10.");
        nota = sc.nextDouble();

        //verifica se a nota e valida
        if(nota >= 0 && nota <= 10){
            if(nota >= 7){
                System.out.println(nome+" esta aprovado");
            }
           else if(nota>= 5){
            System.out.println("recuperação!");
        } 
        else{
            System.out.println("reprovado");
        }
    }
        else{
            System.out.println("invalido");
        }
        //fecha o objeto scanner
        sc.close();
    }

