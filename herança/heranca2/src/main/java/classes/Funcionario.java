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
public class Funcionario {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double salario;
    
    Funcionario(){
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
        this.salario = 0.0;
    }
    
    protected void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }
    
    protected void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome:");
        this.nome = ler.next();

        System.out.print("Sexo:");
        this.sexo = ler.next();
                
        System.out.print("Idade:");
        this.idade = ler.nextInt();

        System.out.print("Salario:");
        this.salario = ler.nextDouble();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
