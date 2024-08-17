
package com.oo.projescolaheranca.classes;


/**
 *
 * @author igorxf
 */
import java.util.Scanner;

public class Aluno extends Pessoa{
    private String matricula;
    private int anoIngresso;
    
    public Aluno(){
        super();
        this.matricula = "00000";
        this.anoIngresso = 1900;    
    }
    
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("***** preenchendo aluno ******");
        super.preencher();
        
        System.out.print("Informe a matricula:");
        this.matricula = leitor.next();
        System.out.print("Informe o ano de ingresso:");
        this.anoIngresso = leitor.nextInt();       
    }
    
    public void copiar(Aluno outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.anoIngresso = outro.getAnoIngresso();               
            
    }
    
    public void imprimir(){
        System.out.println("---- Dados do aluno ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Ano de ingresso: "+ this.anoIngresso);   
    }            

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    
    
}
