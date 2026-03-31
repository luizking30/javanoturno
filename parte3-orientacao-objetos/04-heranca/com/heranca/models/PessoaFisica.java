package com.heranca.models;

public class PessoaFisica {
    public String nome;
    public String cpf;
    public int idade;

    public PessoaFisica(){}

    public String apresentar(){
        return ("ola, meu nome e "+this.nome+"Prazer");
    }

}
