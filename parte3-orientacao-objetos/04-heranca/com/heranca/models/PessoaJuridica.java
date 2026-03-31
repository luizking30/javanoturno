package com.heranca.models;

public class PessoaJuridica {
    public String razaoSocial;
    public String nomeFantasia;
    public String npj;
    public String website;

    punlic PessoaJuridica(){}
    
    public String recepcionar(String nome){
        return "prazer,"+nome+"somos a empresa"+ this.nomeFantasia+".";
    }
}
