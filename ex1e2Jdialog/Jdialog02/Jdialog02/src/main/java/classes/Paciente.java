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
public class Paciente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String historicoMedico;

    public Paciente() {
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = "";
        this.historicoMedico = "";
    }
    
    public Paciente(String nome, String cpf, String dataNascimento, String historicoMedico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.historicoMedico = historicoMedico;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento + ", Histórico Médico: " + historicoMedico;
    }
}
