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
    private double consumoEnergia;
		
    public Eletronico(){
        super();
        this.consumoEnergia = 0.0;
    }

    public Eletronico(double consumoEnergia, int codigo, String nome, double custo, double preco, boolean estoque) {
        super(codigo, nome, custo, preco, estoque);
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Eletronico ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Consumo de energia:");  
        this.consumoEnergia = leitor.nextDouble();
        System.out.println("-------------------------------------");
    }
    
     @Override
    public void imprimir() {
        System.out.println("--------- Dados do Eletronico -------");
        super.imprimir();
        System.out.println("Consumo de Energia: " + this.consumoEnergia);
        System.out.println("-------------------------------------");
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    @Override
    public double calcularDesconto() {
        return preco - (preco * 0.07); 
    }

    @Override
    public double calcularCustoAdicional() {
        if(consumoEnergia > 500)
          return custo * 0.05;
        else
          return 0;
    }
}
