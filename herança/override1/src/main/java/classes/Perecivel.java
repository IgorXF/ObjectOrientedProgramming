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
    private int tempoParaVencer;
		
    public Perecivel(){
        super();
        this.tempoParaVencer = 0;
    }

    public Perecivel(int tempoParaVencer, int codigo, String nome, double custo, double preco, boolean estoque) {
        super(codigo, nome, custo, preco, estoque);
        this.tempoParaVencer = tempoParaVencer;
    }

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Perecivel ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Tempo para Vencer:");
        this.tempoParaVencer = leitor.nextInt();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void imprimir() {
        System.out.println("--------- Dados do Perecivel -------");
        super.imprimir();
        System.out.println("Tempo para Vencer: " + this.tempoParaVencer);
        System.out.println("-------------------------------------");
    }

    public int getTempoParaVencer() {
        return tempoParaVencer;
    }

    public void setTempoParaVencer(int tempoParaVencer) {
        this.tempoParaVencer = tempoParaVencer;
    }

    @Override
    public double calcularCustoAdicional() {
        if (tempoParaVencer < 5) {
            return custo * 0.20; 
        }else if(tempoParaVencer < 10){
            return custo*0.15;
        }
        return 0;
    }

    @Override
    public boolean verificarEstoque() {
        return super.verificarEstoque() && tempoParaVencer > 0;
    }
}
