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
public class Movel extends Produto{
    private String cor;
		
    public Movel(){
        super();
        this.cor = "";
		}

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Movel ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Cor:");
        this.cor = leitor.nextLine();
        System.out.println("-------------------------------------");
    }

     @Override
    public void imprimir() {
        System.out.println("--------- Dados do Movel -------");
        super.imprimir();
        System.out.println("Cor: " + this.cor);
        System.out.println("-------------------------------------");
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
