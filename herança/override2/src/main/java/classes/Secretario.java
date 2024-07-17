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
public class Secretario extends Funcionario{
    private String linguasFaladas ;
    
    public Secretario(){
        super();
        this.linguasFaladas  = "";
    }

    public Secretario(String linguasFaladas, String nome, String sexo, int id, double salario) {
        super(nome, sexo, id, salario);
        this.linguasFaladas = linguasFaladas;
    }

    @Override
    public void preencher(){
        System.out.println("******* Preenchendo Secretario ******");
        super.preencher();
				
        Scanner leitor = new Scanner(System.in);
        System.out.print("Linguas Faladas:");
        this.linguasFaladas = leitor.next();
        System.out.println("-------------------------------------");
    }
    
    @Override
    public void exibirInformacoes(){
         System.out.println("--------- Dados do Secretario -------");
        super.exibirInformacoes();
        System.out.println("Linguas Faladas: " + this.linguasFaladas);
        System.out.println("-------------------------------------");
    }

    public String getLinguasFaladas() {
        return linguasFaladas;
    }

    public void setLinguasFaladas(String linguasFaladas) {
        this.linguasFaladas = linguasFaladas;
    }
    

    public void organizarAgenda() {
        System.out.println("Agenda organizada");
    }
}
