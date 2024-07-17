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
    private String tipo;
    
    public Engenheiro(){
        super();
        this.tipo = "";
    }
    
    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Engenheiro ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Tipo:");
        this.tipo = leitor.next();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void imprimir(){
         System.out.println("--------- Dados do Engenheiro -------");
        super.imprimir();
        System.out.println("Tipo: " + this.tipo);
        System.out.println("-------------------------------------");
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
