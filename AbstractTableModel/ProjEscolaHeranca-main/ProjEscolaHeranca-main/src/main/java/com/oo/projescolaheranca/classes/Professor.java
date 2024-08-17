package com.oo.projescolaheranca.classes;

import java.util.Scanner;

/**
 *
 * @author igorxf
 */

public class Professor extends Pessoa{

   private String cpf;

    public Professor() {
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("******* Preenchendo professor ******");
        super.preencher();

        System.out.print("Informe o cpf:");
        this.cpf = leitor.next();
    }

    public void imprimir() {
        System.out.println("--------- Dados do professor -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("-------------------------------------");
    }

    public String imprimirParaString() {
        String saida = "";
        saida = "--------- Dados do professor -------\n"
                + "Nome: " + this.nome + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Idade: " + this.idade + "\n"
                + "CPF: " + this.cpf + "\n"
                + "-------------------------------------\n";
        return saida;
    }

    public void copiar(Professor outro) {
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCpf();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
