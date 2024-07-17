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
public class Perecivel extends Produto{
    private double peso;
		
    public Perecivel(){
        super();
        this.peso = 0.0;
    }
    
    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Perecivel ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Peso:");
        this.peso = leitor.nextDouble();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void imprimir() {
        System.out.println("--------- Dados do Perecivel -------");
        super.imprimir();
        System.out.println("Peso: " + this.peso);
        System.out.println("-------------------------------------");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
