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
public class Eletronico extends Produto {
    private String voltagem;
		
    public Eletronico(){
        super();
        this.voltagem = "";
    }

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Eletronico ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Voltagem:");
        this.voltagem = leitor.nextLine();
        System.out.println("-------------------------------------");
    }
    
     @Override
    public void imprimir() {
        System.out.println("--------- Dados do Eletronico -------");
        super.imprimir();
        System.out.println("Voltagem: " + this.voltagem);
        System.out.println("-------------------------------------");
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

}
