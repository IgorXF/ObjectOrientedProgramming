/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.override2;

import classes.Diretor;
import classes.Engenheiro;
import classes.Funcionario;
import classes.Gerente;
import classes.Secretario;

/**
 *
 * @author igorxf
 */
public class Override2 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Alice", "Feminino", 40,50000.0);
        Engenheiro engenheiro = new Engenheiro("Software", "Bob", "Masculino", 33, 70000.0);
        Diretor diretor = new Diretor("Tecnologia", 0.2, "Carlos", "Masculino", 22, 100000.0);
        Secretario secretario = new Secretario("Inglês e Espanhol", "Diana", "Feminino", 19, 3000.0);
        Gerente gerente = new Gerente(10, "Eduardo", "Masculino", 40, 80000.0);

        funcionario.aumentarSalario();
        engenheiro.aumentarSalario();
        diretor.aumentarSalario();
        diretor.calcularBonusAnual(true);
        secretario.organizarAgenda();
        gerente.aumentarSalario();


        engenheiro.exibirInformacoes();
        System.out.println(engenheiro);

        diretor.exibirInformacoes();
        System.out.println(diretor);

        secretario.exibirInformacoes();
        System.out.println(secretario);

        gerente.exibirInformacoes();
        System.out.println(gerente);


    }
}
