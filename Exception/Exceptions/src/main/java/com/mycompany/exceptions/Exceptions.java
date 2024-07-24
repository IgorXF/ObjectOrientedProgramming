/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptions;

import classes.Funcionario;
import classes.Salario0Exception;

/**
 *
 * @author igorxf
 */
public class Exceptions {

    public static void main(String[] args) {
        try {
            Funcionario f1 = new Funcionario("Marrie", "Feminino",1, 3000.00);
            System.out.println("Funcionário registro: " + f1.getId() + " criado com sucesso");

            Funcionario f2 = new Funcionario("Daemon", "Masculino", 2, 0);
            System.out.println("Funcionário registro: " + f2.getId() + " criado com sucesso");
        } catch (Salario0Exception e) {
            System.err.println("Erro na criação de funcionário: " + e.getMessage());
        }
    }
}
