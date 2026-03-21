package com.atividade2.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   

        String nome;
        String sala;
        String filme = null;
        int idade;
        int idademinima;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); // limpa buffer

        do {
            idademinima = 0; // resetar

            System.out.println("\nLista de Filmes:");
            System.out.println("1. A Roda Quadrada Livre");
            System.out.println("2. A Volta dos que não foram");
            System.out.println("3. Poeira em Alto Mar");
            System.out.println("4. As Tranas da Vovó");
            System.out.println("5. A Vingança do Peixe Frito");

            System.out.print("Escolha o número do filme: ");
            sala = sc.nextLine();

            switch (sala) {
                case "1":
                    filme = "A Roda Quadrada Livre";
                    idademinima = 0;
                    break;
                case "2":
                    filme = "A Volta dos que não foram";
                    idademinima = 12;
                    break;
                case "3":
                    filme = "Poeira em Alto Mar";
                    idademinima = 14;
                    break;
                case "4":
                    filme = "As Tranas da Vovó";
                    idademinima = 16;
                    break;
                case "5":
                    filme = "A Vingança do Peixe Frito";
                    idademinima = 21;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    idademinima = Integer.MAX_VALUE;
            }

            if (idade < idademinima) {
                System.out.println("Você não tem idade suficiente para este filme!");
            }

        } while (idade < idademinima);

        System.out.println("\nIngresso liberado!");
        System.out.println("Nome: " + nome);
        System.out.println("Filme: " + filme);

        sc.close();
    }
}