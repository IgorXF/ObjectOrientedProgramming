/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Produto{
    protected int codigo;
    protected String nome;
    protected double custo;
    protected double preco;
    protected boolean estoque;

    public Produto(int codigo, String nome, double custo, double preco, boolean estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.custo = 0.0;
        this.preco = 0.0;
        this.estoque = false;
    }
    
    public double calcularDesconto() {
        return preco - (preco * 0.03); 
    }

    public double calcularCustoAdicional(){
        return preco*1.01;
    }

    public boolean verificarEstoque() {
        return estoque;
    }

    public void imprimirDetalhes() {
        System.out.println(this.toString());
    }
    

    protected void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Codigo:");
        this.codigo = ler.nextInt();

        System.out.print("Nome:");
        this.nome = ler.next();
                
        System.out.print("Custo:");
        this.custo = ler.nextDouble();

        System.out.print("Preco:");
        this.preco = ler.nextDouble();
        
        System.out.print("Estoque:");
        this.estoque = ler.nextBoolean();
    }
    
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Custo: " + this.custo);
        System.out.println("Preco: " + this.preco);
        System.out.println("Estoque: " + this.estoque);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.codigo);
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.custo) ^ (Double.doubleToLongBits(this.custo) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 43 * hash + (this.estoque ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (Double.doubleToLongBits(this.custo) != Double.doubleToLongBits(other.custo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (this.estoque != other.estoque) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

}
