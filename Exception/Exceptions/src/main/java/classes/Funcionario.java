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
    protected int id;
    protected double salario;

    public Funcionario(String nome, String sexo, int id, double salario) throws Salario0Exception{
        this.nome = nome;
        this.sexo = sexo;
        this.id = id;
        setSalario(salario);
    }

    
    protected void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.id);
        System.out.println("Salario: " + this.salario);
    }
    
    protected void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome:");
        this.nome = ler.next();

        System.out.print("Sexo:");
        this.sexo = ler.next();
                
        System.out.print("Idade:");
        this.id = ler.nextInt();

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

    public int getId() {
        return id;
    }

    public void setIdade(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Salario0Exception {
        if(salario<=0){
            throw new Salario0Exception("O Salario precisa ser maior que R$0,00.");
        } else
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", sexo=" + sexo + ", id=" + id + ", salario=" + salario + '}';
    }
    
    public void aumentarSalario(){
        this.salario  = salario + (salario * 0.05);
    }
}
