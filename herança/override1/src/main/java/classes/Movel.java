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
    private String material;
		
    public Movel(){
        super();
        this.material = "";
    }

    public Movel(String material, int codigo, String nome, double custo, double preco, boolean estoque) {
        super(codigo, nome, custo, preco, estoque);
        this.material = material;
    }

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Movel ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Material:");
        this.material = leitor.nextLine();
        System.out.println("-------------------------------------");
    }

     @Override
    public void imprimir() {
        System.out.println("--------- Dados do Movel -------");
        super.imprimir();
        System.out.println("Material: " + this.material);
        System.out.println("-------------------------------------");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public double calcularCustoAdicional() {
        if ("Madeira Maciça".equalsIgnoreCase(material)) {
            return custo * 0.2;
        }
        return 0;
    }
    
}
