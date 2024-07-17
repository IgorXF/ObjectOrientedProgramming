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
    protected String codigo;
    protected String nome;
    protected double custo;
    protected double preco;

    public Produto(String codigo, String nome, double custo, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    protected Produto(){
        this.codigo = "";
        this.nome = ""; 
        this.custo = 0.0;
        this.preco = 0.0;
    }

    protected void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Codigo:");
        this.codigo = ler.next();

        System.out.print("Nome:");
        this.nome = ler.next();
                
        System.out.print("Custo:");
        this.custo = ler.nextDouble();

        System.out.print("Preco:");
        this.preco = ler.nextDouble();
    }
    
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Custo: " + this.custo);
        System.out.println("Preco: " + this.preco);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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


    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", custo=" + custo + ", preco=" + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.codigo);
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.custo) ^ (Double.doubleToLongBits(this.custo) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
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
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

}
