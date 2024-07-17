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
public class Secretario extends Funcionario{
    private String secretaria;
    
    public Secretario(){
        super();
        this.secretaria = "";
    }
    
    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Secretario ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Secretaria:");
        this.secretaria = leitor.next();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void imprimir(){
         System.out.println("--------- Dados do Secretario -------");
        super.imprimir();
        System.out.println("Secretaria: " + this.secretaria);
        System.out.println("-------------------------------------");
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }
    
}
