package com.atividade05.app;
import java.util.Scanner;

import com.atividade05.models.Aluno;
import com.atividade05.models.Professor;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        double b=0;
        double h=0;
        double r=0;
        double a=0;
        String opcao;

        professor.nome = "João";
        professor.mat = "12345";


        System.out.println("Dados do professor:");
        System.out.println("Nome: " + professor.nome);
        System.out.println("Matrícula: " + professor.mat);

        System.out.println("Digite o nome do aluno:");
        aluno.nome = sc.nextLine(); 
        System.out.println("informe o email:");
        aluno.email = sc.nextLine();
        System.out.println("informe a idade:");
        aluno.idade = sc.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - calcular área do triângulo");
        System.out.println("2 - calcular área do círculo");
        System.out.println("3 - resolver equação de 1º grau");

        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Email: " + aluno.email);
        System.out.println("Idade: " + aluno.idade);

        sc.nextLine(); // Limpar o buffer do scanner

        opcao = sc.nextLine();
        switch (opcao) {
            case "1":
                System.out.println("Informe a base do triângulo:");
                b = sc.nextDouble();
                System.out.println("Informe a altura do triângulo:");
                h = sc.nextDouble();
                double areaTriangulo = professor.areaTriangulo(b, h);
                System.out.println("Área do triângulo: " + areaTriangulo);
                break;
            case "2":
                System.out.println("Informe o raio do círculo:");
                r = sc.nextDouble();
                double areaCirculo = professor.areaCirculo(r);
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            case "3":
                System.out.println("Informe o coeficiente a da equação de 1º grau:");
                a = sc.nextDouble();
                System.out.println("Informe o coeficiente b da equação de 1º grau:");
                b = sc.nextDouble();
                double resultadoEquacao = professor.equacao1grau(a, b);
                System.out.println("Resultado da equação de 1º grau: " + resultadoEquacao);
                break;
                default:
                System.out.println("Opção inválida.");
        }

        sc.close();// Fechar o scanner após o uso

    }
}
