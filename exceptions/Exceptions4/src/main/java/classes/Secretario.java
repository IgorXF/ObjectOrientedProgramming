/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author igorxf
 */
public class Secretario extends Funcionario{
    private String linguasFaladas ;

    public Secretario(String linguasFaladas, String nome, String sexo, int id, double salario) throws Salario0Exception {
        super(nome, sexo, id, salario);
        this.linguasFaladas = linguasFaladas;
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
