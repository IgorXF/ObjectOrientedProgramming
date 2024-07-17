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
public class Diretor extends Funcionario {
    private String departamento;
    
    public Diretor(){
        super();
        this.departamento= "";
    }
    
    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Diretor ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Departamento:");
        this.departamento = leitor.next();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void imprimir(){
         System.out.println("--------- Dados do Diretor -------");
        super.imprimir();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("-------------------------------------");
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
