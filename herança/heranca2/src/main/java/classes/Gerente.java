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
    private String setor;
    
    public Gerente(){
        super();
        this.setor = "";
    }
    
    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Gerente ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Setor:");
        this.setor = leitor.next();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void imprimir(){
         System.out.println("--------- Dados do Gerente -------");
        super.imprimir();
        System.out.println("Setor: " + this.setor);
        System.out.println("-------------------------------------");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
