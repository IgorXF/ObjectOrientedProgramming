/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


/**
 *
 * @author igorxf
 */
public class Diretor extends Funcionario {
    private String areaDeResponsabilidade;
    private double bonusAnual;
    


    public Diretor(String areaDeResponsabilidade, double bonusAnual, String nome, String sexo, int id, double salario) throws Salario0Exception {
        super(nome, sexo, id, salario);
        this.areaDeResponsabilidade = areaDeResponsabilidade;
        this.bonusAnual = bonusAnual;
    }
    
    @Override
    public void exibirInformacoes(){
         System.out.println("--------- Dados do Diretor -------");
        super.exibirInformacoes();
        System.out.println("Area De Responsabilidade : " + this.areaDeResponsabilidade );
        System.out.println("Bonus Anual : " + this.bonusAnual );
        System.out.println("-------------------------------------");
    }

    public String getAreaDeResponsabilidade() {
        return areaDeResponsabilidade;
    }

    public void setAreaDeResponsabilidade(String areaDeResponsabilidade) {
        this.areaDeResponsabilidade = areaDeResponsabilidade;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
    public double calcularBonusAnual(boolean objetivo){
        if(objetivo == true){
            this.bonusAnual = salario * 0.20;
            return bonusAnual;
        }else
            return 0.0;
    }

}
