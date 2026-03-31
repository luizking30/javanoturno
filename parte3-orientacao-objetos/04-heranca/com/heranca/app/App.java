package com.heranca.app;
import java.util.*;
import com.heranca.models.PessoaFisica;
import com.heranca.models.pessoaJuridica;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        empresa.razaoSocial = "alex sa";
        empresa.nomeFantasia = "Kis graça eventos";
        empresa.cnpj = "546465464564";
        empresa.email = "kidsgraca@contato.com.br";
        empresa.telefone = "488965654654";
        empresa.endereco = "campo da esperanca";

        System.out.println("dados do usuario:");

        System.out.println("informe o nome do usuario:");
        usuario.nome = sc.nextLine();

        System.out.println("informe o cpf do usuario");
        usuario.cpf = sc.nextLine();

        System.out.println("informe o email");
        usuario.email = sc.nextLine();
        
        System.out.println("informe o telefone");
        usuario.telefone = sc.nextLine();

        System.out.println("informe o endereço");
        usuario.endereco = sc.nextLine();

        System.out.println("informe idade do usuario");
        usuario.idade = sc.nexInt();

        //
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));

        sc.close();
    }
}
