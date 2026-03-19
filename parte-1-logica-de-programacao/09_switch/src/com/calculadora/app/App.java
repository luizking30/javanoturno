package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //estanciar a classe Scanner para ler a entrada do usuário
    Scanner sc = new Scanner(System.in);

    //declaracao de variaveis 
    double num1, num2, resultado;
    String operador;

    //solicitar ao usuário o primeiro número
    System.out.println("Digite o primeiro número: ");         
    num1 = sc.nextDouble();

    //solicitar ao usuário o segundo número
    System.out.println("Digite o segundo número: ");
    num2 = sc.nextDouble();

    //limpeza do buffer do Scanner para evitar problemas na leitura do operador
    sc.nextLine();

    //solicitar ao usuário o operador
    System.out.println("informe a operação desejada");
    System.out.println("1- Soma");
    System.out.println("2- Subtração");
    System.out.println("3- Multiplicação");
    System.out.println("4- Divisão");
    operador = sc.nextLine();

    //verifica a operação desejada
      switch(operador){
        case "1":
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "2":
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "3":
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            break;
        case "4":
            resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
            break; 
        default:
            System.out.println("Operação inválida. Por favor, escolha uma opção válida.");          
      }
    //fecha o Scanner para evitar vazamento de recursos
    sc.close();

    }
}
