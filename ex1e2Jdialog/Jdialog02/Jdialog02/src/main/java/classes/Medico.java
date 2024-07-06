/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author igorxf
 */

@XmlRootElement
public class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private String horariosDisponiveis;

    public Medico() {
        this.nome = "";
        this.crm = "";
        this.especialidade = "";
        this.horariosDisponiveis = "";
    }
    
    public Medico(String nome, String crm, String especialidade, String horariosDisponiveis) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.horariosDisponiveis = horariosDisponiveis;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(String horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    @Override
    public String toString() {
        return "Medico: " + nome + ", CRM: " + crm + ", Especialidade: " + especialidade + ", Horários Disponíveis: " + horariosDisponiveis;
    }
}
