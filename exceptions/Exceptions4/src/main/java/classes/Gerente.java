/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Gerente extends Funcionario{
    private int equipeSize;
    

    public Gerente(int equipeSize, String nome, String sexo, int id, double salario) throws Salario0Exception {
        super(nome, sexo, id, salario);
        this.equipeSize = equipeSize;
    }
    
    @Override
    public void exibirInformacoes(){
         System.out.println("--------- Dados do Gerente -------");
        super.exibirInformacoes();
        System.out.println("Tamanho da equipe: " + this.equipeSize);
        System.out.println("-------------------------------------");
    }

    public int getSetor() {
        return equipeSize;
    }

    public void setSetor(int equipeSize) {
        this.equipeSize = equipeSize;
    }
    
    @Override
    public void aumentarSalario(){
        double porcentAumento = 0.5 + (0.05*equipeSize);
        super.salario = porcentAumento * salario;
    }

}
