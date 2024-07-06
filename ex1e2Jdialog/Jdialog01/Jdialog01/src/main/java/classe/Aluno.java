/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.Objects;


public class Aluno {
    private String nome;
    private String idade;
    private String matricula;
    private String anoIngresso;

    public Aluno(String nome, String idade, String matricula, String anoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }
    
    public Aluno() {
        this.nome = "";
        this.idade = "";
        this.matricula = "";
        this.anoIngresso = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.idade);
        hash = 17 * hash + Objects.hashCode(this.matricula);
        hash = 17 * hash + Objects.hashCode(this.anoIngresso);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.anoIngresso, other.anoIngresso);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + ", anoIngresso=" + anoIngresso + '}';
    }    
}
