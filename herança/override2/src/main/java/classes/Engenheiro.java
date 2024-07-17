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
public class Engenheiro extends Funcionario {
    private String areaDeEspecilizacao;
    
    public Engenheiro(){
        super();
        this.areaDeEspecilizacao = "";
    }

    public Engenheiro(String areaDeEspecilizacao, String nome, String sexo, int id, double salario) {
        super(nome, sexo, id, salario);
        this.areaDeEspecilizacao = areaDeEspecilizacao;
    }

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Engenheiro ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Area De Especilizacao:");
        this.areaDeEspecilizacao = leitor.next();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void exibirInformacoes(){
         System.out.println("--------- Dados do Engenheiro -------");
        super.exibirInformacoes();
        System.out.println("Area De Especilizacao: " + this.areaDeEspecilizacao);
        System.out.println("-------------------------------------");
    }
    
    public String getAreaDeEspecilizacao() {
        return areaDeEspecilizacao;
    }

    public void setAreaDeEspecilizacao(String areaDeEspecilizacao) {
        this.areaDeEspecilizacao = areaDeEspecilizacao;
    }

    @Override
    public void aumentarSalario(){
        super.salario = salario + (salario * 0.10);
    }
}
